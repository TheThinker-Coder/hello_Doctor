package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;

public class AddAppointment {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;

	// method to save appointment //

	public static int saveAppointment(Appointment apt) {
		int status =0;
		try {
			System.out.println("inside Appointment try blog");
			con = DbConnection.GetConnection();
			sql = Constant.INSERT_Appointment;
			pst = con.prepareStatement(sql);
			pst.setString(1, apt.getPatient_name());
			pst.setString(2, apt.getPatient_email());
			pst.setLong(3, apt.getPatient_mobile());
			pst.setString(4, apt.getDoctorname());
			pst.setString(5, apt.getPatient_appointmentdate());
			pst.setString(6, apt.getPatient_timeofappointment());
			pst.setString(7, apt.getPatient_reasonforappointment());
			pst.setString(8, apt.getCreateddate());
			pst.setString(9, apt.getFileName());
			pst.setString(10, apt.getPath());
			pst.setString(11, apt.getType_of_appointment());
			pst.setString(12, apt.getDoctor_hospital());

			status = pst.executeUpdate();
			
			
			
		}catch (Exception e) {
			System.out.println("inside Appointment catch blog");
			e.printStackTrace();
			System.err.println(e);
		} finally {
			try {
				System.out.println("inside  Appointment finally try blog");
				con.close();
			} catch (SQLException e) {
				System.out.println("inside finally catch blog");
				e.printStackTrace();
				System.err.println(e);
			}
		}

		return status;

	}
}
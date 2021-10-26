package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;

public class EditAppointmentService {
	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;

	public static int updateAppoitment(Appointment apt) {
		System.out.println("InsideUpdateAppoitment service");
		int status = 0;
		System.out.println("status " + status);

		try {
			System.out.println("InsideUpdateAppoitment service try block ");

			con = DbConnection.GetConnection();
			sql = Constant.UPDATEAPPOITMENT;
			pst = con.prepareStatement(sql);
			pst.setString(1, apt.getDoctorfileName());
			pst.setString(2, apt.getDoctorpath());
			pst.setString(3, apt.getPatient_email());
			System.out.println(status);

			status = pst.executeUpdate();
			System.out.println("update " + status);
		} catch (Exception e) {

			System.out.println("InsideUpdateAppoitment service catch block ");
			e.printStackTrace();
			System.out.println(e);
		}
		return status;

	}

}

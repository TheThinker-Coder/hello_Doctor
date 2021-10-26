package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;
import com.sun.org.apache.bcel.internal.generic.RET;

public class ApponintmentDao {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	static ResultSet rst;

	public static Connection getConnection() {

		try {
			System.out.println("inside Apponitment dao conenction");
			Class.forName(Constant.DRIVER);
			con = DriverManager.getConnection(Constant.URL, Constant.USERNAME, Constant.PASSWORDADMIN);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return con;
	}
	
	public static Appointment getRecordbyEmail(String patient_email)
	{
		Appointment appointment =  new Appointment();
		try {
			System.out.println("inside Appointment get record by email");
			con = getConnection();
			sql = "select * from Appointment where patient_email = ?";
			pst = con.prepareStatement(sql);
			pst.setString(1, patient_email );
			rst = pst.executeQuery();
			while (rst.next()) {
				
				appointment.setPatient_id(rst.getInt(1));
				appointment.setPatient_name(rst.getString(2));
				appointment.setPatient_email(rst.getString(3));
				appointment.setPatient_mobile(rst.getLong(4));
				appointment.setDoctorname(rst.getString(5));
				appointment.setPatient_appointmentdate(rst.getString(6));
				appointment.setPatient_timeofappointment(rst.getString(7));
				appointment.setPatient_reasonforappointment(rst.getString(8));
				appointment.setCreateddate(rst.getString(9));
				appointment.setFileName(rst.getString(10));
				appointment.setPath(rst.getString(11));
			}
			}
			
		catch(Exception ex)
		{
			System.out.println("inside Appointment get record by email catch");
			ex.printStackTrace();
			System.out.println(ex);
		}
		return appointment;
		
		
	}
}

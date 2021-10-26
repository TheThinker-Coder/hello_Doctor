package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hello_Doctor.Model.AddHosp;
import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.Model.Contactmodel;
import com.hello_Doctor.constant.Constant;

public class UserDao1 {
	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	static ResultSet rst;

	public static Connection getConnection() {

		try {
			System.out.println("inside updateget conenction");
			Class.forName(Constant.DRIVER);
			con = DriverManager.getConnection(Constant.URL, Constant.USERNAME, Constant.PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return con;
	}

	// get all contact //
	public static List<Contactmodel> getAllContactRecords() {
		List<Contactmodel> Contacttlist = new ArrayList<Contactmodel>();
		System.out.println("contact list method ");
		Contactmodel cnm = null;
		 try {
			 System.out.println("contact try ");
			 con = getConnection();
			 sql = Constant.VIEW_CONTACTQUERY;
			 pst = con.prepareStatement(sql);
			 rst = pst.executeQuery();
			 while(rst.next())
			 {
				 System.out.println("contact while");
				 cnm =new  Contactmodel();
				 cnm.setContact_id(rst.getInt("Contact_id"));
				 cnm.setContact_firstname(rst.getString("contact_firstname"));
				 cnm.setContact_lastname(rst.getString("contact_lastname"));
				 cnm.setContact_email(rst.getString("contact_email"));
				 cnm.setContact_mobile(rst.getLong("contact_mobile"));
				 cnm.setContact_message(rst.getString("contact_message"));
				 Contacttlist.add(cnm);
				 
				 
			 }
			 
			 }catch (Exception e) {
				 System.out.println("contact catch");
				e.printStackTrace();
				System.err.println(e);
			}
		 return Contacttlist;
}

	// get all contact end //

	// get all appontiemt//
	
	

	public static List<Appointment> getAllRecords() {
		List<Appointment> Appointmentlist = new ArrayList<Appointment>();
		Appointment apt = null;
		try {

			con = getConnection();
			sql = Constant.VIEWappointment;
			pst = con.prepareStatement(sql);
			rst = pst.executeQuery();
			while (rst.next()) {
				apt = new Appointment();
				apt.setPatient_id(rst.getInt("patient_id"));
				apt.setPatient_name(rst.getString("patient_name"));
				apt.setPatient_email(rst.getString("patient_email"));
				apt.setDoctorname(rst.getString("doctorname"));
				apt.setPatient_appointmentdate(rst.getString("patient_appointmentdate"));
				apt.setPatient_timeofappointment(rst.getString("patient_timeofappointment"));
				apt.setPatient_reasonforappointment(rst.getString("patient_reasonforappointment"));
				apt.setCreateddate(rst.getString("createddate"));
				Appointmentlist.add(apt);
			}
		} catch (Exception e) {

		}

		return Appointmentlist;
	}

	// get all appontiemt end //

}

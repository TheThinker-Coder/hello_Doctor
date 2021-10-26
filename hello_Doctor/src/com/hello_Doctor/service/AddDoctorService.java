package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;

public class AddDoctorService {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;

	// method to save doctor registration //

	public static int saveDoctor(Doctor_Regi doctor_Regi) {

		System.out.println("Inside save doctorregi");
		int status = 0;
		System.out.println(status);
		try {
			System.out.println("Inside save doctorregi try ");
			con = AdminDbConnection.GetConnection();
			sql = Constant.INSERTDOCTOR_REGISTRATION;
			pst = con.prepareStatement(sql);
			pst.setString(1, doctor_Regi.getDoctor_fullname());
			pst.setString(2, doctor_Regi.getDoctor_email());
			pst.setString(3, doctor_Regi.getDoctor_password());
			pst.setLong(4, doctor_Regi.getDoctor_mobile());
			pst.setString(5, doctor_Regi.getDoctor_specialization());
			pst.setString(6, doctor_Regi.getDoctor_gender());
			pst.setString(7, doctor_Regi.getDoctor_city());
			pst.setString(8, doctor_Regi.getDoctor_state());
			status = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("Inside save doctorregi catch");
			e.printStackTrace();
			System.err.println(e);

		}
		return status;
	}

	// method to save doctor registration end//
}

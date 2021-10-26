package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.constant.Constant;

public class DeleteApponit {
	
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

	
	public static int delete(Appointment adh)
	{
		int status = 0;
		try {
			con= getConnection();
			sql = "delete from appointment where patient_id =?";
			pst = con.prepareStatement(sql);
			pst.setInt(1, adh.getPatient_id());
			status = pst.executeUpdate();
			System.out.println(status);
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return status;
		
	}
	//-- delete end --//
}

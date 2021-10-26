package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;

public class DoctorLoginValdition {
	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	static ResultSet rst;

	public static boolean LoginValdition(String Doctor_email, String Doctor_password) {
		boolean flag = false;
		try {
			System.out.println("inside Loginvaldtion try block");
			con = AdminDbConnection.GetConnection();
			sql = Constant.DOCTOR_LOGIN;
			pst = con.prepareStatement(sql);
			pst.setString(1, Doctor_email);
			pst.setString(2, Doctor_password);
			rst = pst.executeQuery();
			flag = rst.next();
		} catch (Exception e) {
			System.out.println("inside Loginvaldtion catch block");
			e.printStackTrace();
			System.out.println(e);
		} finally {
			try {
				System.out.println("inside Loginvaldtion finally try block");
				con.close();
			} catch (Exception e) {
				System.out.println("inside Loginvaldtion finally catch block");
				e.printStackTrace();
				System.out.println(e);
			}
		}
		return flag; // true
	}
}

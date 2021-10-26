package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;
public class LoginValdition {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	static ResultSet rst;

	public static boolean LoginValdition(String patient_email, String patient_password) {
		boolean flag = false;
		try {
			System.out.println("inside Loginvaldtion try block");
			con = DbConnection.GetConnection();
			sql = Constant.LOGIN;
			pst = con.prepareStatement(sql);
			pst.setString(1, patient_email);
			pst.setString(2, patient_password);
			rst = pst.executeQuery();
			flag = rst.next();

		} catch (Exception e) {
			System.out.println("inside Loginvaldtion catch block");
			e.printStackTrace();
			System.out.println(e);
		}finally {
			try {
				System.out.println("inside Loginvaldtion finally try block");
				con.close();
							}catch (Exception e) {
				System.out.println("inside Loginvaldtion finally catch block");
				e.printStackTrace();
				System.out.println(e);
			}
		}

		return flag; // true
		

	}
}

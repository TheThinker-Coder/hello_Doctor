package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hello_Doctor.Model.Contactmodel;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;

public class ContactUs {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;

	// method to save contact us //
	public static int saveContactUs(Contactmodel contact) {
		int status = 0;
		System.out.println("inside SaveContactUs  block");
		try {
			System.out.println("inside SaveContactUs try block");
			con = DbConnection.GetConnection();
			sql = Constant.INSERT_CONTACTUS;
			pst = con.prepareStatement(sql);
			pst.setString(1, contact.getContact_firstname());
			pst.setString(2, contact.getContact_lastname());
			pst.setString(3, contact.getContact_email());
			pst.setLong(4, contact.getContact_mobile());
			pst.setString(5, contact.getContact_message());
			status = pst.executeUpdate();
		} catch (Exception e) {
			System.out.println("inside SaveContactUs catch blog");
			e.printStackTrace();
			System.err.println(e);
		} finally {
			try {
				System.out.println("inside SaveContactUs finally try blog");
				con.close();
			} catch (SQLException e) {
				System.out.println("inside SaveContactUs finally catch blog");
				e.printStackTrace();
				System.err.println(e);
			}
		}
		return status;
	}

}

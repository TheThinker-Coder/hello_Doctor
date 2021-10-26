package com.hello_Doctor.util;

import java.sql.Connection;
import java.sql.DriverManager;

import com.hello_Doctor.constant.Constant;

public class DbConnection {

	static Connection con = null;

	final static String driver = Constant.DRIVER;
	static final String url = Constant.URL;
	static final String Username = Constant.USERNAME;
	static final String Password = Constant.PASSWORD;

	public static Connection GetConnection() {

		try {
			System.out.println("Inside Driver method");
			Class.forName(driver);
			con = DriverManager.getConnection(url, Username, Password);

		} catch (Exception e) {
			System.out.println("inside Exception blog");
			e.printStackTrace();
			System.out.println(e);
		}
		return con;

	}
}

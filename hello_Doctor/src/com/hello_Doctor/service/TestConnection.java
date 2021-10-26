package com.hello_Doctor.service;

import java.sql.Connection;

import com.hello_Doctor.util.DbConnection;

public class TestConnection {
	
	public static void main(String[] args) {
		try {
			Connection con = DbConnection.GetConnection();
			System.out.println(con);
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}

package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.ForgetPasswordModel;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;

public class ForgetPasswordService {
	 static Connection con = null;
	 static	String sql = null;
	 static PreparedStatement pst;
	 
	public static int Forgetpassword(ForgetPasswordModel forgetpassword)
	{
		int status = 0;
		try {
			con = DbConnection.GetConnection();
			sql =Constant.FORGET_PASSWORD;
			pst =con.prepareStatement(sql);
			pst.setString(1, forgetpassword.getPatient_password());
			pst.setString(2, forgetpassword.getPatient_email());
			status = pst.executeUpdate();
			System.out.println("update " + status);
			
		}catch(Exception ex)
		{
			ex.printStackTrace();
			System.err.println(ex);
			
		}
		return status;
	}

}

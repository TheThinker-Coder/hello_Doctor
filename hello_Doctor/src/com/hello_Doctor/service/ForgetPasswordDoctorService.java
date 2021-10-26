package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.ForgetPasswordDoctorModel;

import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
import com.hello_Doctor.util.DbConnection;

public class ForgetPasswordDoctorService {

	 static Connection con = null;
	 static	String sql = null;
	 static PreparedStatement pst;
	 
	public static int Forgetpassword(ForgetPasswordDoctorModel ForgetPassworddoctorModel)
	{
		int status = 0;
		try {
			con = AdminDbConnection.GetConnection();
			sql =Constant.FORGET_DOCTORPASSWORD;
			pst =con.prepareStatement(sql);
			pst.setString(1, ForgetPassworddoctorModel.getDoctor_password());
			pst.setString(2, ForgetPassworddoctorModel.getDoctor_email());
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


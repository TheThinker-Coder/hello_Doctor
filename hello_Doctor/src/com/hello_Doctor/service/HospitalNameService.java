package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.Model.Hospitalname;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
import com.hello_Doctor.util.DbConnection;

public class HospitalNameService {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	
	
	public static int saveHospital(Hospitalname hsn) {
		int status =0;
		try {
			System.out.println("inside hosptialservice catch");
			
			con = AdminDbConnection.GetConnection();
			sql = Constant.INSERTHOSPITALNAME;
			pst = con.prepareStatement(sql);
			pst.setString(1, hsn.getDoctor_hospital());
			status = pst.executeUpdate();
			
			
			}catch (Exception e) {
				System.out.println("inside hosptialservice catch");
				e.printStackTrace();
				System.err.println(e);
			}
				
			
	return status;
		
	
}
}

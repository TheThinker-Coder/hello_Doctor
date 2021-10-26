package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hello_Doctor.Model.Doctor;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;


public class DoctorService {
	static Connection con = null;
	 static	String sql = null;
	 static PreparedStatement pst ;
	 
	 
	 
	// method to save Patient 
		
		public  static int saveDoctor(Doctor doctor)
		{
			int status = 0;
			try {
				System.out.println("inside add docotr try blog");
			
				con = AdminDbConnection.GetConnection();
				sql = Constant.INSERT_DOCTOR;
				pst = con.prepareStatement(sql);
				
				pst.setString(1, doctor.getDoctor_name());
				pst.setString(2, doctor.getDoctor_speciality());
				pst.setLong(3, doctor.getDoctor_mobile());
				pst.setString(4,doctor.getDoctor_city());
				pst.setString(5, doctor.getDoctor_regino());
				pst.setString(6, doctor.getDoctor_hospital());
		
				status = pst.executeUpdate();
			}catch (Exception e) {
				System.out.println("inside  doctor catch blog");
				e.printStackTrace();
				System.err.println(e);
			}finally {
				try {
					System.out.println("inside  doctor finally try blog");
					con.close();
				} catch (SQLException e) {
					System.out.println("inside  doctor finally catch blog");
					e.printStackTrace();
					System.err.println(e);
				}
			}
			
			return status;
			
		}
		
}

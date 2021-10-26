package com.hello_Doctor.service;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hello_Doctor.Model.*;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
import com.hello_Doctor.util.DbConnection;

public class PatientService {
	 static Connection con = null;
	 static	String sql = null;
	 static PreparedStatement pst ;
	 
	
	 
	 
	 //-- method to view patient end--//

	// method to save Patient //
	
	public  static int savePatient(Patient patient)
	{
		int status = 0;
		try {
			System.out.println("inside paitent try blog");
		
			con = DbConnection.GetConnection();
			sql = Constant.INSERT_PATIENT;
			pst = con.prepareStatement(sql);
			pst.setString(1, patient.getPatient_name());
			pst.setString(2, patient.getPatient_email());
			pst.setLong(3, patient.getPatient_mobile());
			pst.setString(4, patient.getPatient_password());
			status = pst.executeUpdate();
		}catch (Exception e) {
			System.out.println("inside catch blog");
			e.printStackTrace();
			System.err.println(e);
		}finally {
			try {
				System.out.println("inside finally try blog");
				con.close();
			} catch (SQLException e) {
				System.out.println("inside finally catch blog");
				e.printStackTrace();
				System.err.println(e);
			}
		}
		
		return status;
		
	}
	//--update  --//
	public static int update(Patient patient) {
		System.out.println("inside update method");
		int status = 0;
		System.out.println("start " + status);
		try {
			System.out.println("inside update try method");
			con = DbConnection.GetConnection();
			sql = Constant.PATIENT_UPDATE;
			pst = con.prepareStatement(sql);
			pst.setString(1, patient.getPatient_name());
			pst.setString(2, patient.getPatient_email());
			pst.setLong(3, patient.getPatient_mobile());
			pst.setString(4, patient.getPatient_password());
			pst.setInt(5, patient.getPatient_id());
			
			System.out.println("inside update status method");

			System.out.println(status);

			status = pst.executeUpdate();
			System.out.println("update " + status);

		} catch (Exception e) {
			System.out.println("inside update catch method");
			e.printStackTrace();
			System.err.println(e);
		}
		return status;

	}

	
	//-- update end --//
	
}

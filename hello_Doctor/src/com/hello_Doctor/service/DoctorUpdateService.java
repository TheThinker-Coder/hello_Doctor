package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
import com.hello_Doctor.util.DbConnection;

public class DoctorUpdateService {
	 static Connection con = null;
	 static	String sql = null;
	 static PreparedStatement pst ;
	 
	 
	 public static int update(Doctor_Regi doctor_Regi) {
			System.out.println("inside update method");
			int status = 0;
			System.out.println("start " + status);
			try {
				System.out.println("inside update try method");
				con = AdminDbConnection.GetConnection();
				sql = Constant.DOCTOR_UPDATE;
				pst = con.prepareStatement(sql);
				pst.setString(1, doctor_Regi.getDoctor_fullname());
				pst.setString(2, doctor_Regi.getDoctor_email());
				pst.setLong(3, doctor_Regi.getDoctor_mobile());
				pst.setString(4, doctor_Regi.getDoctor_password());
				pst.setInt(5, doctor_Regi.getDoctor_id());
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
}

package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.constant.Constant;

public class DoctorSessionDao {
	private Connection con;
	private ResultSet rst;
	private String sql;
	private PreparedStatement pst;

	public DoctorSessionDao(Connection con) {
		super();
		this.con = con;

	}
	
	
	public Doctor_Regi getDoctorByEmail(String  Doctor_email){
		Doctor_Regi doctor_Regi = null;
		System.out.println("inside session  block ");
		try {
			System.out.println("inside session try block ");
			sql = Constant.VIEWDOCTORBYEMAIL;
			pst = con.prepareStatement(sql);
			pst.setString(1, Doctor_email);
			rst = pst.executeQuery();
			if(rst.next())
			{
				doctor_Regi = new Doctor_Regi();
				
				System.out.println("inside session if  block ");
				doctor_Regi.setDoctor_fullname(rst.getString("Doctor_fullname"));
				doctor_Regi.setDoctor_email(rst.getString("Doctor_email"));
				doctor_Regi.setDoctor_password(rst.getString("Doctor_password"));
				doctor_Regi.setDoctor_mobile(rst.getLong("Doctor_mobile"));
				doctor_Regi.setDoctor_specialization(rst.getString("Doctor_specialization"));
				doctor_Regi.setDoctor_gender(rst.getString("Doctor_gender"));
				doctor_Regi.setDoctor_city(rst.getString("Doctor_city"));
				doctor_Regi.setDoctor_state(rst.getString("Doctor_state"));
			}else
			{
				System.out.println("inside session else  block ");	
			}
			
		}catch (Exception e) {
			System.out.println("inside session catch block ");
			e.printStackTrace();
			System.out.println(e);
		}
		return doctor_Regi;
	}

}

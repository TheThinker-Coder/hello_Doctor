package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.constant.Constant;

public class SessionDao {
	private Connection con;
	private ResultSet rst;
	private String sql;
	private PreparedStatement pst;

	public SessionDao(Connection con) {
		super();
		this.con = con;

	}
	
	public Patient getPatientByEmail(String patient_email){
		Patient patient = null;
		System.out.println("inside session  block ");
		try {
			System.out.println("inside session try block ");
			sql = Constant.VIEWPATIENTBYEMAIL;
			pst = con.prepareStatement(sql);
			pst.setString(1, patient_email);
			rst = pst.executeQuery();
			if(rst.next())
			{
				patient = new Patient();
				
				System.out.println("inside session if  block ");
				patient.setPatient_id(rst.getInt("patient_id"));
				patient.setPatient_name(rst.getString("patient_name"));
				patient.setPatient_email(rst.getString("patient_email"));
				patient.setPatient_mobile(rst.getLong("patient_mobile"));
				patient.setPatient_password(rst.getString("patient_password"));
			}else
			{
				System.out.println("inside session else  block ");	
			}
			
		}catch (Exception e) {
			System.out.println("inside session catch block ");
			e.printStackTrace();
			System.out.println(e);
		}
		
		return patient;
	}
	
	
	public boolean updateUser(Patient patient)
	{
		boolean flag = false;
		try {
			 sql=Constant.PATIENT_UPDATE;
			  pst = con.prepareStatement(sql);
			  pst.setString(1,patient.getPatient_name());
			  pst.setString(2, patient.getPatient_email());
			  pst.setLong(3, patient.getPatient_mobile());
			  pst.setString(4, patient.getPatient_password());
			  pst.setInt(5, patient.getPatient_id());
			  pst.executeUpdate();
			  flag = true;
			  System.out.println(flag);
			  
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		return flag;
		
	}
	

}

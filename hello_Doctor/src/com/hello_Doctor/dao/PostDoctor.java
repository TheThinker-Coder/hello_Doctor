package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hello_Doctor.Model.Doctor;
import com.hello_Doctor.constant.Constant;

public class PostDoctor {
	Connection con;

	public PostDoctor(Connection con) {
		this.con = con;

	}
	
	public List<Doctor> getAllDPost() {
		List<Doctor> list = new ArrayList<>();
		// fetch post
		// fetch post
		try {
			System.out.println("inside docotr fect try");
			String sql =Constant.VIEWDOCOTR;
			PreparedStatement p = con.prepareStatement(sql);
			ResultSet rst =  p.executeQuery();
			while(rst.next())
			{
				String doctor_name = rst.getString("doctor_name");
				String doctor_speciality = rst.getString("doctor_speciality");
				Long doctor_mobile= rst.getLong("doctor_mobile");
				String doctor_city = rst.getString("doctor_city");
				String doctor_hospital = rst.getString("doctor_hospital");
				Doctor  post = new Doctor(doctor_name,doctor_speciality,doctor_mobile,doctor_city,doctor_hospital);
				list.add(post);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
			System.out.println("inside docotr fect catch");
		}
		return list;

	
	}
}

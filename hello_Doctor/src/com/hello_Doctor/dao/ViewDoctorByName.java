package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hello_Doctor.Model.Doctor;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
public class ViewDoctorByName {
	
	public  List<Doctor> list()  {
		List<Doctor> list = new ArrayList<>();
		try {
			Connection con = AdminDbConnection.GetConnection();
			String sql =Constant.VIEWDOCOTR;
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next())
			{
				Doctor d = new Doctor();
				d.setDoctor_id(rst.getLong(1));
				d.setDoctor_name(rst.getString(2));
				d.setDoctor_speciality(rst.getString(3));
				d.setDoctor_mobile(rst.getLong(4));
				d.setDoctor_city(rst.getString(5));
				d.setDoctor_regino(rst.getString(6));
				d.setDoctor_hospital(rst.getString(7));
				list.add(d);
				System.out.println(list);
			}
		}catch (Exception e) {
			
		}
return list;
}
}

	
	


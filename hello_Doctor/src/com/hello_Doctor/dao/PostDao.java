package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class PostDao {
	Connection con;

	public PostDao(Connection con) {
		this.con = con;

	}

	public List<Reciver> getAllRPost() {
		List<Reciver> list = new ArrayList<>();
		// fetch post
		// fetch post
		try {
			String sql = "select * from hospital_details";
			PreparedStatement p = con.prepareStatement(sql);
			ResultSet rst = p.executeQuery();
			while (rst.next()) {
				int hospital_id = rst.getInt("hospital_id");
				String hospital_name = rst.getString("hospital_name");
				Long hospital_no_of_doctor = rst.getLong("hospital_no_of_doctor");
				String hospital_address = rst.getString("hospital_address");
				String hospital_city = rst.getString("hospital_city");
				String hospital_state = rst.getString("hospital_state");
				int hospital_zip = rst.getInt("hospital_zip");
				Long hospital_no_of_beds = rst.getLong("hospital_no_of_beds");
				Long hospital_no_of_icu = rst.getLong("hospital_no_of_icu");
				Long hospital_no_of_ot = rst.getLong("hospital_no_of_ot");
				String hospital_emergency = rst.getString("hospital_emergency");
				Long hospital_contactno = rst.getLong("hospital_contactno");
				Reciver post = new Reciver(hospital_id, hospital_name, hospital_no_of_doctor, hospital_address, hospital_city, hospital_state, hospital_zip, hospital_no_of_beds, hospital_no_of_icu, hospital_no_of_ot, hospital_emergency, hospital_contactno); 
				list.add(post);
				
			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		return list;

	}
}

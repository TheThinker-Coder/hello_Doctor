package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hello_Doctor.Model.Hospitalname;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;;

public class ViewHospitalName {
	
	public  List<Hospitalname> list()  {
		List<Hospitalname> list = new ArrayList<>();
		try {
			Connection con = AdminDbConnection.GetConnection();
			String sql =Constant.VIEWHOSPITAL;
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rst = pst.executeQuery();
			while(rst.next())
			{
				Hospitalname hsp = new Hospitalname();
				hsp.setId(rst.getLong(1));
				hsp.setDoctor_hospital(rst.getString(2));
				list.add(hsp);
				System.out.println(list);
			}
		}catch (Exception e) {
			
		}
return list;
}
}

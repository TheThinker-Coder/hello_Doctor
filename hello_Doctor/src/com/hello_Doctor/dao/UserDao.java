package com.hello_Doctor.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.hello_Doctor.Model.AddHosp;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;

public class UserDao {
	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;
	static ResultSet rst;

	public static Connection getConnection() {

		try {
			System.out.println("inside updateget conenction");
			Class.forName(Constant.DRIVERADMIN);
			con = DriverManager.getConnection(Constant.URLADMIN, Constant.USERNAMEADMIN, Constant.PASSWORDADMIN);
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return con;
	}
	//-- delete hospital --//
	
	public static int delete(AddHosp adh)
	{
		int status = 0;
		try {
			con= getConnection();
			sql = Constant.DELETEHOSPITALDETAILS;
			pst = con.prepareStatement(sql);
			pst.setInt(1, adh.getHospital_id());
			status = pst.executeUpdate();
			
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		return status;
		
	}
	//-- delete end --//
	
	
	


	// --get all records --//
	public static List<AddHosp> getAllRecords() {
		List<AddHosp> Hopstaildetailslist = new ArrayList<AddHosp>();
		AddHosp adh = null;
		try {
			con = getConnection();
			sql = Constant.VIEWHOSPITALDETAILS;
			pst = con.prepareStatement(sql);
			rst = pst.executeQuery();
			while (rst.next()) {
				adh = new AddHosp();
				adh.setHospital_id(rst.getInt("hospital_id"));
				adh.setHospital_name(rst.getString("hospital_name"));
				adh.setHospital_no_of_doctor(rst.getLong("hospital_no_of_doctor"));
				adh.setHospital_address(rst.getString("hospital_address"));
				adh.setHospital_city(rst.getString("hospital_city"));
				adh.setHospital_state(rst.getString("hospital_state"));
				adh.setHospital_zip(rst.getInt("hospital_zip"));
				adh.setHospital_no_of_beds(rst.getLong("hospital_no_of_beds"));
				adh.setHospital_no_of_icu(rst.getLong("hospital_no_of_icu"));
				adh.setHospital_no_of_ot(rst.getLong("hospital_no_of_ot"));
				adh.setHospital_emergency(rst.getString("hospital_emergency"));
				adh.setHospital_contactno(rst.getLong("hospital_contactno"));

				Hopstaildetailslist.add(adh);

			}

		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return Hopstaildetailslist;

	}

	// -- get all end--//

// to view data in table //
	public static AddHosp getRecordById(int hospital_id) {
		AddHosp adh = null;

		try {
			con = getConnection();
			sql = Constant.VIEWHOSPITALDETAILSBYID;
			pst = con.prepareStatement(sql);
			pst.setInt(1, hospital_id);
			rst = pst.executeQuery();
			while (rst.next()) {
				adh = new AddHosp();
				adh.setHospital_id(rst.getInt("hospital_id"));
				adh.setHospital_name(rst.getString("hospital_name"));
				adh.setHospital_no_of_doctor(rst.getLong("hospital_no_of_doctor"));
				adh.setHospital_address(rst.getString("hospital_address"));
				adh.setHospital_city(rst.getString("hospital_city"));
				adh.setHospital_state(rst.getString("hospital_state"));
				adh.setHospital_zip(rst.getInt("hospital_zip"));
				adh.setHospital_no_of_beds(rst.getLong("hospital_no_of_beds"));
				adh.setHospital_no_of_icu(rst.getLong("hospital_no_of_icu"));
				adh.setHospital_no_of_ot(rst.getLong("hospital_no_of_ot"));
				adh.setHospital_emergency(rst.getString("hospital_emergency"));
				adh.setHospital_contactno(rst.getLong("hospital_contactno"));
			}

		} catch (Exception e) {
			// TODO: handle exception
		}
		return adh;
	}

	// to view end//
}

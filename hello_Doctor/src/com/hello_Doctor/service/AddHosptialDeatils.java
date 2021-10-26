package com.hello_Doctor.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.hello_Doctor.Model.AddHosp;
import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.AdminDbConnection;
import com.hello_Doctor.util.DbConnection;

public class AddHosptialDeatils {

	static Connection con = null;
	static String sql = null;
	static PreparedStatement pst;

	// method to save Hosptail_details //

	public static int saveHospitaldetails(AddHosp adh) {
		int status = 0;
		try {
			System.out.println("inside AddHospital try blog");

			con = AdminDbConnection.GetConnection();
			sql = Constant.INSERTHOSPITALDETAILS;
			pst = con.prepareStatement(sql);
			pst.setString(1, adh.getHospital_name());
			pst.setLong(2, adh.getHospital_no_of_doctor());
			pst.setString(3, adh.getHospital_address());
			pst.setString(4, adh.getHospital_city());
			pst.setString(5, adh.getHospital_state());
			pst.setInt(6, adh.getHospital_zip());
			pst.setLong(7, adh.getHospital_no_of_beds());
			pst.setLong(8, adh.getHospital_no_of_icu());
			pst.setLong(9, adh.getHospital_no_of_ot());
			pst.setString(10, adh.getHospital_emergency());
			pst.setLong(11, adh.getHospital_contactno());

			status = pst.executeUpdate();

		} catch (Exception e) {
			System.out.println("inside catch blog");
			e.printStackTrace();
			System.err.println(e);
		} finally {
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

	public static int update(AddHosp adh) {
		System.out.println("inside update method");
		int status = 0;
		System.out.println("start " + status);
		try {
			System.out.println("inside update try method");
			con = AdminDbConnection.GetConnection();
			sql = Constant.UPDATEHOSPITALDETAILS;
			pst = con.prepareStatement(sql);
			pst.setString(1, adh.getHospital_name());
			pst.setLong(2, adh.getHospital_no_of_doctor());
			pst.setString(3, adh.getHospital_address());
			pst.setString(4, adh.getHospital_city());
			pst.setString(5, adh.getHospital_state());
			pst.setInt(6, adh.getHospital_zip());
			pst.setLong(7, adh.getHospital_no_of_beds());
			pst.setLong(8, adh.getHospital_no_of_icu());
			pst.setLong(9, adh.getHospital_no_of_ot());
			pst.setString(10, adh.getHospital_emergency());
			pst.setLong(11, adh.getHospital_contactno());
			pst.setInt(12, adh.getHospital_id());
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

	// method to save Hosptail_details end //

}

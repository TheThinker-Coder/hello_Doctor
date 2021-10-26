package com.hello_Doctor.Model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class UserDao {
		// get user by email
		private Connection con;
	public UserDao(Connection con) {
		super();
		this.con = con;
	}
	public Patient getUserByEmail(String patient_email) {
		Patient patient = null;

		try {
		System.out.println("inside use dao");

			String sql = "select * from patient where patient_email = ?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, patient_email);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				patient = new Patient();
				patient.setPatient_id(rs.getInt("patient_id")); // id 
				patient.setPatient_name(rs.getString("patient_name")); // name 
				patient.setPatient_email(rs.getString("patient_email"));// email 	
				patient.setPatient_mobile(rs.getLong("patient_mobile"));  // mobile
			}

		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println(ex);

		}
		return patient;
	}

}

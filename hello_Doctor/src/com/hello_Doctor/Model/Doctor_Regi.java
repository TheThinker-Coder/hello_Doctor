package com.hello_Doctor.Model;

public class Doctor_Regi {

	private  int Doctor_id;     
	private String Doctor_fullname ;
	private String Doctor_email;
	private String Doctor_password;
	private Long Doctor_mobile;
	private String Doctor_specialization;
	private String Doctor_gender;
	private String Doctor_city;
	private String Doctor_state;
	
	
	
	
	public Doctor_Regi() {
		super();
	}
	public Doctor_Regi(String doctor_fullname, String doctor_email, String doctor_password, Long doctor_mobile,
			String doctor_specialization, String doctor_gender, String doctor_city, String doctor_state) {
		super();
		Doctor_fullname = doctor_fullname;
		Doctor_email = doctor_email;
		Doctor_password = doctor_password;
		Doctor_mobile = doctor_mobile;
		Doctor_specialization = doctor_specialization;
		Doctor_gender = doctor_gender;
		Doctor_city = doctor_city;
		Doctor_state = doctor_state;
	}
	public Doctor_Regi(int doctor_id, String doctor_fullname, String doctor_email, String doctor_password,
			Long doctor_mobile, String doctor_specialization, String doctor_gender, String doctor_city,
			String doctor_state) {
		super();
		Doctor_id = doctor_id;
		Doctor_fullname = doctor_fullname;
		Doctor_email = doctor_email;
		Doctor_password = doctor_password;
		Doctor_mobile = doctor_mobile;
		Doctor_specialization = doctor_specialization;
		Doctor_gender = doctor_gender;
		Doctor_city = doctor_city;
		Doctor_state = doctor_state;
	}
	public int getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		Doctor_id = doctor_id;
	}
	public String getDoctor_fullname() {
		return Doctor_fullname;
	}
	public void setDoctor_fullname(String doctor_fullname) {
		Doctor_fullname = doctor_fullname;
	}
	public String getDoctor_email() {
		return Doctor_email;
	}
	public void setDoctor_email(String doctor_email) {
		Doctor_email = doctor_email;
	}
	public String getDoctor_password() {
		return Doctor_password;
	}
	public void setDoctor_password(String doctor_password) {
		Doctor_password = doctor_password;
	}
	public Long getDoctor_mobile() {
		return Doctor_mobile;
	}
	public void setDoctor_mobile(Long doctor_mobile) {
		Doctor_mobile = doctor_mobile;
	}
	public String getDoctor_specialization() {
		return Doctor_specialization;
	}
	public void setDoctor_specialization(String doctor_specialization) {
		Doctor_specialization = doctor_specialization;
	}
	public String getDoctor_gender() {
		return Doctor_gender;
	}
	public void setDoctor_gender(String doctor_gender) {
		Doctor_gender = doctor_gender;
	}
	public String getDoctor_city() {
		return Doctor_city;
	}
	public void setDoctor_city(String doctor_city) {
		Doctor_city = doctor_city;
	}
	public String getDoctor_state() {
		return Doctor_state;
	}
	public void setDoctor_state(String doctor_state) {
		Doctor_state = doctor_state;
	}
	
	
	
}

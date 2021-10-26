package com.hello_Doctor.Model;

public class Patient {
	
	int patient_id;
	String patient_name ;
	  String patient_email;
	  Long  patient_mobile;
	  String patient_password;
		  	  
	public Patient() {
		super();
	}
	public Patient(String patient_name, String patient_email, Long patient_mobile, String patient_password) {
		super();
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.patient_password = patient_password;
	}
	public Patient(int patient_id, String patient_name, String patient_email, Long patient_mobile,
			String patient_password) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.patient_password = patient_password;
	}
	public int getPatient_id() {
		return patient_id;
	}
	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
	}
	public String getPatient_name() {
		return patient_name;
	}
	public void setPatient_name(String patient_name) {
		this.patient_name = patient_name;
	}
	public String getPatient_email() {
		return patient_email;
	}
	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}
	public Long getPatient_mobile() {
		return patient_mobile;
	}
	public void setPatient_mobile(Long patient_mobile) {
		this.patient_mobile = patient_mobile;
	}
	public String getPatient_password() {
		return patient_password;
	}
	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	  
	  

}

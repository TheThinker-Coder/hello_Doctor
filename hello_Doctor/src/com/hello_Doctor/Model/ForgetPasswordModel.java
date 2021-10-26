package com.hello_Doctor.Model;

public class ForgetPasswordModel {
	private String patient_email;

	private String patient_password;
	
	

	public ForgetPasswordModel() {
		super();
	}

	public ForgetPasswordModel(String patient_email, String patient_password) {
		super();
		this.patient_email = patient_email;
		this.patient_password = patient_password;
	}

	public String getPatient_email() {
		return patient_email;
	}

	public void setPatient_email(String patient_email) {
		this.patient_email = patient_email;
	}

	public String getPatient_password() {
		return patient_password;
	}

	public void setPatient_password(String patient_password) {
		this.patient_password = patient_password;
	}
	
	
	
}

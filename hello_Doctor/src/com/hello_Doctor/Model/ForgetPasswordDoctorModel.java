package com.hello_Doctor.Model;

public class ForgetPasswordDoctorModel {
	private String Doctor_email;

	private String Doctor_password;

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

	public ForgetPasswordDoctorModel() {
		super();
	}

	public ForgetPasswordDoctorModel(String doctor_email, String doctor_password) {
		super();
		Doctor_email = doctor_email;
		Doctor_password = doctor_password;
	}
	
	
}

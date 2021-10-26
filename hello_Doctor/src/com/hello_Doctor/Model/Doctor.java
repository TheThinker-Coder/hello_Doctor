package com.hello_Doctor.Model;

public class Doctor {
	 Long doctor_id;
	 String doctor_name;
	 String doctor_speciality;
	 Long doctor_mobile;
	 String doctor_city;
	 String	doctor_regino;
	 String doctor_hospital;
	 
	 
	 
	
	
	public Long getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(Long doctor_id) {
		this.doctor_id = doctor_id;
	}
	public String getDoctor_name() {
		return doctor_name;
	}
	public void setDoctor_name(String doctor_name) {
		this.doctor_name = doctor_name;
	}
	public String getDoctor_speciality() {
		return doctor_speciality;
	}
	public void setDoctor_speciality(String doctor_speciality) {
		this.doctor_speciality = doctor_speciality;
	}
	public Long getDoctor_mobile() {
		return doctor_mobile;
	}
	public void setDoctor_mobile(Long doctor_mobile) {
		this.doctor_mobile = doctor_mobile;
	}
	public String getDoctor_city() {
		return doctor_city;
	}
	public void setDoctor_city(String doctor_city) {
		this.doctor_city = doctor_city;
	}
	public String getDoctor_regino() {
		return doctor_regino;
	}
	public void setDoctor_regino(String doctor_regino) {
		this.doctor_regino = doctor_regino;
	}
	public String getDoctor_hospital() {
		return doctor_hospital;
	}
	public void setDoctor_hospital(String doctor_hospital) {
		this.doctor_hospital = doctor_hospital;
	}
	public Doctor() {
		super();
	}
	public Doctor(Long doctor_id, String doctor_name, String doctor_speciality, Long doctor_mobile, String doctor_city,
			String doctor_regino, String doctor_hospital) {
		super();
		this.doctor_id = doctor_id;
		this.doctor_name = doctor_name;
		this.doctor_speciality = doctor_speciality;
		this.doctor_mobile = doctor_mobile;
		this.doctor_city = doctor_city;
		this.doctor_regino = doctor_regino;
		this.doctor_hospital = doctor_hospital;
	}
	
	
	
	public Doctor(String doctor_name, String doctor_speciality, Long doctor_mobile, String doctor_city,
			String doctor_regino, String doctor_hospital) {
		super();
		this.doctor_name = doctor_name;
		this.doctor_speciality = doctor_speciality;
		this.doctor_mobile = doctor_mobile;
		this.doctor_city = doctor_city;
		this.doctor_regino = doctor_regino;
		this.doctor_hospital = doctor_hospital;
	}
	//(doctor_name,doctor_speciality,doctor_mobile,doctor_city,doctor_hospital)
	
	public Doctor(String doctor_name, String doctor_speciality, Long doctor_mobile, String doctor_city,
			String doctor_hospital) {
		super();
		this.doctor_name = doctor_name;
		this.doctor_speciality = doctor_speciality;
		this.doctor_mobile = doctor_mobile;
		this.doctor_city = doctor_city;
		this.doctor_hospital = doctor_hospital;
	}
}

package com.hello_Doctor.entity;

public class User {
	private int patient_id;
	private String patient_name;
	private String patient_email;
	private Long patient_mobile;
	private String doctorname;
	private String patient_appointmentdate;
	private String patient_timeofappointment;
	private String patient_reasonforappointment;
	private String Createddate;
	
	
	
	public User() {
		super();
	}
	public User(String patient_name, String patient_email, Long patient_mobile, String doctorname,
			String patient_appointmentdate, String patient_timeofappointment, String patient_reasonforappointment,
			String createddate) {
		super();
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.doctorname = doctorname;
		this.patient_appointmentdate = patient_appointmentdate;
		this.patient_timeofappointment = patient_timeofappointment;
		this.patient_reasonforappointment = patient_reasonforappointment;
		Createddate = createddate;
	}
	public User(int patient_id, String patient_name, String patient_email, Long patient_mobile, String doctorname,
			String patient_appointmentdate, String patient_timeofappointment, String patient_reasonforappointment,
			String createddate) {
		super();
		this.patient_id = patient_id;
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.doctorname = doctorname;
		this.patient_appointmentdate = patient_appointmentdate;
		this.patient_timeofappointment = patient_timeofappointment;
		this.patient_reasonforappointment = patient_reasonforappointment;
		Createddate = createddate;
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
	public String getDoctorname() {
		return doctorname;
	}
	public void setDoctorname(String doctorname) {
		this.doctorname = doctorname;
	}
	public String getPatient_appointmentdate() {
		return patient_appointmentdate;
	}
	public void setPatient_appointmentdate(String patient_appointmentdate) {
		this.patient_appointmentdate = patient_appointmentdate;
	}
	public String getPatient_timeofappointment() {
		return patient_timeofappointment;
	}
	public void setPatient_timeofappointment(String patient_timeofappointment) {
		this.patient_timeofappointment = patient_timeofappointment;
	}
	public String getPatient_reasonforappointment() {
		return patient_reasonforappointment;
	}
	public void setPatient_reasonforappointment(String patient_reasonforappointment) {
		this.patient_reasonforappointment = patient_reasonforappointment;
	}
	public String getCreateddate() {
		return Createddate;
	}
	public void setCreateddate(String createddate) {
		Createddate = createddate;
	}
	
	
}

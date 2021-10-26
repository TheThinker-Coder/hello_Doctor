package com.hello_Doctor.Model;

import java.util.Date;

public class Appointment {

	private int patient_id;
	private String patient_name;
	private String patient_email;
	private Long patient_mobile;
	private String doctorname;
	private String patient_appointmentdate;
	private String patient_timeofappointment;
	private String patient_reasonforappointment;
	private String Createddate;
	private String fileName;
	private String path;
	private String DoctorfileName;
	private String Doctorpath;
	private  String type_of_appointment; 
	private String doctor_hospital;
	
	
	public String getType_of_appointment() {
		return type_of_appointment;
	}
	public void setType_of_appointment(String type_of_appointment) {
		this.type_of_appointment = type_of_appointment;
	}
	public String getDoctor_hospital() {
		return doctor_hospital;
	}
	public void setDoctor_hospital(String doctor_hospital) {
		this.doctor_hospital = doctor_hospital;
	}
	public String getDoctorfileName() {
		return DoctorfileName;
	}
	public void setDoctorfileName(String doctorfileName) {
		DoctorfileName = doctorfileName;
	}
	public String getDoctorpath() {
		return Doctorpath;
	}
	public void setDoctorpath(String doctorpath) {
		Doctorpath = doctorpath;
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
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Appointment() {
		super();
	}
	public Appointment(String patient_name, String patient_email, Long patient_mobile, String doctorname,
			String patient_appointmentdate, String patient_timeofappointment, String patient_reasonforappointment,
			String createddate, String fileName, String path, String doctorfileName, String doctorpath,
			String type_of_appointment, String doctor_hospital) {
		super();
		this.patient_name = patient_name;
		this.patient_email = patient_email;
		this.patient_mobile = patient_mobile;
		this.doctorname = doctorname;
		this.patient_appointmentdate = patient_appointmentdate;
		this.patient_timeofappointment = patient_timeofappointment;
		this.patient_reasonforappointment = patient_reasonforappointment;
		Createddate = createddate;
		this.fileName = fileName;
		this.path = path;
		DoctorfileName = doctorfileName;
		Doctorpath = doctorpath;
		this.type_of_appointment = type_of_appointment;
		this.doctor_hospital = doctor_hospital;
	}
	public Appointment(int patient_id, String patient_name, String patient_email, Long patient_mobile,
			String doctorname, String patient_appointmentdate, String patient_timeofappointment,
			String patient_reasonforappointment, String createddate, String fileName, String path,
			String doctorfileName, String doctorpath, String type_of_appointment, String doctor_hospital) {
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
		this.fileName = fileName;
		this.path = path;
		DoctorfileName = doctorfileName;
		Doctorpath = doctorpath;
		this.type_of_appointment = type_of_appointment;
		this.doctor_hospital = doctor_hospital;
	}
	
	
	
	
	
	
}

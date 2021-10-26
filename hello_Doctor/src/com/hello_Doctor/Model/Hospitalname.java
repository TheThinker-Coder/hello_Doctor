package com.hello_Doctor.Model;

public class Hospitalname {
private long id;
private String doctor_hospital;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getDoctor_hospital() {
	return doctor_hospital;
}
public void setDoctor_hospital(String doctor_hospital) {
	this.doctor_hospital = doctor_hospital;
}
public Hospitalname(long id, String doctor_hospital) {
	super();
	this.id = id;
	this.doctor_hospital = doctor_hospital;
}
public Hospitalname(String doctor_hospital) {
	super();
	this.doctor_hospital = doctor_hospital;
}
public Hospitalname() {
	super();
}



}

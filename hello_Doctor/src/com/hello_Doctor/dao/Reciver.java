package com.hello_Doctor.dao;

public class Reciver {
	int hospital_id;
	 String hospital_name ;
	 Long hospital_no_of_doctor ;
	 String  hospital_address ;
	 String  hospital_city  ;
	 String hospital_state ;
	 int hospital_zip ;
	 Long  hospital_no_of_beds ;
	 Long hospital_no_of_icu  ;
	 Long  hospital_no_of_ot ;
	 String hospital_emergency  ;
	 Long hospital_contactno ;
	 
	 
	 
	public Reciver() {
		super();
	}
	public Reciver(String hospital_name, Long hospital_no_of_doctor, String hospital_address, String hospital_city,
			String hospital_state, int hospital_zip, Long hospital_no_of_beds, Long hospital_no_of_icu,
			Long hospital_no_of_ot, String hospital_emergency, Long hospital_contactno) {
		super();
		this.hospital_name = hospital_name;
		this.hospital_no_of_doctor = hospital_no_of_doctor;
		this.hospital_address = hospital_address;
		this.hospital_city = hospital_city;
		this.hospital_state = hospital_state;
		this.hospital_zip = hospital_zip;
		this.hospital_no_of_beds = hospital_no_of_beds;
		this.hospital_no_of_icu = hospital_no_of_icu;
		this.hospital_no_of_ot = hospital_no_of_ot;
		this.hospital_emergency = hospital_emergency;
		this.hospital_contactno = hospital_contactno;
	}
	public Reciver(int hospital_id, String hospital_name, Long hospital_no_of_doctor, String hospital_address,
			String hospital_city, String hospital_state, int hospital_zip, Long hospital_no_of_beds,
			Long hospital_no_of_icu, Long hospital_no_of_ot, String hospital_emergency, Long hospital_contactno) {
		super();
		this.hospital_id = hospital_id;
		this.hospital_name = hospital_name;
		this.hospital_no_of_doctor = hospital_no_of_doctor;
		this.hospital_address = hospital_address;
		this.hospital_city = hospital_city;
		this.hospital_state = hospital_state;
		this.hospital_zip = hospital_zip;
		this.hospital_no_of_beds = hospital_no_of_beds;
		this.hospital_no_of_icu = hospital_no_of_icu;
		this.hospital_no_of_ot = hospital_no_of_ot;
		this.hospital_emergency = hospital_emergency;
		this.hospital_contactno = hospital_contactno;
	}
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public Long getHospital_no_of_doctor() {
		return hospital_no_of_doctor;
	}
	public void setHospital_no_of_doctor(Long hospital_no_of_doctor) {
		this.hospital_no_of_doctor = hospital_no_of_doctor;
	}
	public String getHospital_address() {
		return hospital_address;
	}
	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}
	public String getHospital_city() {
		return hospital_city;
	}
	public void setHospital_city(String hospital_city) {
		this.hospital_city = hospital_city;
	}
	public String getHospital_state() {
		return hospital_state;
	}
	public void setHospital_state(String hospital_state) {
		this.hospital_state = hospital_state;
	}
	public int getHospital_zip() {
		return hospital_zip;
	}
	public void setHospital_zip(int hospital_zip) {
		this.hospital_zip = hospital_zip;
	}
	public Long getHospital_no_of_beds() {
		return hospital_no_of_beds;
	}
	public void setHospital_no_of_beds(Long hospital_no_of_beds) {
		this.hospital_no_of_beds = hospital_no_of_beds;
	}
	public Long getHospital_no_of_icu() {
		return hospital_no_of_icu;
	}
	public void setHospital_no_of_icu(Long hospital_no_of_icu) {
		this.hospital_no_of_icu = hospital_no_of_icu;
	}
	public Long getHospital_no_of_ot() {
		return hospital_no_of_ot;
	}
	public void setHospital_no_of_ot(Long hospital_no_of_ot) {
		this.hospital_no_of_ot = hospital_no_of_ot;
	}
	public String getHospital_emergency() {
		return hospital_emergency;
	}
	public void setHospital_emergency(String hospital_emergency) {
		this.hospital_emergency = hospital_emergency;
	}
	public Long getHospital_contactno() {
		return hospital_contactno;
	}
	public void setHospital_contactno(Long hospital_contactno) {
		this.hospital_contactno = hospital_contactno;
	}
	 
	 
	 

}

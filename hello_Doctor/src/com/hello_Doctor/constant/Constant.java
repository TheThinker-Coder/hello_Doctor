package com.hello_Doctor.constant;

public class Constant {

	// -- message--//

//--Driver connection--//

	public final static String DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/doctor";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "root";
	
	//--admin connection--//
	
	public final static String DRIVERADMIN = "com.mysql.cj.jdbc.Driver";
	public static final String URLADMIN = "jdbc:mysql://localhost:3306/doctor_admin";
	public static final String USERNAMEADMIN = "root";
	public static final String PASSWORDADMIN = "root";
	
	//--admin connection end--//

	// --Driver connection End --//

	// -- db query--//
	

	public static final String VIEW_PATIENT = "select* from patient";
	
	public static final String PATIENT_UPDATE = "update patient set patient_name=?,patient_email=?,patient_mobile=?,patient_password=? where patient_id=?";
	
	public static final String INSERT_PATIENT = "insert into patient(patient_name,patient_email,patient_mobile,patient_password)values(?,?,?,?)";
	
	public static final String LOGIN = "Select *  from patient where  patient_email=? and patient_password=?";

	public static final String INSERT_DOCTOR = "insert into doctor(doctor_name,doctor_speciality,doctor_mobile,doctor_city,doctor_regino,doctor_hospital)values(?,?,?,?,?,?)";

	public static final String INSERTHOSPITALDETAILS = "insert into hospital_details(hospital_name,hospital_no_of_doctor,hospital_address,hospital_city,hospital_state,hospital_zip,hospital_no_of_beds,hospital_no_of_icu,hospital_no_of_ot,hospital_emergency,hospital_contactno)values(?,?,?,?,?,?,?,?,?,?,?)";
    
	public static final String UPDATEHOSPITALDETAILS ="update hospital_details set hospital_name=?,hospital_no_of_doctor=?,hospital_address=?,hospital_city=?,hospital_state=?,hospital_zip=?,hospital_no_of_beds=?,hospital_no_of_icu=?,hospital_no_of_ot=?,hospital_emergency=?,hospital_contactno=? where hospital_id=?";
	
	public static final String VIEWHOSPITALDETAILSBYID = "select * from hospital_details where hospital_id =?";
	
	public static final String VIEWHOSPITALDETAILS = "select * from hospital_details";
	
	public static final String DELETEHOSPITALDETAILS = "delete from hospital_details where hospital_id =?";
	
	public static final String VIEWPATIENTBYEMAIL = "select * from patient where patient_email = ?";
	
	public static final String INSERT_CONTACTUS = "insert into contactus(contact_firstname,contact_lastname,contact_email,contact_mobile,contact_message)values(?,?,?,?,?)";
	
	public  static final String VIEWDOCOTR ="select * from doctor";
	
	public  static final String VIEWHOSPITAL ="select * from hospitalname";
	
	public  static final String VIEWappointment ="select * from appointment";
	public static final String INSERT_Appointment="insert into appointment(patient_name,patient_email,patient_mobile,doctorname,patient_appointmentdate,patient_timeofappointment,patient_reasonforappointment,Createddate,filename,path,type_of_appointment,doctor_hospital)values(?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public static final String FORGET_PASSWORD ="update patient set patient_password=? where patient_email=?";
	
	public static final String VIEW_CONTACTQUERY = "select * from contactus";
	
	public static final String FORGET_DOCTORPASSWORD ="update doctor_registration set Doctor_password=? where Doctor_email=?";
	
	public static final String INSERTDOCTOR_REGISTRATION= "insert into doctor_registration(Doctor_fullname,Doctor_email,Doctor_password,Doctor_mobile,Doctor_specialization,Doctor_gender,Doctor_city,Doctor_state)values(?,?,?,?,?,?,?,?)";
	
	public static final String DOCTOR_LOGIN = "Select *  from doctor_registration where  Doctor_email=? and Doctor_password=?";
	
	public static final String VIEWDOCTORBYEMAIL = "select * from doctor_registration where Doctor_email = ?";
	
	public  static final String VIEWAPPOINTEMENTBYDOCTOR ="select * from appointment where doctorname = ?";
	
	public static final String UPDATEAPPOITMENT =  "update appointment set doctorfilename =?,doctorpath=? where patient_email=?";
	
	public static String INSERTHOSPITALNAME ="insert into hospitalname(doctor_hospital)values(?)";
	
	public static final String DOCTOR_UPDATE = "update doctor_registration set Doctor_fullname=?,Doctor_email=?,Doctor_mobile=?,Doctor_password=? where Doctor_id=?";
	
	
	
	
	// -- db query end--//
}

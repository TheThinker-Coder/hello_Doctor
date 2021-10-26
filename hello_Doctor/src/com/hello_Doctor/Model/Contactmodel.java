package com.hello_Doctor.Model;



public class Contactmodel {
	
	 int contact_id;
		String contact_firstname;
		String contact_lastname;
		String contact_email ;
		Long contact_mobile;
		String contact_message;

		// default constructor
		public Contactmodel() {
			super();
		}
		// param const
		public Contactmodel(String contact_firstname, String contact_lastname, String contact_email, Long contact_mobile,
				String contact_message) {
			super();
			this.contact_firstname = contact_firstname;
			this.contact_lastname = contact_lastname;
			this.contact_email = contact_email;
			this.contact_mobile = contact_mobile;
			this.contact_message = contact_message;
		}
		public Contactmodel(int contact_id, String contact_firstname, String contact_lastname, String contact_email,
				Long contact_mobile, String contact_message) {
			super();
			this.contact_id = contact_id;
			this.contact_firstname = contact_firstname;
			this.contact_lastname = contact_lastname;
			this.contact_email = contact_email;
			this.contact_mobile = contact_mobile;
			this.contact_message = contact_message;
		}
		// setter and getter 
		public int getContact_id() {
			return contact_id;
		}
		public void setContact_id(int contact_id) {
			this.contact_id = contact_id;
		}
		public String getContact_firstname() {
			return contact_firstname;
		}
		public void setContact_firstname(String contact_firstname) {
			this.contact_firstname = contact_firstname;
		}
		public String getContact_lastname() {
			return contact_lastname;
		}
		public void setContact_lastname(String contact_lastname) {
			this.contact_lastname = contact_lastname;
		}
		public String getContact_email() {
			return contact_email;
		}
		public void setContact_email(String contact_email) {
			this.contact_email = contact_email;
		}
		public Long getContact_mobile() {
			return contact_mobile;
		}
		public void setContact_mobile(Long contact_mobile) {
			this.contact_mobile = contact_mobile;
		}
		public String getContact_message() {
			return contact_message;
		}
		public void setContact_message(String contact_message) {
			this.contact_message = contact_message;
		}
		
		
		
		

	}

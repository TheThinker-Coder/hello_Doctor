package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Contactmodel;
import com.hello_Doctor.service.ContactUs;

@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("inside do contact post");
		PrintWriter out = response.getWriter();
	// call data from web page to post
			
			
			 String contact_firstname  = request.getParameter("fname");
			 String contact_lastname  = request.getParameter("lname");
			 String contact_email   = request.getParameter("email");
			 Long contact_mobile   = Long.parseLong(request.getParameter("mobile"));
			 String contact_message   = request.getParameter("message");
			 // view record from web in console 
			 System.out.println("contact first name "+ contact_firstname);
			 System.out.println("contact last name "+ contact_lastname);
			 System.out.println("contact email "+ contact_email);
			 System.out.println("contact mobile "+ contact_mobile);
			 System.out.println("Message "+ contact_message);
			 
			 // object intalize
			 Contactmodel contact = null;
			 
			 try {
				 System.out.println("inside contact post try object block");
				 contact = new  Contactmodel();
				 contact.setContact_firstname(contact_firstname);
				 contact.setContact_lastname(contact_lastname);
				 contact.setContact_email(contact_email);
				 contact.setContact_mobile(contact_mobile);
				 contact.setContact_message(contact_message);
				 
			 }catch (Exception e) {
				 System.out.println("inside contact post catch object block");
				e.printStackTrace();
				System.err.println(e);
			}
			 try {
				 System.out.println("inside contact post try save block");
				 int status = ContactUs.saveContactUs(contact);
				 if(status>0)
				 {
					 System.out.println("inside contact post if save block");
					 request.getRequestDispatcher("Menu.jsp").include(request, response);
					 
				 }else {
					 System.out.println("inside contact post else save block");
					 request.getRequestDispatcher("Error.jsp").include(request, response);
				 }
				 
			 }catch (Exception e) {
				 System.out.println("inside contact post catch save block");
					e.printStackTrace();
					System.err.println(e);
			}
			 
			 
			 
			 
			 
			 
	}

}

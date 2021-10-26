package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.service.AddDoctorService;

@WebServlet("/Doctor_Registration")
public class Doctor_Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		String Doctor_fullname = request.getParameter("Doctor_fullname");
		String Doctor_email = request.getParameter("Doctor_email");
		String Doctor_password = request.getParameter("Doctor_password");
		long Doctor_mobile = Long.parseLong(request.getParameter("Doctor_mobile"));
		String Doctor_specialization = request.getParameter("Doctor_specialization");
		String Doctor_gender = request.getParameter("Doctor_gender");
		String Doctor_city = request.getParameter("Doctor_city");
		String Doctor_state = request.getParameter("Doctor_state");
		
		// to check in console 
		
		System.out.println(Doctor_fullname);
		System.out.println(Doctor_email);
		System.out.println(Doctor_password);
		System.out.println(Doctor_mobile);
		System.out.println(Doctor_specialization);
		System.out.println(Doctor_gender);
		System.out.println(Doctor_city);
		System.out.println(Doctor_state);
		
		Doctor_Regi doctor_Regi = new Doctor_Regi();
	
		try {
			
			doctor_Regi.setDoctor_fullname(Doctor_fullname);
			doctor_Regi.setDoctor_email(Doctor_email);
			doctor_Regi.setDoctor_password(Doctor_password);
			doctor_Regi.setDoctor_mobile(Doctor_mobile);
			doctor_Regi.setDoctor_specialization(Doctor_specialization);
			doctor_Regi.setDoctor_gender(Doctor_gender);
			doctor_Regi.setDoctor_city(Doctor_city);
			doctor_Regi.setDoctor_state(Doctor_state);
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}try {
			int status = AddDoctorService.saveDoctor(doctor_Regi);
			if(status>0)
			{
				 System.out.println("inside  save if  block");
				 request.getRequestDispatcher("DoctorIndex.jsp").include(request, response);
				
			}else {
				 request.getRequestDispatcher("Error.jsp").include(request, response);
				 System.out.println("data save  successfully for addhos details");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}

		
		
		
	}

}

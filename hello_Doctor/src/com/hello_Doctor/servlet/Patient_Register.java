package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.service.PatientService;

@WebServlet("/Patient_Register")
public class Patient_Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();
		System.out.println("inside do post method");

		// to call data from html to servlete
		String patient_name = request.getParameter("name");
		String patient_email = request.getParameter("email");
		Long patient_mobile = Long.parseLong(request.getParameter("mobile"));
		String patient_password = request.getParameter("password");
		
		// view 
		System.out.println(patient_name);
		System.out.println(patient_email);
		System.out.println(patient_mobile);
		System.out.println(patient_password);
		
		// object set 
		Patient patient = new Patient();
		patient.setPatient_name(patient_name);
		patient.setPatient_email(patient_email);
		patient.setPatient_mobile(patient_mobile);
		patient.setPatient_password(patient_password);
		
		try {
			System.out.println("inside try blog");
			
			//PatientService patientservice = new PatientService();
			
			int status = PatientService.savePatient(patient);
			if(status>0)
			{
				request.getRequestDispatcher("index.html").include(request, response);
			}else
			{
				request.getRequestDispatcher("Error.jsp").include(request, response);
			}
		}catch(Exception e)
		{
			System.out.println("inside catch blog");
			e.printStackTrace();
			System.out.println(e);
			
		}

	}

}

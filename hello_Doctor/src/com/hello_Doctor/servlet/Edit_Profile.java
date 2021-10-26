package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.dao.SessionDao;
import com.hello_Doctor.service.PatientService;
import com.hello_Doctor.util.DbConnection;

/**
 * Servlet implementation class Edit_Profile
 */
@WebServlet("/Edit_Profile")
public class Edit_Profile extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int patient_id = Integer.parseInt(request.getParameter("id"));
		String patient_name = request.getParameter("name");
		String patient_email = request.getParameter("email");
		Long patient_mobile = Long.parseLong(request.getParameter("mobile"));
		String patient_password = request.getParameter("password");
		// session set
				
		
		// view
		System.out.println(patient_name);
		System.out.println(patient_email);
		System.out.println(patient_mobile);
		System.out.println(patient_password);
		Patient patient = null;
		try {
			patient = new Patient();
			patient.setPatient_name(patient_name);
			patient.setPatient_email(patient_email);
			patient.setPatient_mobile(patient_mobile);
			patient.setPatient_password(patient_password);
			patient.setPatient_id(patient_id);
			
		}catch (Exception e) {
		e.printStackTrace();
		System.err.println(e);
		}
		try {
			int status = PatientService.update(patient);
			if(status>0)
			{
				 request.getRequestDispatcher("index.html").include(request, response);
				
			}else
			{
				 request.getRequestDispatcher("Error.jsp").include(request, response);
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		
	}
}

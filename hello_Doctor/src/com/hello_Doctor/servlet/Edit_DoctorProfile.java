package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.Model.Patient;
import com.hello_Doctor.service.DoctorUpdateService;
import com.hello_Doctor.service.PatientService;


@WebServlet("/Edit_DoctorProfile")
public class Edit_DoctorProfile extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		int Doctor_id = Integer.parseInt(request.getParameter("id"));
		String Doctor_fullname = request.getParameter("name");
		String Doctor_email = request.getParameter("email");
		Long Doctor_mobile = Long.parseLong(request.getParameter("mobile"));
		String Doctor_password = request.getParameter("password");
		
		System.out.println(Doctor_fullname);
		System.out.println(Doctor_email);
		System.out.println(Doctor_mobile);
		System.out.println(Doctor_password);
		System.out.println(Doctor_id);
		
		Doctor_Regi doctor_regi = null;
		
		try {
			doctor_regi = new Doctor_Regi();
			doctor_regi.setDoctor_fullname(Doctor_fullname);
			doctor_regi.setDoctor_email(Doctor_email);
			doctor_regi.setDoctor_mobile(Doctor_mobile);
			doctor_regi.setDoctor_password(Doctor_password);
			doctor_regi.setDoctor_id(Doctor_id);
			
		}catch (Exception e) {
		e.printStackTrace();
		System.err.println(e);
		}
		try {
			int status = DoctorUpdateService.update(doctor_regi);
			if(status>0)
			{
				response.sendRedirect("DoctorIndex.jsp");
				
			}else
			{
				response.sendRedirect("Error.jsp");
				
			}
			
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		
	}

		
		
		
	}



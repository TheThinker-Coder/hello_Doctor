package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Doctor;
import com.hello_Doctor.service.DoctorService;

/**
 * Servlet implementation class AddDoctor
 */
@WebServlet("/AddDoctor")
public class AddDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		// call data from web page to post
		System.out.println("inside do post");
		 String doctor_name = request.getParameter("name");
		String doctor_speciality= request.getParameter("speciality");
		Long doctor_mobile= Long.parseLong(request.getParameter("mobile"));
		String doctor_city = request.getParameter("city");
		String doctor_regino = request.getParameter("registrationno");
		String doctor_hospital = request.getParameter("doctor_hospital");
		 System.out.println("inside view ");
		 // view record from web
		 System.out.println(doctor_name);
		 System.out.println(doctor_speciality);
		 System.out.println(doctor_mobile);
		 System.out.println(doctor_city);
		 System.out.println(doctor_regino);
		 System.out.println(doctor_hospital);
		 
		 System.out.println("Inside  object set");
		// object set 
		 Doctor doctor = null;
		 try {
			 System.out.println("inside try object block");
			 doctor = new Doctor();
			 doctor.setDoctor_name(doctor_name);
			 doctor.setDoctor_speciality(doctor_speciality);
			 doctor.setDoctor_mobile(doctor_mobile);
			 doctor.setDoctor_city(doctor_city);
			 doctor.setDoctor_regino(doctor_regino);
			 doctor.setDoctor_hospital(doctor_hospital);
			 
		 }catch (Exception e) {
			 System.out.println("inside catch object block");
			e.printStackTrace();
			System.err.println(e);
		}
		 try {
			 System.out.println("inside  save try object block");
			 int status = DoctorService.saveDoctor(doctor);
			 if(status>0)
			 {
				 System.out.println("inside  save if  block");
				 request.getRequestDispatcher("AddDoctor.jsp").include(request, response);
				 
			 }else {
				 System.out.println("inside  save else  block");
				 request.getRequestDispatcher("Error.jsp").include(request, response);
				 System.out.println("data save  successfully for addhos details");
			}
			 
		 }catch (Exception e) {
			 System.out.println("inside  save catch object block");
				e.printStackTrace();
				System.err.println(e);
			
		}
		 
		
	}

}

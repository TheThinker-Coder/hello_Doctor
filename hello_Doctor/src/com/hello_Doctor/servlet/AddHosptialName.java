package com.hello_Doctor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Hospitalname;
import com.hello_Doctor.service.AddHosptialDeatils;
import com.hello_Doctor.service.HospitalNameService;


@WebServlet("/AddHosptialName")
public class AddHosptialName extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctor_hospital = request.getParameter("doctor_hospital");
		System.out.println(doctor_hospital);
		Hospitalname hsp = null;
		try {
			System.out.println("inside add hopsital servlet try ");
			hsp = new Hospitalname ();
			hsp.setDoctor_hospital(doctor_hospital);
			
		}catch (Exception e) {
			System.out.println("inside add hopsital servlet catch ");
			e.printStackTrace();
			System.err.println(e);

		}
		
		
		try {
			System.out.println("inside add hopsital servlet if try ");
			int status = HospitalNameService.saveHospital(hsp);
			if(status>0)
			{
				 System.out.println("inside  save if  block");
				 request.getRequestDispatcher("AddHosptial.jsp").include(request, response);
			}else {
				
				
			}
			
		}catch (Exception e) {
			System.out.println("inside add hopsital servlet  if catch ");
		}
	
	}

}

package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.AddHosp;
import com.hello_Doctor.service.AddHosptialDeatils;

@WebServlet("/AddHospital")
public class AddHospital extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// call data from web page to post
		System.out.println("inside do post");
		
		String hospital_name = request.getParameter("hospitalname");
		Long hospital_no_of_doctor = Long.parseLong(request.getParameter("noofdoctor"));
		String hospital_address = request.getParameter("address");
		String hospital_city = request.getParameter("city");
		String hospital_state = request.getParameter("state");
		int hospital_zip = Integer.parseInt(request.getParameter("zip"));
		Long hospital_no_of_beds = Long.parseLong(request.getParameter("noofbeds"));
		Long hospital_no_of_icu = Long.parseLong(request.getParameter("nooficu"));
		Long hospital_no_of_ot = Long.parseLong(request.getParameter("noofotavi"));
		String hospital_emergency   = request.getParameter("Emeregency");
		Long  hospital_contactno = Long.parseLong(request.getParameter("Contactnumber"));
		// print data from web to console
		System.out.println("1 hosname"+ hospital_name);
		System.out.println("2 hosdoctornu"+hospital_no_of_doctor);
		System.out.println("3 hosadd"+hospital_address);
		System.out.println("4 hoscity"+hospital_city);
		System.out.println("5 hosstate"+hospital_state);
		System.out.println("6 hoszip"+hospital_zip);
		System.out.println("7 hosnoofbds"+hospital_no_of_beds);
		System.out.println("8 hosof icu "+ hospital_no_of_icu);
		System.out.println("9 hos of avi " +hospital_no_of_ot);
		System.out.println("10 hosemer"+hospital_emergency);
		System.out.println("11 hosco"+hospital_contactno);
		System.out.println("Inside   add hospital object set");
		AddHosp addhosp = null;
		try {
			System.out.println("inside addhosptial try block");
			addhosp = new  AddHosp();
			addhosp.setHospital_name(hospital_name);
			addhosp.setHospital_no_of_doctor(hospital_no_of_doctor);
			addhosp.setHospital_address(hospital_address);
			addhosp.setHospital_city(hospital_city);
			addhosp.setHospital_state(hospital_state);
			addhosp.setHospital_zip(hospital_zip);
			addhosp.setHospital_no_of_beds(hospital_no_of_beds);
			addhosp.setHospital_no_of_icu(hospital_no_of_icu);
			addhosp.setHospital_no_of_ot(hospital_no_of_ot);
			addhosp.setHospital_emergency(hospital_emergency);
			addhosp.setHospital_contactno(hospital_contactno);
		}catch (Exception e) {
			System.out.println("inside addhosptail catch block");
			e.printStackTrace();
			System.err.println(e);
		}
		try {
			System.out.println("inside addhosptail save try block");
			int status = AddHosptialDeatils.saveHospitaldetails(addhosp);
			if(status>0)
			{
				 System.out.println("inside  save if  block");
				 request.getRequestDispatcher("AddHosptialDeatils.jsp").include(request, response);
			}else {
				
				
			}
			
		}catch (Exception e) {
			System.out.println("inside addhosptail save catch block");
			e.printStackTrace();
			System.err.println(e);
		}

	}

}

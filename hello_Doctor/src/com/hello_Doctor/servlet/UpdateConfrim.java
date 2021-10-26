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


@WebServlet("/UpdateConfrim")
public class UpdateConfrim extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out = response.getWriter();
		// call data from web page to post
				System.out.println("inside do post");
				
				String hospital_name = request.getParameter("Hospital_Name");
				Long hospital_no_of_doctor = Long.parseLong(request.getParameter("Hospital_no_of_doctor"));
				String hospital_address = request.getParameter("Hospital_Address");
				String hospital_city = request.getParameter("Hospital_city");
				String hospital_state = request.getParameter("Hospital_state");
				int hospital_zip = Integer.parseInt(request.getParameter("Hospital_zip"));
				Long hospital_no_of_beds = Long.parseLong(request.getParameter("hospital_no_of_beds"));
				Long hospital_no_of_icu = Long.parseLong(request.getParameter("hospital_no_of_icu"));
				Long hospital_no_of_ot = Long.parseLong(request.getParameter("hospital_no_of_ot"));
				String hospital_emergency   = request.getParameter("hospital_emergency");
				Long  hospital_contactno = Long.parseLong(request.getParameter("hospital_contactno"));
				int hospital_id = Integer.parseInt(request.getParameter("hospital_id"));
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
				System.out.println("12 hosid"+hospital_id);
				System.out.println("Inside   add hospital object set");
				AddHosp adh = null;
				try {
					System.out.println("inside addhosptial try block");
					adh = new  AddHosp();
					adh.setHospital_name(hospital_name);
					adh.setHospital_no_of_doctor(hospital_no_of_doctor);
					adh.setHospital_address(hospital_address);
					adh.setHospital_city(hospital_city);
					adh.setHospital_state(hospital_state);
					adh.setHospital_zip(hospital_zip);
					adh.setHospital_no_of_beds(hospital_no_of_beds);
					adh.setHospital_no_of_icu(hospital_no_of_icu);
					adh.setHospital_no_of_ot(hospital_no_of_ot);
					adh.setHospital_emergency(hospital_emergency);
					adh.setHospital_contactno(hospital_contactno);
					adh.setHospital_id(hospital_id);
				}catch (Exception e) {
					System.out.println("inside addhosptailupdate catch block");
					e.printStackTrace();
					System.err.println(e);
				}
				try {
					System.out.println("inside addhosptailupdate save try block");
					int status = AddHosptialDeatils.update(adh);
					if(status>0)
					{
						 System.out.println("inside  save update if  block");
						 request.getRequestDispatcher("AdminPannel.jsp").include(request, response);
					}else {
						 System.out.println("inside  save update else  block");
						 request.getRequestDispatcher("Error.jsp").include(request, response);
						
					}
					
				}catch (Exception e) {
					System.out.println("inside addhosptail save catch block");
					e.printStackTrace();
					System.err.println(e);
				}

			}

		
		
	}



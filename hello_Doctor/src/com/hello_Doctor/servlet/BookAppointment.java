package com.hello_Doctor.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.service.AddAppointment;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@WebServlet("/BookAppointment")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
maxFileSize = 1024 * 1024 * 1000, // 1 GB
maxRequestSize = 1024 * 1024 * 1000)   	// 1 GB
public class BookAppointment extends HttpServlet {
	

	ServletOutputStream os;
@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		 //out = response.getWriter();//.........do not remove comment.
		 os = response.getOutputStream();
		// file upload // 
		  String folderName = "files";
       //  String uploadPath = request.getServletContext().getRealPath("/") + File.separator + folderName;//for netbeans use this code
          String uploadPath = request.getServletContext().getRealPath("") + folderName;//for eclipse use this code
          File dir = new File(uploadPath);
          if (!dir.exists()) {
              dir.mkdirs();
          }
      Part filePart = request.getPart("file");
      InputStream is = filePart.getInputStream();
		
		
		///- file upload end ///
		
		// call data from web page to post
		System.out.println("inside do post");
		String patient_name = request.getParameter("fullname");
		String patient_email = request.getParameter("email");
		Long patient_mobile = Long.parseLong(request.getParameter("mobile"));
		String doctorname = request.getParameter("doctorname");
		String patient_appointmentdate = request.getParameter("date");
		String patient_timeofappointment = request.getParameter("time");
		String patient_reasonforappointment = request.getParameter("reason");
		String type_of_appointment = request.getParameter("type_of_appointment");
		String  doctor_hospital = request.getParameter("doctor_hospital");
		 String fileName = filePart.getSubmittedFileName();
		  System.out.println("Path: " + uploadPath);
		
		Date date = Calendar.getInstance().getTime();
		DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		String Createddate = dateFormat.format(date);
		 Files.copy(is, Paths.get(uploadPath + File.separator + fileName), StandardCopyOption.REPLACE_EXISTING);
	     
	     


		
		
		
		System.out.println("Converted String: " + Createddate);
		// print data from web to console
		System.out.println(patient_name);
		System.out.println(patient_email);
		System.out.println(patient_mobile);
		System.out.println(doctorname);
		System.out.println(patient_appointmentdate);
		System.out.println(patient_timeofappointment);
		System.out.println(patient_reasonforappointment);
		System.out.println(Createddate);
		System.out.println(doctor_hospital);
		System.out.println(type_of_appointment);
		 System.out.println("fileName: " + fileName);
		System.out.println("Inside   add appontiment object set");

		Appointment apt = null;
		try {
			System.out.println("inside add appontiment try block");
			apt = new Appointment();
			apt.setPatient_name(patient_name);
			apt.setPatient_email(patient_email);
			apt.setPatient_mobile(patient_mobile);
			apt.setDoctorname(doctorname);
			apt.setPatient_appointmentdate(patient_appointmentdate);
			apt.setPatient_timeofappointment(patient_timeofappointment);
			apt.setPatient_reasonforappointment(patient_reasonforappointment);
			
			apt.setCreateddate(Createddate);
			apt.setFileName(fileName);
			apt.setPath(uploadPath);
			apt.setType_of_appointment(type_of_appointment);
			apt.setDoctor_hospital(doctor_hospital);

		} catch (Exception e) {
			System.out.println("inside appontiment catch block");
			e.printStackTrace();
			System.err.println(e);
		}
		try {
			System.out.println("inside appontiment save try block");
			int status = AddAppointment.saveAppointment(apt);
			if (status > 0) {
				System.out.println("inside appontiment save if  block");
				response.sendRedirect("Menu.jsp");

			} else {

			}

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}

package com.hello_Doctor.servlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import com.hello_Doctor.Model.Appointment;
import com.hello_Doctor.service.EditAppointmentService;

@WebServlet("/EditApponitment")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 10, // 10 MB
		maxFileSize = 1024 * 1024 * 1000, // 1 GB
		maxRequestSize = 1024 * 1024 * 1000) // 1 GB
public class EditApponitment extends HttpServlet {
	private static final long serialVersionUID = 1L;

	ServletOutputStream os;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// out = response.getWriter();//.........do not remove comment.
		os = response.getOutputStream();
		String patient_email = request.getParameter("patient_email");
		// file upload //
		String folderName = "dfiles";
		// String uploadPath = request.getServletContext().getRealPath("/") +
		// File.separator + folderName;//for netbeans use this code
		String doctorpath = request.getServletContext().getRealPath("") + folderName;// for eclipse use this code
		File dir = new File(doctorpath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		Part filePart = request.getPart("file");
		InputStream is = filePart.getInputStream();
		String doctorfilename = filePart.getSubmittedFileName();
		System.out.println("Path: " + doctorpath);
	
		 System.out.println("fileName: " + doctorfilename);
		 
		Files.copy(is, Paths.get(doctorpath + File.separator + doctorfilename), StandardCopyOption.REPLACE_EXISTING);
		Appointment apt = null;
		try {
			System.out.println("inside add appontiment try block");
			apt = new Appointment();
			apt.setDoctorfileName(doctorfilename);
			apt.setDoctorpath(doctorpath);
			apt.setPatient_email(patient_email);
		}catch (Exception e) {
		System.out.println("inside edit appontiment catch block ");
			e.printStackTrace();
			System.err.println(e);
		}
		
		try {
			System.out.println("inside appontiment Edit try block");
			int status = EditAppointmentService.updateAppoitment(apt);
			if(status>0)
			{
				 System.out.println("inside  save update if  block");
				 request.getRequestDispatcher("EditApponitmentView.jsp").include(request, response);
			}else {
				 System.out.println("inside  save update else  block");
				 request.getRequestDispatcher("Error.jsp").include(request, response);
				
			}
			
		}catch (Exception e) {
			System.out.println("inside edit appontiment catch block ");
			e.printStackTrace();
			System.err.println(e);
		}
		
		
		
		
		
		
	}

}

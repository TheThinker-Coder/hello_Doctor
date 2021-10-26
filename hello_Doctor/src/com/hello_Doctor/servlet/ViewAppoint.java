package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.entity.User;
import com.hello_Doctor.util.DbConnection;

@WebServlet("/ViewAppoint")
public class ViewAppoint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String doctorname = request.getParameter("name");
		PrintWriter out = response.getWriter();
		
		out.println("\r\n" + 
				"<!DOCTYPE html>\r\n" + 
				"<html>\r\n" + 
				"<head>\r\n" + 
				"<meta charset=\"ISO-8859-1\">\r\n" + 
				"<title>Insert title here</title>\r\n" + 
				"</head>\r\n" + 
				"<body>\r\n" + 
				"\r\n" + 
				"	<link rel=\"stylesheet\"\r\n" + 
				"		href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n" + 
				"		integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n" + 
				"		crossorigin=\"anonymous\">\r\n" + 
				"\r\n" + 
				"	<nav id=\"navbar-example2\" class=\"navbar navbar-dark bg-dark\">\r\n" + 
				"		<a class=\"navbar-brand\" href=\"Doctor_Menu.jsp\">HELLO DOCTOR</a>\r\n" + 
				"\r\n" + 
				"\r\n" + 
				"		\r\n" + 
				"\r\n" + 
				
				"	</nav>");
		out.println("\r\n" + 
				"<table class=\"table table-striped table-dark\">\r\n" + 
				"	 <thead class=\"thead-dark\">\r\n" + 
				"<tr><th>Id</th><th>Patient_Name</th><th>Email</th><th>Mobile</th><th>DoctorName</th><th>AppointmentDate</th><th>AppointmentTime</th><th>AppointmentReason</th><th>Date</th>\r\n" + 
				"\r\n" + 
				"");
		try {
		Connection con = DbConnection.GetConnection();
		String sql = "select * from appointment where doctorname=?";
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setString(1,doctorname);
		 ResultSet rst = pst.executeQuery();
		
		 
		 
		 while(rst.next())
		 {
			 out.println("<tr>");
			 out.println("<td>"+ rst.getInt(1)+"</td>");
			 out.println("<td>"+ rst.getString(2)+"</td>");
			 out.println("<td>"+ rst.getString(3)+"</td>");
			 out.println("<td>"+ rst.getLong(4)+"</td>");
			 out.println("<td>"+ rst.getString(5)+"</td>");
			 out.println("<td>"+ rst.getString(6)+"</td>");
			 out.println("<td>"+ rst.getString(7)+"</td>");
			 out.println("<td>"+ rst.getString(8)+"</td>");
			 out.println("<td>"+ rst.getString(9)+"</td>");
			 out.println("</table>");
			 
		 }
		
			
		 
		}catch(Exception ex ) {
			
		}

	
	out.println("<!-- script -->\r\n" + 
			"	<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n" + 
			"		integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n" + 
			"		crossorigin=\"anonymous\"></script>\r\n" + 
			"	<script\r\n" + 
			"		src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n" + 
			"		integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n" + 
			"		crossorigin=\"anonymous\"></script>\r\n" + 
			"	<script\r\n" + 
			"		src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n" + 
			"		integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n" + 
			"		crossorigin=\"anonymous\"></script>\r\n" + 
			"	<!-- script end -->\r\n" + 
			"</body>\r\n" + 
			"</html>");
		}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

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
import com.hello_Doctor.service.LoginValdition;
import com.hello_Doctor.util.DbConnection;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("inside do post method");
		// call web to servlet
		String patient_email = request.getParameter("email");
		String patient_password = request.getParameter("password");
		try {
			System.out.println("Inside loginservlet try block");
			if (LoginValdition.LoginValdition(patient_email, patient_password)) {
				//fetch  user by email
				try {
					SessionDao dao = new SessionDao(DbConnection.GetConnection());
					Patient p = dao.getPatientByEmail(patient_email);
					if(p==null){
						
					}else {
						 HttpSession s = request.getSession();
						 s.setAttribute("currentuser", p);
						 response.sendRedirect("Menu.jsp");	
						 response.sendRedirect("startchat.jsp");
						 response.sendRedirect("BookAppointment.jsp");	
						 response.sendRedirect("Patience_History.jsp");	
						
							
					}
					
				}catch (Exception e) {
				e.printStackTrace();
				System.err.println(e);
				}
				 
				System.out.println(patient_email);
				response.sendRedirect("Menu.jsp");
				response.sendRedirect("startchat.jsp");
			} else {
				response.sendRedirect("Error.jsp");

			}
		} catch (Exception e) {
			System.out.println("Inside loginservlet catch block");
			e.printStackTrace();
			System.out.println(e);
		}
		
		

	}

}

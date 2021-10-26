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
import com.hello_Doctor.Model.UserDao;
import com.hello_Doctor.util.DbConnection;

/**
 * Servlet implementation class Confrim
 */
@WebServlet("/Confrim")
public class Confrim extends HttpServlet {
	private static final long serialVersionUID = 1L;
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		//fetch  user by email
		System.out.println("inside confirmjava ");
		 String patient_email = request.getParameter("email");
		 System.out.println(patient_email);
		 try {
			 UserDao dao = new UserDao(DbConnection.GetConnection());// object of method to fecth data from useremail
			 Patient p = dao.getUserByEmail(patient_email);
			 if(p==null)
			 {
				 
			 }else {
				 HttpSession s = request.getSession();
				 s.setAttribute("currentuser", p);
				 response.sendRedirect("Update_Profile.jsp");
				 
			 }
			 
		 }catch (Exception e) {
			// TODO: handle exception
		}
	}

}

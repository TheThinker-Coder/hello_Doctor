package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.ForgetPasswordModel;
import com.hello_Doctor.service.ForgetPasswordService;

@WebServlet("/ForgetPassword")
public class ForgetPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("inside do forgetpassword post method");
		 String patient_email = request.getParameter("patient_email");
		 String patient_passwordnew = request.getParameter("patient_passwordnew");
		String patient_password = request.getParameter("patient_passwordconfirm");
		ForgetPasswordModel forgetpassword = null;
		if (patient_passwordnew.equals(patient_password))
		{
			System.out.println("password match");
			System.out.println(patient_email);
			System.out.println(patient_password);
			try {
				 forgetpassword = new ForgetPasswordModel();
				 forgetpassword.setPatient_password(patient_password);
				 forgetpassword.setPatient_email(patient_email);
				 try {
					 int status = ForgetPasswordService.Forgetpassword(forgetpassword);
					 if(status>0)
					 {
						 request.getRequestDispatcher("ForgetpasswordError.jsp").include(request, response);
					 }else
					 {
						 request.getRequestDispatcher("Error.jsp").include(request, response);
					 }
					 
				 }catch (Exception e) {
					e.printStackTrace();
					System.err.println(e);
				}
				
				
			}catch(Exception e)
			{
				e.printStackTrace();
				System.err.println(e);
			}
			
			
		}else {
			System.out.println("Invalid password or user");
			
		}
	}

}

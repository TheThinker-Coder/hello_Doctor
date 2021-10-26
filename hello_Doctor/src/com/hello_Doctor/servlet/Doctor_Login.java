package com.hello_Doctor.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.hello_Doctor.Model.Doctor_Regi;
import com.hello_Doctor.dao.DoctorSessionDao;
import com.hello_Doctor.service.DoctorLoginValdition;
import com.hello_Doctor.util.AdminDbConnection;

@WebServlet("/Doctor_Login")
public class Doctor_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// calling from webpage //
		String Doctor_email = request.getParameter("Doctor_email");
		String Doctor_password = request.getParameter("Doctor_password");
		// see on console //
		System.out.println(Doctor_email);
		System.out.println(Doctor_password);
		// call for service
		try {
			// session need to put here
			if (DoctorLoginValdition.LoginValdition(Doctor_email, Doctor_password)) {
				try {
					DoctorSessionDao dao = new DoctorSessionDao(AdminDbConnection.GetConnection());
					Doctor_Regi doctor_Regi = dao.getDoctorByEmail(Doctor_email);
					if (doctor_Regi == null){

					}else {
						HttpSession s = request.getSession();
						s.setAttribute("currentdoctor", doctor_Regi);
						response.sendRedirect("Doctor_Menu.jsp");
						response.sendRedirect("ViewApponitmentForDoctor.jsp");
					}
				}catch (Exception e) {
					e.printStackTrace();
					System.err.println(e);
				}
				response.sendRedirect("Doctor_Menu.jsp");
				response.sendRedirect("ViewApponitmentForDoctor.jsp");
				
			} else {
				response.sendRedirect("DoctorError.jsp");
			}
		}catch (Exception e) {
			e.printStackTrace();
			System.err.println(e);
		}
		// System.out.println(patient_email);
		// response.sendRedirect("Menu.jsp");

	}

}

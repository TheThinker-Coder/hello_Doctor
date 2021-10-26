package com.hello_Doctor.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.ForgetPasswordDoctorModel;
import com.hello_Doctor.Model.ForgetPasswordModel;
import com.hello_Doctor.service.ForgetPasswordDoctorService;
import com.hello_Doctor.service.ForgetPasswordService;

/**
 * Servlet implementation class ForgetPasswordDoctor
 */
@WebServlet("/ForgetPasswordDoctor")
public class ForgetPasswordDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		System.out.println("inside do forgetpassword post method");
		String Doctor_email = request.getParameter("Doctor_email");
		String Doctor_passwordnew = request.getParameter("Doctor_passwordnew");
		String Doctor_password = request.getParameter("Doctor_passwordconfirm");

		ForgetPasswordDoctorModel forgetPasswordDoctorModel = null;

		if (Doctor_passwordnew.equals(Doctor_password)) {
			System.out.println("password match");
			System.out.println(Doctor_email);
			System.out.println(Doctor_password);
			try {
				forgetPasswordDoctorModel = new ForgetPasswordDoctorModel();
				forgetPasswordDoctorModel.setDoctor_email(Doctor_email);
				forgetPasswordDoctorModel.setDoctor_password(Doctor_password);

				try {
					int status = ForgetPasswordDoctorService.Forgetpassword(forgetPasswordDoctorModel);
					if (status > 0) {
						request.getRequestDispatcher("ForgetpassworddoctorError.jsp").include(request, response);
					} else {
						request.getRequestDispatcher("Error.jsp").include(request, response);
					}

				} catch (Exception e) {
					e.printStackTrace();
					System.err.println(e);
				}

			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e);
			}

		} else {
			System.out.println("Invalid password or user");

		}
	}

}

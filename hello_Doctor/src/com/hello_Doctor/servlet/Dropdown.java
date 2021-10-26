package com.hello_Doctor.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.Model.Doctor;
import com.hello_Doctor.dao.ViewDoctorByName;


@WebServlet("/Dropdown")
public class Dropdown extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		ViewDoctorByName dao = new ViewDoctorByName();
		
		try {
			List<Doctor> list = dao.list();
			request.setAttribute("list", list);
			RequestDispatcher dispatcher  = request.getRequestDispatcher("BookAppointment.jsp");
			dispatcher.forward(request, response);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}

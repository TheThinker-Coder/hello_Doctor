package com.hello_Doctor.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hello_Doctor.constant.Constant;
import com.hello_Doctor.util.DbConnection;

@WebServlet("/Registration_view")
public class Registration_view extends HttpServlet {
	private static final long serialVersionUID = 1L;



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
        	Connection con = DbConnection.GetConnection();
  		   		  
  		// String name = request.getParameter("name");
  		 
         ArrayList al = null;// collection
         ArrayList pid_list = new ArrayList();
         String query = Constant.VIEW_PATIENT;
         PreparedStatement pst = con.prepareStatement(query);
        System.out.println("query " + query);
         
         ResultSet rs = pst.executeQuery(query);

         while (rs.next()) {
             al = new ArrayList();

     
             al.add(rs.getInt(1));//id
             al.add(rs.getString(2));//name
             al.add(rs.getString(3));//email
             al.add(rs.getLong(4));//mobile

             System.out.println("al :: " + al);
             pid_list.add(al);
         }

         request.setAttribute("piList", pid_list);
         RequestDispatcher view = request.getRequestDispatcher("Registration_view.jsp");
         view.forward(request, response);
         con.close();
         System.out.println("Disconnected!");
     } catch (Exception e) {
         e.printStackTrace();
     }
 

        

	}

}
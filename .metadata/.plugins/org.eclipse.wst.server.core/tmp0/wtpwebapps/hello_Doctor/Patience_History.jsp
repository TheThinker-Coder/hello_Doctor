<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<%@page import="com.hello_Doctor.util.DbConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hello_Doctor.Model.Patient"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>patient_History</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>
	<%!Connection con = null;
	PreparedStatement ps = null;
	ResultSet rst = null;%>
	
	<%
	Patient patient5 = (Patient) session.getAttribute("currentuser");
	if (patient5 == null) {
		response.sendRedirect("index.html");
	}
%>
	
	<nav id="navbar-example2" class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="Menu.jsp">HELLO DOCTOR</a>
		<ul class="nav nav-pills">
		
		<li class="nav-item"><a class="nav-link" >
		
				
				
			
			

		
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#profile">Welcome,<%=patient5.getPatient_name()%><br></a>
			</ul>
	</nav>
	
	
	<table class="table table-striped">
		<thead class="">
			<tr>
				
				<th>Name</th>
				<th>Email</th>
				<th>Mobile</th>
				<th>HospitalName</th>
				<th>DoctorName</th>
				<th>Date</th>
				<th>Time</th>
				<th>Reason</th>
				<th>Download</th>
				<th>Doctor_prection</th>
				<th>Delete</th>
				<%
					String patient_email = request.getParameter("patient_email");
					con = DbConnection.GetConnection();
					String sql = "select * from appointment where patient_email=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, patient_email);
					rst = ps.executeQuery();
					while (rst.next()) {
				%>
			
			<tr>
				
				<td><%= rst.getString(2)%></td>
				<td><%= rst.getString(3)%></td>
				<td><%= rst.getLong(4)%></td>
					<td><%= rst.getString(15) %></td>
				<td><%= rst.getString(5)%></td>
			
				<td><%= rst.getString(6)%></td>
				<td><%= rst.getString(7)%></td>
				<td><%= rst.getString(8)%></td>
			
			<td><a href="DownloadServlet?fileName=<%=rst.getString(10)%>">Download</a></td>
			
           <td><a href="DoctorDownloadServlet?doctorfilename=<%=rst.getString(12)%>">Download</a></td>
           
          <td><a href="DeleteApponitment.jsp?patient_id=<%=rst.getInt(1) %>">Delete</a></td>
            </tr>
            <%
                }
            %>
            
        </table><br>
	<!-- script -->
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
		integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
	<!-- script end -->
</body>
</html>


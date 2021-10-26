<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.hello_Doctor.dao.Reciver"%>
<%@page import="com.hello_Doctor.util.AdminDbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.hello_Doctor.dao.ViewDoctorByName"%>
<%@page import="com.hello_Doctor.Model.Doctor"%>

<%@page import="com.hello_Doctor.util.AdminDbConnection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.hello_Doctor.Model.Patient"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Appointment Page</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
</head>
<body>


<%
	Patient patient4 = (Patient) session.getAttribute("currentuser");
	if (patient4 == null) {
		response.sendRedirect("index.html");
	}
%>
<nav id="navbar-example2" class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="Menu.jsp">HELLO DOCTOR</a>
		<ul class="nav nav-pills">
		
		<li class="nav-item"><a class="nav-link" >
		
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#profile">Welcome,<%=patient4.getPatient_name()%><br></a>
			</ul>
	</nav>
	<div class="card">
  <div class="card-body">
					<form action="BookAppointment" method="post"
						enctype="multipart/form-data">

						<table class="table ">
							<tr>
								<td><input type="text" class="form-control" name="fullname"
									placeholder="Enter the full Name" required="required"
									class="form-control"></td>
							</tr>
							<tr>
								<td><input type="email" class="form-control" name="email"
									placeholder="Enter the Email" required="required"
									class="form-control"></td>
							</tr>
							<tr>
								<td><input type="tel" class="form-control" name="mobile"
									pattern="^\d{3}\d{3}\d{4}$"
									placeholder="Enter the Mobile Number" required="required"
									class="form-control"></td>
							</tr>

							<tr>
								<td>
							<tr>
								<td></td>
							</tr>

							<%!Connection con = null;
	PreparedStatement ps = null;
	ResultSet rst = null;%>


							<%
								String doctor_hospital = request.getParameter("doctor_hospital");
								con = AdminDbConnection.GetConnection();
								String sql = "select * from doctor where doctor_hospital=?";
								ps = con.prepareStatement(sql);
								ps.setString(1, doctor_hospital);
								rst = ps.executeQuery();
								while (rst.next()) {
							%>
							<input type="hidden"
									name="doctor_hospital" 
									value="<%=rst.getString(7)%>"> 
							
								<td><input class="form-check-input" type="radio"
									name="doctorname" id="exampleRadios1"
									value="<%=rst.getString(2)%>" checked> <label
									class="form-check-label" for="exampleRadios1"> <%=rst.getString(2)%>
								</label></td>

							</tr>

							<%
								}
							%>

							<tr>
								<td><label for="datepicker" class="col-form-label">Select
										appointment date</label> <input placeholder="Date"
									class="date form-control" id="datepicker" type="date"
									name="date" value="" onfocus="this.value = '';"
									onblur="if (this.value == '') {this.value = '';}" required="" /></td>
							</tr>
							<tr>

								<td><label for="datepicker" class="col-form-label">Select
										appointment time</label> <select class="form-control" name="time">
										<option>Time Slot For Appointment</option>
										<option>8:00AM-9:00AM</option>
										<option>9:00AM-10:00AM</option>
										<option>10:00AM-11:00AM</option>
										<option>11:00AM-12:00PM</option>
										<option>12:00PM-1:00PM</option>
										<option>1:00PM-2:00PM</option>
										<option>2:00PM-3:00PM</option>
										<option>3:00PM-4:00PM</option>
										<option>4:00PM-5:00PM</option>
										<option>5:00PM-6:00PM</option>
										<option>6:00PM-7:00PM</option>
										<option>7:00PM-8:00PM</option>
										<option>9:00PM-10:00PM</option>
								</select></td>
							</tr>
							<tr>
								<td><textarea class="form-control" name="reason"
										placeholder="Reason for Appointment" required="required"
										rows=""></textarea></td>
							</tr>

							<tr>
								<td><select class="form-control" name="type_of_appointment">
										<option>Type of Appointment</option>
										<option>Online</option>
										<option>Offline</option>

								</select></td>
							</tr>
							<tr>
								<td>
									<div class="form-group">
										<label for="exampleFormControlFile1">Upload File</label> <input
											type="file" name="file" class="form-control-file"
											id="exampleFormControlFile1">
									</div>
								</td>
							</tr>
						</table>
						<br>
						<div class="container text-center">
							<button type="submit" class="btn btn-primary">Confirm
								Appointment</button>
						</div>
					</form>
				</div>
				</div>

</body>

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
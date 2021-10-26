<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateHosptialDetails</title>
</head>
<%@page import="com.hello_Doctor.dao.UserDao1,java.util.*"%>
<%@page import="com.hello_Doctor.Model.Appointment" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	List<Appointment> Appointmentlist = UserDao1.getAllRecords();
	request.setAttribute("list", Appointmentlist);	
%>

<body>

	<%@ include file="AdminNavbar.jsp"%>
	<div class="container-fluid"></div>

	<!-- /#page-content-wrapper -->

<table class="table table-striped table-dark">
	 <thead class="thead-dark">
<tr><th>Id</th><th>Patient_Name</th><th>Email</th><th>Mobile</th><th>DoctorName</th><th>AppointmentDate</th><th>TimeofAppointment</th><th>ReasonForAppointment</th><th>DateofCreationAppointment</th>
<c:forEach items="${list}" var="u">

<tr><td>${u.getPatient_id()}</td><td>${u.getPatient_name()}</td><td>${u.getPatient_email()}</td><td>${u.getPatient_mobile()}</td><td>${u.getDoctorname()}</td><td>${u.getPatient_appointmentdate()}</td><td>${u.getPatient_timeofappointment()}</td><td>${u.getPatient_reasonforappointment()}</td>

<td>${u.getCreateddate()}</td>
</c:forEach>
</table>





</body>
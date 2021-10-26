<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateHosptialDetails</title>
</head>
<%@page import="com.hello_Doctor.dao.UserDao,java.util.*"%>
<%@page import="com.hello_Doctor.Model.AddHosp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	List<AddHosp> Hopstaildetailslist = UserDao.getAllRecords();
	request.setAttribute("list", Hopstaildetailslist);	
%>

<body>

	<%@ include file="AdminNavbar.jsp"%>
	<div class="container-fluid"></div>

	<!-- /#page-content-wrapper -->

<table class="table table-striped table-dark">
	 <thead class="thead-dark">
<tr><th>Id</th><th>Hospital Name</th><th>Doctor Available</th><th>HospitalAddress</th><th>HospitalCity</th><th>HospitalState</th><th>HospitalZip</th><th>Bed Available</th><th>Icu Available</th><th>OT Available</th><th>Emergency</th>
<th>Contact Number</th><th>Edit</th><th>Delete</th></tr>
<c:forEach items="${list}" var="u">

<tr><td>${u.getHospital_id()}</td><td>${u.getHospital_name()}</td><td>${u.getHospital_no_of_doctor()}</td><td>${u.getHospital_address()}</td><td>${u.getHospital_city()}</td><td>${u.getHospital_state()}</td><td>${u.getHospital_zip()}</td><td>${u.getHospital_no_of_beds()}</td>
<td>${u.getHospital_no_of_icu()}</td><td>${u.getHospital_no_of_ot()}</td>
<td>${u.getHospital_emergency()}</td><td>${u. getHospital_contactno()}</td>
<td><a href="EditHopsitalDetails.jsp?hospital_id=${u.getHospital_id()}">Edit</a>
<td><a href="DeleteHopsitalDetails.jsp?hospital_id=${u.getHospital_id()}">Delete</a>
</c:forEach>
</table>





</body>
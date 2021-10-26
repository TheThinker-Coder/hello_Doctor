<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UpdateHosptialDetails</title>
</head>
<%@page import="com.hello_Doctor.dao.UserDao1,java.util.*"%>
<%@page import="com.hello_Doctor.Model.Contactmodel" %>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%
	List<Contactmodel> Contacttlist = UserDao1.getAllContactRecords();
	request.setAttribute("list", Contacttlist);	
%>

<body>

	<%@ include file="AdminNavbar.jsp"%>
	<div class="container-fluid"></div>

	<!-- /#page-content-wrapper -->

<table class="table table-striped table-dark">
	 <thead class="thead-dark">
<tr><th>Id</th><th>Contact_FirstName</th><th>Contact_LastName</th><th>Contact_Email</th><th>Contact_Mobile</th><th>Message Received</th>
<c:forEach items="${list}" var="u">

<tr><td>${u.getContact_id()}</td><td>${u.getContact_firstname()}</td><td>${u.getContact_lastname()}</td><td>${u.getContact_email()}</td><td>${u.getContact_mobile()}</td><td>${u.getContact_message()}</td>


</c:forEach>
</table>





</body>
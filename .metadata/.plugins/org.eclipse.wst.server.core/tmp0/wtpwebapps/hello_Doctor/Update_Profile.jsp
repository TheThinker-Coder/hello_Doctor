<%@page import="com.hello_Doctor.Model.Patient"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%
	Patient patient = (Patient) session.getAttribute("currentuser");
	if (patient == null) {
		response.sendRedirect("Menu.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%= patient.getPatient_name() %>
<br>
<%= patient.getPatient_email() %>
</body>
</html>
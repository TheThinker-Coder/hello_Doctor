<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%@page import="com.hello_Doctor.dao.ViewHospitalName"%>
<%@page import="com.hello_Doctor.Model.Hospitalname"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HELLO DOCTOR</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
</head>
<body>
<%@ include file="AdminNavbar.jsp" %>
      <div class="container-fluid">
      </div>
      <div>
      <form action="AddDoctor" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Enter The Doctor Name</label>
    <input name="name" type="text" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter the Doctor name">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Enter The Doctor Speciality</label>
    <input type="text" name="speciality" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter the Doctor Speciality">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter The Doctor Mobile Number</label>
    <input type="tel"  name="mobile" class="form-control" pattern="^\d{3}\d{3}\d{4}$" id="exampleInputEmail1" required="required" aria-describedby="emailHelp" placeholder="Enter the Doctor Mobile Number">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter The Doctor City</label>
    <input type="text"  name="city" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter the Doctor Mobile City">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <div class="form-group">
    <label for="exampleInputEmail1">Enter The Doctor Registration Number</label>
    <input type="text" name="registrationno" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" required="required" placeholder="Enter the Doctor Registration Number">
    <small id="emailHelp" class="form-text text-muted"></small>
  </div>
  
  <%
		ViewHospitalName dao = new ViewHospitalName();
		try {
			List<Hospitalname> list = dao.list();
			request.setAttribute("list", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	
  <div class="form-group">
    <label for="exampleInputEmail1">Add Hospital</label>
    <select  class="form-control" name ="doctor_hospital">
			<option>Select Hospital</option>
						<c:forEach items="${list}" var="l">

							<option value="${l.doctor_hospital}">${l.doctor_hospital}</option>
						</c:forEach>
				</select>
				</div>
    </div>
  
      
  <button type="submit" class="btn btn-primary">Save Doctor</button>
</form>
 </div>
 
    

<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>
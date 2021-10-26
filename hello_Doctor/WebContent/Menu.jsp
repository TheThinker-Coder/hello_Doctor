<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.hello_Doctor.Model.Patient"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.hello_Doctor.dao.Reciver"%>
<%@page import="com.hello_Doctor.util.AdminDbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.hello_Doctor.dao.ViewHospitalName"%>
<%@page import="com.hello_Doctor.Model.Hospitalname"%>

<%
	Patient patient = (Patient) session.getAttribute("currentuser");
	if (patient == null) {
		response.sendRedirect("index.html");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript" src="check.js"></script>
<title>Menu</title>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">
</head>

<body>

<%
		ViewHospitalName dao = new ViewHospitalName();
		try {
			List<Hospitalname> list = dao.list();
			request.setAttribute("list", list);

		} catch (Exception e) {
			e.printStackTrace();
		}
	%>
	

	
	<nav id="navbar-example2" class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">HELLO DOCTOR</a>
		<ul class="nav nav-pills">
		
		<li class="nav-item"><a class="nav-link" >
		
				<form  action="BookAppointment.jsp" class="form-inline">
				<div class="form-group mb-2">
				<select  class="form-control" name ="doctor_hospital">
			<option>Select Hospital</option>
						<c:forEach items="${list}" var="l">

							<option value="${l.doctor_hospital}">${l.doctor_hospital}</option>
						</c:forEach>
				</select>
				</div>
			  
				<button type="submit" class="btn btn-primary mb-2">Search</button>
				</form>
		
				
				</a></li>
				
			<li class="nav-item"><a class="nav-link" href="#"
				data-toggle="modal" data-target="#doctorinfo"> Doctor Info </a></li>

			<li class="nav-item"><a class="nav-link" href="#"
				data-toggle="modal" data-target="#contact1"> Contact Us </a></li>

			<li class="nav-item"><a class="nav-link" href="#"
				data-toggle="modal" data-target="">  </a></li>

			<li class="nav-item"><a class="nav-link" href="#"
				data-toggle="modal" data-target="#chat"> 24x7 assitent<br>
			</a></li>

			<ul class="nav nav-pills">
				<li class="nav-item"><a class="nav-link" href="#"
					data-toggle="modal" data-target="#profile">Welcome,<%=patient.getPatient_name()%><br></a>
			</ul>
	</nav>

	<main>
		<div class="col-md-8">
			<div class="container text-center" id="loader">
				<i class="fa fa-refresh fa-3x fa-spin"> </i>
				<h3 class="mt-2">Loading....</h3>
			</div>
			<div class="container text-center" id="post"></div>
		</div>
		</div>
	</main>

	<!-- doctorinfo -->
	<!-- Modal -->
	<div class="modal fade" id="doctorinfo" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Hello Doctor</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<h2>Doctor General Information</h2>
					</div>
					<%@ include file="ViewDoctorInfo.jsp"%>
					<div class="container text-center">
						<button type="button" class="btn btn-secondary"
							data-dismiss="modal">Close</button>
					</div>

					</form>
				</div>
			</div>
		</div>
	</div>



	<!-- doctorinfoend -->

	<!--chat -->
	<!-- chat modal -->
	<!-- Modal -->
	<div class="modal fade bd-example-modal-lg" id="chat" tabindex="-1"
		role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Hello Doctor</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">

					This live chat Assistant will redirect you to the another page
					Messages are Secure Clicking back will clear the chat <br> <a
						href="startchat.jsp">click for assistant</a>
				</div>
			</div>
		</div>
	</div>
	<!-- chat modal end -->
	<!-- chat end  -->

	<!-- appointment modal -->
	<!-- Modal -->
	<div class="modal fade" id="appointment" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Hello Doctor</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<h2>Book Appointment</h2>
					</div>

					<%@ include file="BookAppointment.jsp"%>

				</div>
			</div>
		</div>
	</div>
	<!-- appointment modal end -->


	<!-- contact modal -->
	<!-- Modal -->
	<div class="modal fade" id="contact1" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Hello Doctor</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						<h2>Feel Free For Queries</h2>
					</div>
					<form action="Contact" method="post">
						<table class="table">
							<tr>
								<td><input type="text" class="form-control" name="fname"
									placeholder="Enter the First Name" required="required"
									class="form-control"></td>
							</tr>
							<tr>
								<td><input type="text" class="form-control" name="lname"
									placeholder="Enter the Last Name" required="required"
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
								<td><textarea class="form-control" name="message"
										placeholder="Enter the Message" required="required" rows="3"></textarea>
								</td>
							</tr>
						</table>
						<br>
						<div class="container text-center">
							<button type="submit" class="btn btn-primary">Send
								Message</button>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- contact modal end -->


	<!-- Modal -->
	<div class="modal fade" id="profile" tabindex="-1" role="dialog"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog" role="document">
			<div class="modal-content ">
				<div class="modal-header text-center">
					<h5 class="modal-title" id="exampleModalLabel">HELLO DOCTOR</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<div class="container text-center">
						Welcome to profile
						<%=patient.getPatient_name()%>&nbsp; &nbsp;<a href="index.html">Logout</a>

					</div>
					<!-- dateils -->
					<div id="profile-Det">
						<table class="table">

							<tbody>

								<tr>
									<th scope="row">Patient id</th>
									<td><%=patient.getPatient_id()%></td>

								</tr>
								<tr>
									<th scope="row">Patient Name</th>
									<td><%=patient.getPatient_name()%></td>

								</tr>
								<tr>
									<th scope="row">Patient Email</th>
									<td><%=patient.getPatient_email()%></td>
								</tr>
								<tr>
									<th scope="row">Patient mobile</th>
									<td><%=patient.getPatient_mobile()%></td>
								</tr>
								<tr>
								<th scope="row">Patient History</th>
									<td>
									
									<form action="Patience_History.jsp">
									<input type="hidden" name="patient_email"
								value="<%=patient.getPatient_email()%>" />
									<button type="submit" class="btn btn-link">View History</button>
									</form>
									</td>
								</tr>
								
							
							</tbody>
						</table>
					</div>

					<!-- profile Edit -->

					<div id="profile-edit" style="display: none;">
						<h3>Please Edit Carefully</h3>
						<form action="Edit_Profile" method="post">
							<input type="hidden" name="id"
								value="<%=patient.getPatient_id()%>" />
							<table class="table">
								<tr>
									<td>Patient Name</td>
									<td><input type="text" name="name" class="form-control"
										value="<%=patient.getPatient_name()%>"></td>

								</tr>


								<tr>
									<td>Patient Email</td>
									<td><input type="email" name="email" class="form-control"
										value="<%=patient.getPatient_email()%>"></td>
													
								</tr>



								<tr>
									<td>Patient Mobile</td>
									<td><input type="tel" name="mobile" class="form-control"
										value="<%=patient.getPatient_mobile()%>"></td>

								</tr>
								<tr>
									<td>Patient Password</td>
									<td><input type="password" id="password" name="password"
										placeholder="MobileNumber" class="form-control" required
										value="<%=patient.getPatient_password()%>" />
								</tr>


							</table>
							<br>
							<div class="container text-center">
								<button type="submit" class="btn btn-primary">save</button>
							</div>


						</form>
					</div>

				</div>

				<div class="modal-footer">
					<button type="button" class="btn btn-secondary"
						data-dismiss="modal">Close</button>
					<button type="button" id="Edit-profile" class="btn btn-primary">Edit</button>
				</div>
			</div>
		</div>





		<!-- scrpit start -->

		<script src="https://code.jquery.com/jquery-3.6.0.min.js"
			integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
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

		<!-- js -->

		<script>
			$(document).ready(function() {
				$.ajax({
					url : "ViewHospital.jsp",
					success : function(data, textStatus, jqXHR) {
						console.log(data);
						$("#loader").hide();
						$("#post").html(data);
					}

				});
			});
		</script>



		<script>
			$(document).ready(function() {
				let editStatus = false;

				$('#Edit-profile').click(function() {
					//alert("buttom")

					if (editStatus == false) {

						$("#profile-Det").hide()

						$("#profile-edit").show()
						editStatus = true;
						$(this).text("Back")
					} else {

						$("#profile-Det").show()

						$("#profile-edit").hide()
						editStatus = false;
						$(this).text("Edit")
					}

				})
			});

			<!--jsend-->
		</script>
</body>
</html>
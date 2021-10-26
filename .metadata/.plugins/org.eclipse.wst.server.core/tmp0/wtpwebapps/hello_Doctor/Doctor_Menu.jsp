<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="com.hello_Doctor.Model.Doctor_Regi"%>

<%
	Doctor_Regi doctor_Regi = (Doctor_Regi) session.getAttribute("currentdoctor");
	if (doctor_Regi == null) {
		response.sendRedirect("DoctorIndex.jsp");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Doctor Menu</title>
</head>
<body>

	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">

	<nav id="navbar-example2" class="navbar navbar-dark bg-dark">
		<a class="navbar-brand" href="index.html">HELLO DOCTOR</a>

		<ul class="nav nav-pills">
		<li class="nav-item">
		<form  action ="ViewAppointemet.jsp"class= "form-inline">
			
			<div class="form-group mx-sm-3 mb-2">
		 <input type="hidden" name="name" value="<%=doctor_Regi.getDoctor_fullname()%>" />
			</div>
			<button type="submit" class="btn btn-primary mb-2">View Apponitement
	</button>
		</form>
		</li>
		
			<li class="nav-item"><a class="nav-link" href="#"
				data-toggle="modal" data-target="#profile"><%=doctor_Regi.getDoctor_fullname()%><br></a>
		</ul>
	</nav>


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
						<%=doctor_Regi.getDoctor_fullname()%>&nbsp; &nbsp;<a href="index.html">Logout</a>

					</div>
					<!-- dateils -->
					<div id="profile-Det">
						<table class="table">

							<tbody>

								<tr>
									<th scope="row">Doctor id</th>
									<td><%=doctor_Regi.getDoctor_id()%></td>

								</tr>
								<tr>
									<th scope="row">Doctor  Name</th>
									<td><%=doctor_Regi.getDoctor_fullname()%></td>

								</tr>
								<tr>
									<th scope="row">Doctor Email</th>
									<td><%=doctor_Regi.getDoctor_email()%></td>
								</tr>
								<tr>
									<th scope="row">Doctor mobile</th>
									<td><%=doctor_Regi.getDoctor_mobile()%></td>
								</tr>
							</tbody>
						</table>
					</div>

					<!-- profile Edit -->

					<div id="profile-edit" style="display: none;">
						<h3>Please Edit Carefully</h3>
						<form action="Edit_DoctorProfile" method="post">
							<input type="hidden" name="id"
								value="<%=doctor_Regi.getDoctor_id()%>" />
							<table class="table">
								<tr>
									<td>Doctor Name</td>
									<td><input type="text" name="name" class="form-control"
										value="<%=doctor_Regi.getDoctor_fullname()%>"></td>

								</tr>


								<tr>
									<td>Doctor Email</td>
									<td><input type="email" name="email" class="form-control"
										value="<%=doctor_Regi.getDoctor_email()%>"></td>
													
								</tr>



								<tr>
									<td>Doctor Mobile</td>
									<td><input type="tel" name="mobile" class="form-control"
										value="<%=doctor_Regi.getDoctor_mobile()%>"></td>

								</tr>
								<tr>
									<td>Doctor Password</td>
									<td><input type="password" id="password" name="password"
										placeholder="MobileNumber" class="form-control" required
										value="<%=doctor_Regi.getDoctor_password()%>" />
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
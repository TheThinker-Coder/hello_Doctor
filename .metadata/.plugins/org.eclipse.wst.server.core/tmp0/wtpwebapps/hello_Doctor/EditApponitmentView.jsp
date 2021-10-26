<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Apponitment Details</title>
</head>
<body>

	<%@page
		import="com.hello_Doctor.dao.ApponintmentDao,com.hello_Doctor.Model.Appointment"%>

	<h1>Edit Hospital Details</h1>

	<%
		String patient_email = request.getParameter("patient_email");
		Appointment u = ApponintmentDao.getRecordbyEmail(patient_email);
	%>
	<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">



	<div clas="row" align="center" style="width: 1300px;">


		<form action="EditApponitment" method="post"enctype="multipart/form-data">
			<table class="table table-bordered">
				<div class="form-group">
					<input type="hidden" name="patient_email"
						value="<%=u.getPatient_email()%>" />


					<tr>
						<td>patient_name</td>
						<td><input type="text" readonly
							class="form-control-plaintext" name="patient_name"
							class="form-control" value="<%=u.getPatient_name()%>" /></td>
					</tr>
					<tr>
						<td>patient_email</td>
						<td><input type="text" readonly
							class="form-control-plaintext" name="patient_email"
							class="form-control" value="<%=u.getPatient_email()%>" /></td>
					</tr>
					<tr>
						<td>patient_mobile</td>
						<td><input type="text" readonly
							class="form-control-plaintext" name="patient_mobile"
							class="form-control" value="<%=u.getPatient_mobile()%>" /></td>
					</tr>
					<tr>
						<td>doctorname</td>
						<td><input type="text" readonly
							class="form-control-plaintext" name="doctorname"
							class="form-control" value="<%=u.getDoctorname()%>" /></td>
					</tr>
					<tr>
						<td>patient_appointmentdate</td>
						<td><input type="text" readonly
							class="form-control-plaintext" class="form-control"
							name="patient_appointmentdate"
							value="<%=u.getPatient_appointmentdate()%>" /></td>
					</tr>
					<tr>
						<td>patient_timeofappointment</td>
						<td><input type="text" readonly
							class="form-control-plaintext" class="form-control"
							name="patient_timeofappointment"
							value="<%=u.getPatient_timeofappointment()%>" /></td>
					</tr>
					<tr>
						<td>patient_reasonforappointment</td>
						<td><input readonly class="form-control-plaintext"
							type="text" class="form-control"
							name="patient_reasonforappointment"
							value="<%=u.getPatient_reasonforappointment()%>" /></td>
					</tr>
					<tr>
						<td>Createddate</td>
						<td><input type="text" name="Createddate" readonly
							class="form-control-plaintext" class="form-control"
							value="<%=u.getCreateddate()%>" /></td>
					</tr>
					<tr>
						<td>filename</td>
						<td><input type="text" name=" filename" class="form-control"
							readonly class="form-control-plaintext"
							value="<%=u.getFileName()%>" /></td>
					</tr>

					<tr>
						<td>Upload File</td>
						<td><input type="file" name="file" class="form-control-file"
							id="exampleFormControlFile1"></td>
					</tr>

					<div class="form-group">
						<tr>
							<td>
								<button type="submit" class="btn btn-primary">Save</button>
							</td>
						</tr>
			</table>

		</form>
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
</body>
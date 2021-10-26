<%@page import="com.hello_Doctor.dao.Reciver"%>
<%@page import="com.hello_Doctor.util.AdminDbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.hello_Doctor.dao.PostDao"%>
<%@page import="com.hello_Doctor.dao.Reciver"%>
<html>
<body>
<link rel="stylesheet"
		href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
		integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
		crossorigin="anonymous">

<div clas="row" align="center"  style="width: 1300px;">
<h2>Hospital General Information</h2>
<%
	PostDao psd = new PostDao(AdminDbConnection.GetConnection());

	List<Reciver> post = psd.getAllRPost();
	for (Reciver d : post) {
%>
	
<div class="col-md-6 mt-2" >
	<div class="card">
	<div class="card-body">

	<p><%=d.getHospital_name() %> &nbsp;<%=d.getHospital_address() %></p>
	<p><%=d.getHospital_state() %>&nbsp; <%=d.getHospital_city() %>&nbsp;  <%=d.getHospital_zip() %></p> 
	 <pre>Hospital Contact Number &nbsp; +91 <%=d.getHospital_contactno()%></pre>
	<pre> Doctor Available <%=d.getHospital_no_of_doctor() %></pre>
	<pre>Beds Available &nbsp;<%=d.getHospital_no_of_beds() %></pre>
	<pre>Icu Available &nbsp;<%=d.getHospital_no_of_icu()%> </pre>
	<pre>Opertion Theatre Available&nbsp;<%=d.getHospital_no_of_ot()%> </pre>
	<pre>Emergency Availble &nbsp;<%=d.getHospital_emergency()%> </pre>
	<p> </p>
	<pre> </pre>
	
	
		</div>
	
	
	
	</div>
	
	</div>
	 
<%
	}
%>
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

</html>
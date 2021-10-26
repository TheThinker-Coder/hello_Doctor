<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">



<!-- Bootstrap core CSS -->
<link href="assets/vendor/admin/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom styles for this template -->
<link href="assets/css/simple-sidebar.css" rel="stylesheet">

</head>
<body>

<div class="d-flex" id="wrapper">

		<!-- Sidebar -->
		<div class="bg-light border-right" id="sidebar-wrapper">
			<div class="sidebar-heading">HELLO DOCTOR</div>
			<div class="list-group list-group-flush">
				<a href="AdminPannel.jsp"
					class="list-group-item list-group-item-action bg-light">Dashboard</a>
				<a href="Registration_view.jsp" class="list-group-item list-group-item-action bg-light">Registration View</a>

				<a href="AddDoctor.jsp" class="list-group-item list-group-item-action bg-light">Add Doctor</a> 
				<a href="AddHosptial.jsp" class="list-group-item list-group-item-action bg-light">AddHosptialName</a>
				
				<a href="AddHosptialDeatils.jsp" class="list-group-item list-group-item-action bg-light">AddHosptialDeatils</a>
				<a href="UpdateHosptialDetails.jsp" class="list-group-item list-group-item-action bg-light">UpdateHosptialDetails</a> 
				
				<a href="ContactView.jsp" class="list-group-item list-group-item-action bg-light">Contact View</a> 
				<a href="AppointmentView.jsp" class="list-group-item list-group-item-action bg-light">Appointment View </a>
				<a href="AdminChat.jsp" class="list-group-item list-group-item-action bg-light">Chat</a>
			</div>
		</div>
		<!-- /#sidebar-wrapper -->

		<!-- Page Content -->
		<div id="page-content-wrapper">

			<nav
				class="navbar navbar-expand-lg navbar-dark bg-dark border-bottom">
				<button class="btn btn-primary" id="menu-toggle">Menu</button>

				<button class="navbar-toggler" type="button" data-toggle="collapse"
					data-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav ml-auto mt-2 mt-lg-0">
						
						
					</ul>
				</div>
			</nav>
			
			<!-- /#wrapper -->

	
	
	<!-- Bootstrap core JavaScript -->
	<script src="assets/vendor/admin/vendor/jquery/jquery.min.js"></script>
	<script src="assets/vendor/admin/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

	<!-- Menu Toggle Script -->
	
	
	
	<script>
		$("#menu-toggle").click(function(e) {
			e.preventDefault();
			$("#wrapper").toggleClass("toggled");
		});
	</script>

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
			
</body>
</html>
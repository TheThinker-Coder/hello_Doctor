<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.*"%>

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">

<title>Registration View</title>

</head>

<body background="">
	<%@ include file="AdminNavbar.jsp"%>

	<div class="container-fluid">

		<ul class="navbar-nav">

		</ul>
		&nbsp;&nbsp;

		<form action="Registration_view" method="post" class="form-inline">


			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">View</button>
		</form>

		<form action="RegiPdf" method="post" class="form-inline">
			<button class="btn btn-outline-success my-2 my-sm-0" type="submit">GenerateReport</button>
		</form>


		<table class="table table-bordered">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Mobile Number</th>
				</tr>
			</thead>
			<%
				int count = 0;
				String color = "#F9EBB3";
				if (request.getAttribute("piList") != null) {
					ArrayList al = (ArrayList) request.getAttribute("piList");
					System.out.println(al);
					Iterator itr = al.iterator();//next
					while (itr.hasNext()) {

						if ((count % 2) == 0) {
							color = "#eeffee";
						}
						count++;
						ArrayList pList = (ArrayList) itr.next();
			%>
			<tr style="background-color:<%=color%>;">
				<td><%=pList.get(0)%></td>
				<td><%=pList.get(1)%></td>
				<td><%=pList.get(2)%></td>
				<td><%=pList.get(3)%></td>
				

			</tr>
			<%
				}
				}
				if (count == 0) {
			%>
			<tr>
				<td colspan=4 align="center" style="background-color: #eeffee"><b>No
						Record Found..</b></td>
			</tr>
			<%
				}
			%>

		</table>

	</div>
	</div>
	<!-- /#page-content-wrapper -->

	</div>
	<!-- /#wrapper -->






</body>

</html>

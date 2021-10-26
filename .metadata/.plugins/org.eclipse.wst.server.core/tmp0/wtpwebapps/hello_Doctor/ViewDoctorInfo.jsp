<%@page import="com.hello_Doctor.dao.Reciver"%>
<%@page import="com.hello_Doctor.util.AdminDbConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.List"%>
<%@page import="com.hello_Doctor.dao.PostDoctor"%>
<%@page import="com.hello_Doctor.Model.Doctor"%>


<%
	PostDoctor psd = new PostDoctor(AdminDbConnection.GetConnection());

	List<Doctor> post = psd.getAllDPost();
	for (Doctor d : post) {
%>
<body>



	<div class="card">
	<div class="card-body">
	<br>
 <pre>Doctor Name  &nbsp; <%=d.getDoctor_name()%></pre>
	 <pre>Doctor Speciality &nbsp;  <%=d.getDoctor_speciality()%></pre>
	  <pre>Doctor Contact Number &nbsp; <%=d.getDoctor_mobile()%></pre>
	<pre>Doctor City &nbsp;<%=d.getDoctor_city()%></pre>
	<br>
	
	
	</div>
	</div>

<%
	}
%>
<!-- scrpit start -->


		<!-- script end -->
</body>

	
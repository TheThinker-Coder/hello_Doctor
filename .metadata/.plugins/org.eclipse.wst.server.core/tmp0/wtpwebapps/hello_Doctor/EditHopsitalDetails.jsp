<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Hospital Details</title>
</head>
<body>

<%@page import="com.hello_Doctor.dao.UserDao,com.hello_Doctor.Model.AddHosp"%>
<%@ include file="AdminNavbar.jsp"%>
<h1>Edit Hospital Details</h1>

<%
String hospital_id  = request.getParameter("hospital_id");
AddHosp  u = UserDao.getRecordById(Integer.parseInt(hospital_id));
%>



<form action="UpdateConfrim" method="post">
<table class="table table-hover">
<input type="hidden" name="hospital_id" value="<%=u.getHospital_id() %>"/>
<tr><td>Hospital_Name:</td><td><input type="text" name="Hospital_Name" value="<%= u.getHospital_name() %>"/></td></tr>
<tr><td>Hospital_no_of_doctor:</td><td><input type="number" name="Hospital_no_of_doctor" value="<%= u.getHospital_no_of_doctor() %>"/></td></tr>
<tr><td>Hospital_Address:</td><td><input type="text" name="Hospital_Address" value="<%= u.getHospital_address() %>"/></td></tr>
<tr><td>Hospital_city:</td><td><input type="text" name="Hospital_city" value="<%= u.getHospital_city() %>"/></td></tr>
<tr><td>Hospital_state:</td><td><input type="text" name="Hospital_state" value="<%= u.getHospital_state() %>"/></td></tr>
<tr><td>Hospital_zip:</td><td><input type="number" name="Hospital_zip" value="<%= u.getHospital_zip() %>"/></td></tr>
<tr><td> hospital_no_of_beds:</td><td><input type="number" name="hospital_no_of_beds" value="<%= u.getHospital_no_of_beds() %>"/></td></tr>
<tr><td>hospital_no_of_icu:</td><td><input type="number"name="hospital_no_of_icu" value="<%= u.getHospital_no_of_icu() %>"/></td></tr>
<tr><td> hospital_no_of_ot:</td><td><input type="number" name="hospital_no_of_ot" value="<%= u.getHospital_no_of_ot() %>"/></td></tr>
<tr><td> hospital_emergency:</td><td> 
<select class="form-control" id="" name="hospital_emergency" required="required" >
        <option selected>Emergency</option>
        <option>Yes</option>
         <option>No</option>
           </select></tr>
<tr><td>hospital_contactno:</td><td><input type="tel" name="hospital_contactno" value="<%= u.getHospital_contactno() %>"/></td></tr>
</table>
<tr><td colspan=""><input type="submit" class="btn btn-primary" value="UpdateDetails"/></td></tr>
</form>

</body>
</html>
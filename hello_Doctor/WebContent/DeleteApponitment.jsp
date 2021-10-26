<%@page import="com.hello_Doctor.dao.DeleteApponit"%>

<jsp:useBean id="adh" class="com.hello_Doctor.Model.Appointment"></jsp:useBean>
<jsp:setProperty property="*" name="adh"/>

<%
DeleteApponit.delete(adh);
response.sendRedirect("ViewAppointemet.jsp");
%>
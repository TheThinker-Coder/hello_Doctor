<%@page import="com.hello_Doctor.dao.UserDao"%>
<jsp:useBean id="adh" class="com.hello_Doctor.Model.AddHosp"></jsp:useBean>
<jsp:setProperty property="*" name="adh"/>

<%
UserDao.delete(adh);
response.sendRedirect("AdminPannel.jsp");
%>
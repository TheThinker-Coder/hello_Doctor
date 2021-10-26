/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-18 18:22:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hello_Doctor.dao.ApponintmentDao;
import com.hello_Doctor.Model.Appointment;

public final class EditApponitmentView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.hello_Doctor.dao.ApponintmentDao");
    _jspx_imports_classes.add("com.hello_Doctor.Model.Appointment");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Edit Apponitment Details</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t<h1>Edit Hospital Details</h1>\r\n");
      out.write("\r\n");
      out.write("\t");

		String patient_email = request.getParameter("patient_email");
		Appointment u = ApponintmentDao.getRecordbyEmail(patient_email);
	
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\t\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div clas=\"row\" align=\"center\" style=\"width: 1300px;\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<form action=\"EditApponitment\" method=\"post\"enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t<input type=\"hidden\" name=\"patient_email\"\r\n");
      out.write("\t\t\t\t\t\tvalue=\"");
      out.print(u.getPatient_email());
      out.write("\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_name</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" name=\"patient_name\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
      out.print(u.getPatient_name());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_email</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" name=\"patient_email\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
      out.print(u.getPatient_email());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_mobile</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" name=\"patient_mobile\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
      out.print(u.getPatient_mobile());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>doctorname</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" name=\"doctorname\"\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control\" value=\"");
      out.print(u.getDoctorname());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_appointmentdate</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"patient_appointmentdate\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getPatient_appointmentdate());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_timeofappointment</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"patient_timeofappointment\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getPatient_timeofappointment());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>patient_reasonforappointment</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input readonly class=\"form-control-plaintext\"\r\n");
      out.write("\t\t\t\t\t\t\ttype=\"text\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tname=\"patient_reasonforappointment\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getPatient_reasonforappointment());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Createddate</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\"Createddate\" readonly\r\n");
      out.write("\t\t\t\t\t\t\tclass=\"form-control-plaintext\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getCreateddate());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>filename</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"text\" name=\" filename\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\treadonly class=\"form-control-plaintext\"\r\n");
      out.write("\t\t\t\t\t\t\tvalue=\"");
      out.print(u.getFileName());
      out.write("\" /></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td>Upload File</td>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"file\" name=\"file\" class=\"form-control-file\"\r\n");
      out.write("\t\t\t\t\t\t\tid=\"exampleFormControlFile1\"></td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">Save</button>\r\n");
      out.write("\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- scrpit start -->\r\n");
      out.write("\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\t<!-- script end -->\r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
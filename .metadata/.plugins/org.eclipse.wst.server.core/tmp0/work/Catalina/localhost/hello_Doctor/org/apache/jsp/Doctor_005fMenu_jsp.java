/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-20 13:44:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hello_Doctor.Model.Doctor_Regi;

public final class Doctor_005fMenu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.hello_Doctor.Model.Doctor_Regi");
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Doctor_Regi doctor_Regi = (Doctor_Regi) session.getAttribute("currentdoctor");
	if (doctor_Regi == null) {
		response.sendRedirect("DoctorIndex.jsp");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Doctor Menu</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\t\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("\t<nav id=\"navbar-example2\" class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"index.html\">HELLO DOCTOR</a>\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t<li class=\"nav-item\">\r\n");
      out.write("\t\t<form  action =\"ViewAppointemet.jsp\"class= \"form-inline\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"form-group mx-sm-3 mb-2\">\r\n");
      out.write("\t\t <input type=\"hidden\" name=\"name\" value=\"");
      out.print(doctor_Regi.getDoctor_fullname());
      out.write("\" />\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-primary mb-2\">View Apponitement\r\n");
      out.write("\t</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</li>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#profile\">");
      out.print(doctor_Regi.getDoctor_fullname());
      out.write("<br></a>\r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<!-- Modal -->\r\n");
      out.write("\t<div class=\"modal fade\" id=\"profile\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("\t\taria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("\t\t\t<div class=\"modal-content \">\r\n");
      out.write("\t\t\t\t<div class=\"modal-header text-center\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"modal-title\" id=\"exampleModalLabel\">HELLO DOCTOR</h5>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("\t\t\t\t\t\taria-label=\"Close\">\r\n");
      out.write("\t\t\t\t\t\t<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"modal-body\">\r\n");
      out.write("\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\tWelcome to profile\r\n");
      out.write("\t\t\t\t\t\t");
      out.print(doctor_Regi.getDoctor_fullname());
      out.write("&nbsp; &nbsp;<a href=\"index.html\">Logout</a>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<!-- dateils -->\r\n");
      out.write("\t\t\t\t\t<div id=\"profile-Det\">\r\n");
      out.write("\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<tbody>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\">Doctor id</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(doctor_Regi.getDoctor_id());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\">Doctor  Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(doctor_Regi.getDoctor_fullname());
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\">Doctor Email</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(doctor_Regi.getDoctor_email());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<th scope=\"row\">Doctor mobile</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>");
      out.print(doctor_Regi.getDoctor_mobile());
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<!-- profile Edit -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<div id=\"profile-edit\" style=\"display: none;\">\r\n");
      out.write("\t\t\t\t\t\t<h3>Please Edit Carefully</h3>\r\n");
      out.write("\t\t\t\t\t\t<form action=\"Edit_DoctorProfile\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t<input type=\"hidden\" name=\"id\"\r\n");
      out.write("\t\t\t\t\t\t\t\tvalue=\"");
      out.print(doctor_Regi.getDoctor_id());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t<table class=\"table\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doctor Name</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"text\" name=\"name\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(doctor_Regi.getDoctor_fullname());
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doctor Email</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"email\" name=\"email\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(doctor_Regi.getDoctor_email());
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doctor Mobile</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"tel\" name=\"mobile\" class=\"form-control\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(doctor_Regi.getDoctor_mobile());
      out.write("\"></td>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td>Doctor Password</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<td><input type=\"password\" id=\"password\" name=\"password\"\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tplaceholder=\"MobileNumber\" class=\"form-control\" required\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\tvalue=\"");
      out.print(doctor_Regi.getDoctor_password());
      out.write("\" />\r\n");
      out.write("\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"container text-center\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-primary\">save</button>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("\t\t\t\t\t\tdata-dismiss=\"modal\">Close</button>\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" id=\"Edit-profile\" class=\"btn btn-primary\">Edit</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t\t$(document).ready(function() {\r\n");
      out.write("\t\t\t\tlet editStatus = false;\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t$('#Edit-profile').click(function() {\r\n");
      out.write("\t\t\t\t\t//alert(\"buttom\")\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\tif (editStatus == false) {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#profile-Det\").hide()\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#profile-edit\").show()\r\n");
      out.write("\t\t\t\t\t\teditStatus = true;\r\n");
      out.write("\t\t\t\t\t\t$(this).text(\"Back\")\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#profile-Det\").show()\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t$(\"#profile-edit\").hide()\r\n");
      out.write("\t\t\t\t\t\teditStatus = false;\r\n");
      out.write("\t\t\t\t\t\t$(this).text(\"Edit\")\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t})\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t<!--jsend-->\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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

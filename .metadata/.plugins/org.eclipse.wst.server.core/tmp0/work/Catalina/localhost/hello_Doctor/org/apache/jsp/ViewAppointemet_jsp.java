/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-05-21 07:01:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hello_Doctor.util.DbConnection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class ViewAppointemet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

Connection con = null;
	PreparedStatement ps = null;
	ResultSet rst = null;
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
    _jspx_imports_classes.add("com.hello_Doctor.util.DbConnection");
    _jspx_imports_classes.add("java.sql.Connection");
    _jspx_imports_classes.add("java.sql.ResultSet");
    _jspx_imports_classes.add("java.sql.PreparedStatement");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Appointment Page</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav id=\"navbar-example2\" class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"Doctor_Menu.jsp\">HELLO DOCTOR</a>\r\n");
      out.write("\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<li class=\"nav-item\"><a class=\"nav-link\" >\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"modal\" data-target=\"\"><br></a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<table class=\"table table-striped\">\r\n");
      out.write("\t\t<thead class=\"\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<th>Name</th>\r\n");
      out.write("\t\t\t\t<th>Email</th>\r\n");
      out.write("\t\t\t\t<th>Mobile</th>\r\n");
      out.write("\t\t\t\t<th>DoctorName</th>\r\n");
      out.write("\t\t\t\t<th>Date</th>\r\n");
      out.write("\t\t\t\t<th>Time</th>\r\n");
      out.write("\t\t\t\t<th>Reason</th>\r\n");
      out.write("\t\t\t\t<th>Type</th>\r\n");
      out.write("\t\t\t\t<th>Download</th>\r\n");
      out.write("\t\t\t\t<th>Edit</th>\r\n");
      out.write("\t\t\t\t<th>Delete</th>\r\n");
      out.write("\t\t\t\t");

					String doctorname = request.getParameter("name");
					con = DbConnection.GetConnection();
					String sql = "select * from appointment where doctorname=?";
					ps = con.prepareStatement(sql);
					ps.setString(1, doctorname);
					rst = ps.executeQuery();
					while (rst.next()) {
				
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(2));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(3));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getLong(4));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(5));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(6));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(7));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print( rst.getString(8));
      out.write("</td>\r\n");
      out.write("\t\t\t\t<td>online</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<td><a href=\"DownloadServlet?fileName=");
      out.print(rst.getString(10));
      out.write("\">Download</a></td>\r\n");
      out.write("           \r\n");
      out.write("           <td><a href=\"EditApponitmentView.jsp?patient_email=");
      out.print(rst.getString(3));
      out.write("\">Edit</a></td>\r\n");
      out.write("           \r\n");
      out.write("          <td><a href=\"DeleteApponitment.jsp?patient_id=");
      out.print(rst.getInt(1) );
      out.write("\">Delete</a></td>\r\n");
      out.write("           \r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </table><br>\r\n");
      out.write("\t<!-- script -->\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<!-- script end -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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

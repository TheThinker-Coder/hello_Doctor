/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.43
 * Generated at: 2021-06-01 11:54:54 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.hello_Doctor.Model.Patient;

public final class startchat_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("com.hello_Doctor.Model.Patient");
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
      out.write("\t\r\n");

	Patient patient1 = (Patient) session.getAttribute("currentuser");
	if (patient1 == null) {
		response.sendRedirect("index.html");
	}

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("     <style media=\"screen\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("        .chat {\r\n");
      out.write("                width: 100%;\r\n");
      out.write("                height: 200px;\r\n");
      out.write("                border: 1px solid silver;\r\n");
      out.write("                overflow-y: scroll;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #msg {width: 99%;}\r\n");
      out.write("\r\n");
      out.write("        h1 {text-align: center;}\r\n");
      out.write("\r\n");
      out.write("        </style>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("       \r\n");
      out.write("        <title>The Chat Room</title>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("    var wsUrl;\r\n");
      out.write("    if (window.location.protocol == 'http:') {\r\n");
      out.write("        wsUrl = 'ws://';\r\n");
      out.write("    } else {\r\n");
      out.write("        wsUrl = 'wss://';\r\n");
      out.write("    }\r\n");
      out.write("    var ws = new WebSocket(wsUrl + window.location.host + \"/hello_Doctor/chat\");\r\n");
      out.write("        \r\n");
      out.write("    ws.onmessage = function(event) {\r\n");
      out.write("      var mySpan = document.getElementById(\"chat\");\r\n");
      out.write("      mySpan.innerHTML+=event.data+\"<br/>\";\r\n");
      out.write("    };\r\n");
      out.write("     \r\n");
      out.write("    ws.onerror = function(event){\r\n");
      out.write("        console.log(\"Error \", event)\r\n");
      out.write("    } \r\n");
      out.write("    function sendMsg() {\r\n");
      out.write("        var msg = document.getElementById(\"msg\").value;\r\n");
      out.write("        if(msg)\r\n");
      out.write("        {\r\n");
      out.write("            ws.send(msg);\r\n");
      out.write("        }\r\n");
      out.write("        document.getElementById(\"msg\").value=\"\";\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    function addText()\r\n");
      out.write("    {\r\n");
      out.write("        var username = document.getElementById('msg').value;\r\n");
      out.write("        var msg = document.getElementById('h').value;\r\n");
      out.write("        olist = document.getElementById('list');\r\n");
      out.write("        op = document.createElement('p');\r\n");
      out.write("        op.innerHTML = username + \"- <g>\" + msg + \"</g>\";\r\n");
      out.write("        ocontent = document.getElementById('content');\r\n");
      out.write("        ocontent.appendChild(op);             //Add new line on click\r\n");
      out.write("        olist.scrollTop = olist.scrollHeight; //Adjust Height\r\n");
      out.write("        document.getElementById('h').value = '';\r\n");
      out.write("        var xmlhttp;\r\n");
      out.write("        if (window.XMLHttpRequest)\r\n");
      out.write("        {// code for IE7+, Firefox, Chrome, Opera, Safari\r\n");
      out.write("            xmlhttp = new XMLHttpRequest();\r\n");
      out.write("        }\r\n");
      out.write("        else\r\n");
      out.write("        {\r\n");
      out.write("            xmlhttp = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        xmlhttp.open(\"POST\", \"chatstore?uname=\" + username + \"&msg=\" + msg, true);\r\n");
      out.write("\r\n");
      out.write("        xmlhttp.onreadystatechange = function()\r\n");
      out.write("        {\r\n");
      out.write("            if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\r\n");
      out.write("            {\r\n");
      out.write("                document.getElementById(\"result\").innerHTML = 'sent';\r\n");
      out.write("                document.getElementById(\"result\").innerHTML = '';\r\n");
      out.write("            }\r\n");
      out.write("        }\r\n");
      out.write("        xmlhttp.send(null);\r\n");
      out.write("    }\r\n");
      out.write("        \r\n");
      out.write("</script>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\"\r\n");
      out.write("\t\thref=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("\t\tintegrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\">\r\n");
      out.write("\t<nav id=\"navbar-example2\" class=\"navbar navbar-dark bg-dark\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"Menu.jsp\">HELLO DOCTOR</a>\r\n");
      out.write("\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#doctorinfo\"> Doctor Info </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#contact1\"> Contact Us </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\tdata-toggle=\"modal\" data-target=\"#appointment\"> Appointment </a></li>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t<ul class=\"nav nav-pills\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"\r\n");
      out.write("\t\t\t\t\tdata-toggle=\"modal\" data-target=\"#profile\"> ");
      out.print(patient1.getPatient_name());
      out.write("<br></a>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("        <p id=\"result\"></p>\r\n");
      out.write("        Welcome, ");
      out.print(patient1.getPatient_name());
      out.write("\r\n");
      out.write("       \r\n");
      out.write("            <div id=\"chat\" class = \"chat\">\r\n");
      out.write("            </div>\r\n");
      out.write("              <input type=\"text\"  class=\"form-control\"name=\"msg\" id=\"msg\">\r\n");
      out.write("              <br>\r\n");
      out.write("              <br>\r\n");
      out.write("             \r\n");
      out.write("              <button  class=\"btn btn-primary\" onclick=\"return sendMsg();\">Send Message </button>\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("     <!-- scrpit start -->\r\n");
      out.write("\r\n");
      out.write("\t\t<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"\r\n");
      out.write("\t\t\tintegrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\"\r\n");
      out.write("\t\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("\t\t\tintegrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("\t\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t\t<script\r\n");
      out.write("\t\t\tsrc=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("\t\t\tintegrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("\t\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- script end -->\r\n");
      out.write("     \r\n");
      out.write("     \r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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

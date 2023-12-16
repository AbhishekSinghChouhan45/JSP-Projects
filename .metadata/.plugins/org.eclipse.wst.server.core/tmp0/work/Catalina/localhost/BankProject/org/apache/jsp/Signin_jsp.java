/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2023-12-12 07:59:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;

public final class Signin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
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

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
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

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
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

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>RBI Registration</title>\r\n");
      out.write("	<link rel=\"icon\" href=\"RBI-Emblem-PNG.png\" type=\"image/png\">\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            background-image: url('https://images.hindustantimes.com/img/2021/07/24/1600x900/RBI_1627088344086_1627088360876.jpg'); /* Add your background image URL */\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            font-family: 'Arial', sans-serif;\r\n");
      out.write("            color: white;\r\n");
      out.write("            background-color: #f4f4f4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form {\r\n");
      out.write("            margin: 5% auto;\r\n");
      out.write("            background-color: rgba(0, 0, 0, 0.7);\r\n");
      out.write("            padding: 30px;\r\n");
      out.write("            border-radius: 10px;\r\n");
      out.write("            width: 400px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            box-shadow: 0 0 20px rgba(255, 255, 255, 0.1);\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form h2 {\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            margin-bottom: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form input {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-bottom: 2px solid white;\r\n");
      out.write("            background: transparent;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form button {\r\n");
      out.write("            font-size: 18px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            background-color: #4CAF50;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            border-radius: 8px;\r\n");
      out.write("            cursor: pointer;\r\n");
      out.write("            margin-right: 60%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form button:hover {\r\n");
      out.write("            background-color: #00134d;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form a {\r\n");
      out.write("            font-size: 16px;\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("            display: inline-block;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #registration-form a:hover {\r\n");
      out.write("            text-decoration: underline;\r\n");
      out.write("            color: #4CAF50;\r\n");
      out.write("        }\r\n");
      out.write("        #registration-form select {\r\n");
      out.write("    		font-size: 18px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            border-bottom: 2px solid white;\r\n");
      out.write("            background: transparent;\r\n");
      out.write("            color: white;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 10px 0;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            box-sizing: border-box;\r\n");
      out.write("	}\r\n");
      out.write("	  #registration-form select option{\r\n");
      out.write("		  background-color: #333;\r\n");
      out.write("	  }\r\n");
      out.write("	  #msg{\r\n");
      out.write("	  	color: lightgreen;\r\n");
      out.write("		margin-top: 2%;\r\n");
      out.write("		margin-left: 25%;\r\n");
      out.write("		border: medium;\r\n");
      out.write("/* 		background: black; */\r\n");
      out.write("/* 		box-sizing: border-box; */\r\n");
      out.write("		box-shadow: 0 0 15px green;\r\n");
      out.write("	  }\r\n");
      out.write("    </style>\r\n");
      out.write("     <script>\r\n");
      out.write("        document.addEventListener('DOMContentLoaded', function () {\r\n");
      out.write("            var msgValue = '");
      out.print( request.getAttribute("msg") );
      out.write("';\r\n");
      out.write("            if (msgValue === '1') {\r\n");
      out.write("                alert('Customer Details Registered Successfully');\r\n");
      out.write("                setTimeout(function () {\r\n");
      out.write("                    window.location.href = 'index.html';\r\n");
      out.write("                }, 1000);\r\n");
      out.write("            } else if (msgValue === '0') {\r\n");
      out.write("                alert('Customer Details Registered Unsuccessfully');\r\n");
      out.write("            }else if (msgValue === '3') {\r\n");
      out.write("                alert('Customer Already Registered');\r\n");
      out.write("            }\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div id=\"registration-form\">\r\n");
      out.write("    <h2>RBI Registration</h2>\r\n");
      out.write("    <form id=\"rform\" method=\"post\" action=\"signin\">\r\n");
      out.write("        <input type=\"text\" name=\"name\" placeholder=\"Name\">\r\n");
      out.write("        <input type=\"text\" name=\"username\" placeholder=\"Username\">\r\n");
      out.write("        <input type=\"password\" name=\"password\" placeholder=\"Password\">\r\n");
      out.write("        <input type=\"date\" name=\"dob\" placeholder=\"DOB\">\r\n");
      out.write("        <select name=\"type\" style=\"width: 100%; padding: 10px; margin: 10px 0; box-sizing: border-box;\" >\r\n");
      out.write("            <option value=\"saving\">Saving</option>\r\n");
      out.write("            <option value=\"investing\">Investing</option>\r\n");
      out.write("            <option value=\"personal\">Personal</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <select name=\"gender\" style=\"width: 100%; padding: 10px; margin: 10px 0; box-sizing: border-box;\">\r\n");
      out.write("            <option value=\"male\">Male</option>\r\n");
      out.write("            <option value=\"female\">Female</option>\r\n");
      out.write("            <option value=\"other\">Other</option>\r\n");
      out.write("        </select>\r\n");
      out.write("        <input type=\"tel\" name=\"number\" placeholder=\"Number\">\r\n");
      out.write("        <input type=\"text\" name=\"address\" placeholder=\"Address\" >\r\n");
      out.write("        <input type=\"number\" name=\"balance\" placeholder=\"Opening balance\">\r\n");
      out.write("       <input type=\"file\" name=\"identity_proof\" placeholder=\"Identity Proof\" accept=\"image/*\" onchange=\"previewImage(event)\">\r\n");
      out.write("		 <button type=\"submit\">Register</button>\r\n");
      out.write("        <a href=\"#\" onclick=\"document.getElementById('rform').reset(); return false;\">Reset</a>\r\n");
      out.write("        \r\n");
      out.write("    </form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
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

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.37
 * Generated at: 2016-10-03 06:30:12 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.UserPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class UserAddEdit_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/footer.jsp", Long.valueOf(1473931116211L));
    _jspx_dependants.put("/header.jsp", Long.valueOf(1473931116110L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("\t\t<link href='/SampleWebApp/Css/Theme.css' rel='stylesheet' type='text/css'>\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"/SampleWebApp/Css/TemplateStyles.css\">\r\n");
      out.write("\t\t<script src=\"/SampleWebApp/Js/jquery.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/SampleWebApp/Js/Template.js\" ></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"/SampleWebApp/Js/App.js\" ></script>\r\n");
      out.write("\t\t<title>Sample Web Application</title>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<table class=\"flatTable\">\r\n");
      out.write("\t\t\t<tr class=\"headerTr\">\r\n");
      out.write("\t\t\t\t<td class=\"titleTd\">Sample Web Application</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr class=\"headerTr\">\r\n");
      out.write("\t\t\t\t<td><a href=\"/SampleWebApp/\" >Home</a> &nbsp; &nbsp; <a href=\"/SampleWebApp/UserList\" >List Users</a> &nbsp; &nbsp; <a href=\"/SampleWebApp/UserPages/UserAddEdit.jsp\" >Add User</a></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<div class=\"page-wrap\">");
      out.write('\r');
      out.write('\n');

	if(request.getParameter("userId") != null){

      out.write("\r\n");
      out.write("\t<form method=\"post\" action=\"/SampleWebApp/UserEditController\">\r\n");
      out.write("\t\t<table class=\"flatTable\">\r\n");
      out.write("\t\t\t<tr class=\"titleTr\">\r\n");
      out.write("\t\t\t\t<td>Add User</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr><td>Name : <input type=\"text\" id=\"userName\" name=\"userName\" value=\"");
      out.print(request.getAttribute("userName"));
      out.write("\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td>Address : <input type=\"text\" id=\"userAddress\" name=\"userAddress\" value=\"");
      out.print(request.getAttribute("userAddress"));
      out.write("\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td>Phone Number : <input type=\"text\" id=\"phoneNumber\" name=\"phoneNumber\" value=\"");
      out.print(request.getAttribute("userPhone"));
      out.write("\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"submit\" id=\"saveUser\" class=\"saveUser\" value=\"Update\"></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<input type=\"hidden\" id=\"userId\" name=\"userId\" value=\"");
      out.print(request.getParameter("userId"));
      out.write("\">\r\n");
      out.write("\t</form>\r\n");

	}
	else{

      out.write("\r\n");
      out.write("\t<form method=\"post\" action=\"/SampleWebApp/UserAddController\">\r\n");
      out.write("\t\t<table class=\"flatTable\">\r\n");
      out.write("\t\t\t<tr class=\"titleTr\">\r\n");
      out.write("\t\t\t\t<td>Add User</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr><td>Name : <input type=\"text\" id=\"userName\" name=\"userName\" value=\"\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td>Address : <input type=\"text\" id=\"userAddress\" name=\"userAddress\" value=\"\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td>Phone Number : <input type=\"text\" id=\"phoneNumber\" name=\"phoneNumber\" value=\"\"></td></tr>\r\n");
      out.write("\t\t\t<tr><td><input type=\"submit\" id=\"saveUser\" class=\"saveUser\" value=\"Save\"></td></tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");

	}

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<footer class=\"site-footer\">\r\n");
      out.write("\t\t\t<table class=\"flatTable\">\r\n");
      out.write("\t\t\t\t<tr class=\"headerTr\">\r\n");
      out.write("\t\t\t\t\t<td class=\"titleTd\">Footer</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</footer>\r\n");
      out.write("\t</body>\r\n");
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
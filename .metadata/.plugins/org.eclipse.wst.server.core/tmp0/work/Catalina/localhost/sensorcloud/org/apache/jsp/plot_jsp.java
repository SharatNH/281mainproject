/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.33
 * Generated at: 2016-05-19 16:33:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class plot_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.0/jquery.min.js\">\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Sensor Status</title>\r\n");
      out.write(" <style type=\"text/css\">\r\n");
      out.write(" \r\n");
      out.write(" <!-- Bootstrap Core CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom Fonts -->\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"font-awesome/css/font-awesome.min.css\" type=\"text/css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/creative.css\" type=\"text/css\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\r\n");
      out.write("<link href='http://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>\r\n");
      out.write("<body style=\"background-image:url('images/precipitate.jpg');background-size: cover;\">\r\n");
      out.write("table\r\n");
      out.write("{\r\n");
      out.write("align=\"center\";\r\n");
      out.write("color: #333;\r\n");
      out.write("font-family: Helvetica, Arial, sans-serif;\r\n");
      out.write("width: 640px; \r\n");
      out.write("text-align:center;\r\n");
      out.write("padding: 15px;\r\n");
      out.write("border-collapse: \r\n");
      out.write("collapse; border-spacing: 0; \r\n");
      out.write("}\r\n");
      out.write("td, th { \r\n");
      out.write("border: 1px solid transparent; \r\n");
      out.write("/* No more visible border */\r\n");
      out.write("height: 30px; \r\n");
      out.write("transition: all 0.3s;  /* Simple transition for hover effect */\r\n");
      out.write("}\r\n");
      out.write("th {\r\n");
      out.write("background-color: #4CAF50;\r\n");
      out.write("    color: white; /* Darken header a bit */\r\n");
      out.write("font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("td {\r\n");
      out.write("background: #FAFAFA;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("tr:hover {background-color: #f5f5f5}\r\n");
      out.write("/* Cells in even rows (2,4,6...) are one color */ \r\n");
      out.write("tr:nth-child(even) td { background: #F1F1F1; }   \r\n");
      out.write("\r\n");
      out.write("/* Cells in odd rows (1,3,5...) are another (excludes header cells)  */ \r\n");
      out.write("tr:nth-child(odd) td { background: #FEFEFE; }  \r\n");
      out.write("\r\n");
      out.write("tr td:hover { background: #666; color: #FFF; } /* Hover cell effect! */\r\n");
      out.write("body\r\n");
      out.write("{\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".container\r\n");
      out.write("{\r\n");
      out.write(" margin-left: auto;\r\n");
      out.write(" margin-right: auto;\r\n");
      out.write(" width: 40em;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write(" $(\"#tablediv\").hide();\r\n");
      out.write("     $(\"#showTable\").click(function(event){\r\n");
      out.write("           $.get('PopulateTable',function(responseJson) {\r\n");
      out.write("            if(responseJson!=null){\r\n");
      out.write("                $(\"#countrytable\").find(\"tr:gt(0)\").remove();\r\n");
      out.write("                var table1 = $(\"#countrytable\");\r\n");
      out.write("                $.each(responseJson, function(key,value) {\r\n");
      out.write("\tvar type=value['len'];\r\n");
      out.write("\tvar cost = type*0.6;\r\n");
      out.write("\tvar t = value['threshold'];\r\n");
      out.write("\tconsole.log(type);\r\n");
      out.write("\tif (t == 1)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar status = 'Live';\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse if (t == 0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\tvar status = 'Deleted';\r\n");
      out.write("\t\t}\r\n");
      out.write("\telse\r\n");
      out.write("\t\tvar status = 'Live';\r\n");
      out.write("                     var rowNew = $(\"<tr><td></td><td></td><td></td><td></td></tr>\");\r\n");
      out.write("                        rowNew.children().eq(0).text(value['sid']); \r\n");
      out.write("                        rowNew.children().eq(1).text(value['sgp']); \r\n");
      out.write("                        rowNew.children().eq(2).text(status);\r\n");
      out.write("\t\t\t\t\t\trowNew.children().eq(3).text(cost);\r\n");
      out.write("                        rowNew.appendTo(table1);\r\n");
      out.write("                });\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("            $(\"#tablediv\").show();          \r\n");
      out.write("  });      \r\n");
      out.write("});\r\n");
      out.write("</script>\r\n");
      out.write("<script>\r\n");
      out.write("     var time = new Date().getTime();\r\n");
      out.write("     $(document.body).bind(\"mousemove keypress\", function(e) {\r\n");
      out.write("         time = new Date().getTime();\r\n");
      out.write("     });\r\n");
      out.write("\r\n");
      out.write("     function refresh() {\r\n");
      out.write("         if(new Date().getTime() - time >= 60000) \r\n");
      out.write("             window.location.reload(true);\r\n");
      out.write("         else \r\n");
      out.write("             setTimeout(refresh, 10000);\r\n");
      out.write("//         alert('inside the refresh function');\r\n");
      out.write("     }\r\n");
      out.write("     setTimeout(refresh, 10000);\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body class =\"container\" style=\"background-image:url('images/background.png');background-size: cover;\">\r\n");
      out.write("<section>\r\n");
      out.write("    <div id=\"container_demo\" >\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            <div id=\"login\" class=\"animate form\">\r\n");
      out.write("\r\n");
      out.write("<h1 style=\"color:White;\">Sensor Status</h1>\r\n");
      out.write("<input type=\"button\" value=\"Show Sensor Status\" id=\"showTable\"/>\r\n");
      out.write("<div id=\"tablediv\">\r\n");
      out.write("<table id=\"countrytable\"> \r\n");
      out.write("\t<tr>\r\n");
      out.write("\t\t<th scope=\"col\">SensorID</th> \r\n");
      out.write("\t\t<th scope=\"col\">SensorGP</th> \r\n");
      out.write("\t\t<th scope=\"col\">Status</th> \r\n");
      out.write("\t\t<th scope=\"col\">You Owe us</th>\r\n");
      out.write("\t</tr> \r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write(" </div>                                              \r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</section> \r\n");
      out.write("</body>\r\n");
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
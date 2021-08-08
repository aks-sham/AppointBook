package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class DocAppoint_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

String id = (String)session.getAttribute("log");
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/today";
String database = "today";
String userid = "today";
String password = "today";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;

      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #ffe780;\">\n");
      out.write("       \n");
      out.write("            ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\n");
      out.write("            <form action=\"ALogout\" style=\"right: 15%; position: absolute; top: 15%;\">\n");
      out.write("            <input type=\"submit\" value=\"  Logout  \" style=\" padding: 10px;\">\n");
      out.write("        </form>\n");
      out.write("            <form action=\"AMenu.jsp\" style=\"left: 15.7%; position: absolute; top: 15%;\">\n");
      out.write("            <input type=\"submit\" value=\"  Admin Menu  \" style=\" padding: 10px;\">\n");
      out.write("        </form>\n");
      out.write("<br style='line-height: 3;'>\n");
      out.write("    <h1 style=\"text-align: center; \">PATIENT  &nbsp; DETAILS</h1>\n");
      out.write("    <br style='line-height: 3;'>\n");
      out.write("<table border=\"1\" style=\"margin-left: 25.2%;\">\n");
      out.write("    <tr>\n");
      out.write("        <td style=\"padding: 10px;\"><b>PATIENT NAME</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>USERNAME</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>EMAIL</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>ADDRESS</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>MOBILE</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>DATE</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>DOCTOR</b></td>\n");
      out.write("        <td style=\"padding: 10px;\"><b>REASON</b></td>\n");
      out.write("\n");
      out.write("</tr>\n");

try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from appoin where doctor =" + id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){

      out.write("\n");
      out.write("<tr>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("name") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("username") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("email") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("address") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("mobile") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("adate") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("doctor") );
      out.write("</td>\n");
      out.write("<td style=\"padding: 10px;\">");
      out.print(resultSet.getString("reason") );
      out.write("</td>\n");
      out.write("</tr>\n");

}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

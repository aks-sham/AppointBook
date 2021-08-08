package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class PRegister_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body style=\"background-color: #E7717D;  border: solid #ffffff 6px\">\n");
      out.write("        <br style=\"line-height: 5.7;\">\n");
      out.write("        <div style=\"background-color: #ffffff ;  border: solid #000000 6px; left: 15%; position: absolute; padding: 30px 50px 20px; left: 35%\">\n");
      out.write("        <br style=\"line-height: 1;\">\n");
      out.write("        <h1 style=\"text-align: center; position: relative;\">Enter User's Details</h1>\n");
      out.write("        <br style=\"line-height: 1.5;\">\n");
      out.write("        <form style=\"padding-left: 15%;\" action=\"InfoAdd\" method=\"post\" >  \n");
      out.write("                Username:<input type=\"text\" name=\"usernam\"/><br/><br/>\n");
      out.write("                Password:<input type=\"password\" name=\"userpass\"/><br/><br/>\n");
      out.write("                Name:<input type=\"text\" name=\"name\"/><br/><br/>  \n");
      out.write("                Mobile:<input type=\"number\" name=\"number\"><br/><br/>\n");
      out.write("                Age:<input type=\"number\" name=\"age\"><br/><br/>\n");
      out.write("                Sex:<input type=\"text\" name=\"sex\"><br/><br/>\n");
      out.write("                <input type=\"submit\" value=\"Sign-Up\" style=\"margin-left: 85px;\">  \n");
      out.write("            </form>  \n");
      out.write("        <br style=\"line-height: 2;\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("        <br style=\"line-height: 39;\">\n");
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

package Patient;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class PatAppoint extends HttpServlet {
String id,a,b,c,d,e,f,g;
Connection dbconnection;
ResultSet resultset;
     public void init() throws ServletException {
        ServletConfig config = getServletConfig();
        String driverClassName = config.getInitParameter("driverclassname");
        String dbURL = config.getInitParameter("dburl");
        String username = config.getInitParameter("username");
        String dbpassword = config.getInitParameter("dbpassword");
            try
            {
                Class.forName(driverClassName);
            }
            catch(ClassNotFoundException cnfe)
            {
            System.err.println("Error loading driver: " + cnfe);
             }
            
            try
              {
                dbconnection = DriverManager.getConnection(dbURL, username, dbpassword);
                 }
            catch(SQLException sqle)
         {
            System.err.println("Connection error: " + sqle);
         }
        
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        id = (String)session.getAttribute("log");
        try (PrintWriter out = response.getWriter()) {
            
        if(session.getAttribute("log")==null)
            {
                response.sendRedirect("PLog.jsp");
            }
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PatAppoin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<br/><br/><h1 style='text-align: center;'> MY APPOINTMENTS (" + id + ")</h1><br/><br/>");
            out.println("<form action='PMenu.jsp' style='left: 15.7%; position: absolute; top: 12%;'>\n" +
"            <input type='submit' value='  Patient Menu  'style=' padding: 15px;'>\n" +
"        </form><br/><br/><br/>");
             out.println("<table border='3' bordercolor='red' style='margin-left: 27.7%;'>" +
                "<tr><th style='padding: 10px;'>NAME</th><" +
                "th style='padding: 10px;'>EMAIL</th>" +
                "<th style='padding: 10px;'>ADDRESS</th>" +
                "<th style='padding: 10px;'>MOBILE</th>" +
                "<th style='padding: 10px;'>DATE</th>" +
                "<th style='padding: 10px;'>DOCTOR</th>" +
                "<th style='padding: 10px;'>REASON</th></tr>" );
                
                

             try
        {
            Statement statement = dbconnection.createStatement();
            String sqlString = "SELECT NAME,EMAIL,ADDRESS, MOBILE, ADATE,DOCTOR, REASON FROM appoin WHERE username='"+ id + "'";
            resultset=statement.executeQuery(sqlString);
            while(resultset.next())
            {
                a=resultset.getString("NAME");
                out.println("<tr><th style='padding: 10px;'>"+a+"</th>");
                b=resultset.getString("EMAIL");
                out.println("<th style='padding: 10px;'>"+b+"</th>");
                c=resultset.getString("ADDRESS");
                out.println("<th style='padding: 10px;'>"+c+"</th>");
                d=resultset.getString("MOBILE");
                out.println("<th style='padding: 10px;'>"+d+"</th>");
                e=resultset.getString("ADATE");
                out.println("<th style='padding: 10px;'>"+e+"</th>");
                g=resultset.getString("DOCTOR");
                out.println("<th style='padding: 10px;'>"+"Dr."+g+"</th>");
                f=resultset.getString("REASON");
                out.println("<th style='padding: 10px;'>"+f+"</th></tr>");
            }
            
        }
        catch(SQLException sqle)
        {
            System.err.println("Connection error: " + sqle);
        }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}

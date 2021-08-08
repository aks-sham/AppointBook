package Patient;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoAdd extends HttpServlet {
Connection dbconnection;

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
        try( PrintWriter out = response.getWriter())
        {
           String n=request.getParameter("usernam");
           String u=request.getParameter("userpass");
           String am=request.getParameter("name");
           String nm=request.getParameter("number");
           String ag=request.getParameter("age");
           String se=request.getParameter("sex");
         try
        {
            PreparedStatement abc = dbconnection.prepareStatement("insert into PLOGIN values(?,?,?,?,?,?)");
            abc.setString(1,n); 
            abc.setString(2,u);
            abc.setString(3,am);
            abc.setString(4,nm);
            abc.setString(5,ag);
            abc.setString(6,se);
            abc.executeUpdate();  
            dbconnection.close();
            response.sendRedirect(request.getContextPath() + "/User_Added.jsp");
        }
        catch(SQLException sqle)
        {
            System.err.println("Connection error: " + sqle);
            out.println("Could not insert the information");
            out.println("<br/>");
            out.println("Error Occured");
        }
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

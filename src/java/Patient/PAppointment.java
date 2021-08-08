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

public class PAppointment extends HttpServlet {
Connection dbconnection;
String id;
  
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
        try (PrintWriter out = response.getWriter()) 
            {
           String name=request.getParameter("name");
           String mail=request.getParameter("email");
           String add=request.getParameter("address");
           String mob=request.getParameter("mobile");
           String date=request.getParameter("adate");
           String doc=request.getParameter("doctor");
           String reas=request.getParameter("reason");
           
         
         try
        {
            PreparedStatement abc = dbconnection.prepareStatement("insert into appoin values(?,?,?,?,?,?,?,?)");
            abc.setString(1,id); 
            abc.setString(2, name);
            abc.setString(3,mail);
            abc.setString(4,add);
            abc.setString(5,mob);
            abc.setString(6,date);
            abc.setString(7,doc);
            abc.setString(8,reas);
            abc.executeUpdate();  
            
            response.sendRedirect(request.getContextPath() + "/Appoint_created.jsp");
        }
        catch(SQLException sqle)
        {
            System.err.println("Connection error: " + sqle);
            out.println("Could not insert the information");
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

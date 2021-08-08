package doctor;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Doctor_Info_Add extends HttpServlet {
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
           String un=request.getParameter("dusername");
           String up=request.getParameter("duserpass");
           String nam=request.getParameter("dname");
           String num=request.getParameter("dnumber");
           String age=request.getParameter("dage");
           String exp=request.getParameter("dexperience");
           String spe=request.getParameter("dspecialization");
           String sex=request.getParameter("dsex");
           
         
         try
        {
            PreparedStatement abc = dbconnection.prepareStatement("insert into doctor values(?,?,?,?,?,?,?,?)");
            abc.setString(1,un); 
            abc.setString(2, up);
            abc.setString(3,nam);
            abc.setString(4,num);
            abc.setString(5,age);
            abc.setString(6,exp);
            abc.setString(7,spe);
            abc.setString(8,sex);
            abc.executeUpdate();  
            dbconnection.close();
            response.sendRedirect(request.getContextPath() + "/Doc_Added.jsp");
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

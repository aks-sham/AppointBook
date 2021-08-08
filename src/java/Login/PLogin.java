package Login;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class PLogin extends HttpServlet {
    
String userid;
String password;
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
        try( PrintWriter out = response.getWriter())
        {
           String s1=request.getParameter("username");
           String ps=request.getParameter("userpass");
         
         try
        {
            Statement statement = dbconnection.createStatement();
            String sqlString = "SELECT * FROM PLogin WHERE username='"+ s1 +"'AND userpass='"+ ps +"'";
            resultset=statement.executeQuery(sqlString);
            while(resultset.next())
            {
                userid = resultset.getString("username");
                password = resultset.getString("userpass");
            }

        }
        catch(SQLException sqle)
        {
            System.err.println("Connection error: " + sqle);
        }
        if(userid.equals(request.getParameter("username")) && password.equals(request.getParameter("userpass")))
        {   HttpSession session = request.getSession();
            session.setAttribute("log",s1);
            response.sendRedirect("PMenu.jsp");
        }
        else 
        {   
            out.println("Authentication Failed");
            
        }
        out.close();
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
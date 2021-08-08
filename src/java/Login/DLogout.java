package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DLogout extends HttpServlet {

  
  
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.removeAttribute("log");
        session.invalidate();
         response.sendRedirect("DLog.jsp");
    }
}

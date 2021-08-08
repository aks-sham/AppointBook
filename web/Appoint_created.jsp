<%-- 
    Document   : Appoint_created
    Created on : 26 Mar, 2020, 12:17:38 AM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: gainsboro;">
         <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("PLog.jsp");
            }
            %>
        <br style="line-height: 11.7;">
        <h1 style="text-align: center;">APPOINTMENT CREATED SUCCESSFULLY</h1>
        <br style="line-height: 2.7;">
        
        <a href="PMenu.jsp" style="border: 3px solid brown; left: 45%; position: relative; text-decoration: none; padding: 5px;">Click for Patient Menu</a>
        <br style="line-height: 7;">
        <a href="PLogout" style="border: 3px solid brown; left: 46.7%; position: relative; text-decoration: none; padding: 5px;">Click to Logout</a>
    </body>
</html>

<%-- 
    Document   : Doc_Added
    Created on : 25 Mar, 2020, 1:51:58 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #FFFF99">
        <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("ALog.jsp");
            }
            %>
        <br style="line-height: 5.7;">
        <h1 style="text-align: center;">DOCTOR DETAILS ADDED</h1>
        <br style="line-height: 2.7;">
        <a href="DInfoAdd.jsp"  style="border: 3px solid brown; left: 45.7%; position: relative;text-decoration: none; padding: 5px;">Click to enter more</a>
        <br style="line-height: 3.7;">
        <a href="AMenu.jsp" style="border: 3px solid brown; left: 45%; position: relative; text-decoration: none; padding: 5px;">Click for Admin Menu</a>
        <br style="line-height: 9.7;">
        <a href="ALogout" style="border: 3px solid brown; left: 46.2%; position: relative; text-decoration: none; padding: 5px;">Click to Logout</a>
    </body>
</html>

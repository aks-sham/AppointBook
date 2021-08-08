<%-- 
    Document   : DMenu
    Created on : 26 Mar, 2020, 11:19:06 AM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #33ccff">
        <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("DLog.jsp");
            }
            %>
        <h1 style="position: absolute; left: 35%;  ">Welcome to Doctor Menu</h1>
        <br style="line-height: 5">
        <h2 style="padding-left: 70px;">Click your choice</h2>
        <br style="line-height: 7">
        
        <form action="TodayAppoint" method="post">
            <input type="submit" value="TODAY'S APPOINTMENTS">
        </form>
         <br style="line-height: 5">
        <form action="ShowAppoin" method="post">
            <input type="submit" value="ALL OF MY APPOINTMENTS">
        </form>
        <br style="line-height: 5">
        
        <form action="DLogout">
            <input type="submit" value="Logout  ">
        
    </body>
</html>

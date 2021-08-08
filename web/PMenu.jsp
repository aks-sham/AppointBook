<%-- 
    Document   : PMenu
    Created on : 29 Feb, 2020, 5:44:25 PM
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
                response.sendRedirect("PLog.jsp");
            }
            %>
        
        
        <h1 style="position: absolute; left: 35%;  ">Welcome to Patient Menu</h1>
        <br style="line-height: 5">
        <h2 style="padding-left: 70px;">Click your choice</h2>
        <br style="line-height: 7">
        <form action="PAppoint.jsp" method="post">
            <input type="submit" value="BOOK APPOINTMENT">
        </form>
        <br/><br/><br/>
        <form action="PatAppoint" method="post">
            <input type="submit" value="MY APPOINTMENTS">
        </form>
        <br/><br/><br/>
        <form action="PLogout">
            <input type="submit" value="Logout  ">
        </form>
    </body>
</html>

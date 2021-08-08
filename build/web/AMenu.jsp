<%-- 
    Document   : AMenu
    Created on : 25 Mar, 2020, 1:53:24 AM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #5CDB95">
        <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("ALog.jsp");
            }
            %>
        <h1 style="position: absolute; left: 35%;  ">Welcome to ADMIN MENU</h1>
        <br style="line-height: 5">
        <h2 style="padding-left: 70px;">Click your choice</h2>
        <br style="line-height: 7">
        <form action="DInfoAdd.jsp" method="post">
            <input type="submit" value="Add Doctor">
        </form>
        <br style="line-height: 3">
        <form action="DRetrieve.jsp" method="post">
            <input type="submit" value="View Doctor">
        </form>
        <br style="line-height: 3">
        <form action="ViewPatient.jsp" method="post">
            <input type="submit" value="View Patient">
        </form>
        <br style="line-height: 3">
        <form action="ALogout">
            <input type="submit" value="Logout  ">
        </form>
    </body>
</html>

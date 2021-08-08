<%-- 
    Document   : Home
    Created on : 21 Mar, 2020, 7:26:29 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color:#FFFF00">
        <br style="line-height: 0.6;">
        <h1 style="text-align: center; position: relative;">Hello!</h1>
        <h1 style="text-align:center; position: relative;">Welcome to Doctor Management System</h1>
        <br style="line-height: 1;">
        <form action="DoctorHome.jsp" method="post" style="position: absolute; left: 45.9%">
            <input type="submit" value="DOCTOR LIST" style="padding: 10px;">
        </form>
        <br style="line-height: 3.7;">
        <img src="images/home.jpg" alt="Home_image" style="left: 10%; position: relative;">
        <br style="line-height: 3;">
        <a href="PLog.jsp" style=" margin-left: 21.7%; ">PATIENT</a>
        <a href="DLog.jsp" style=" margin-left: 21.7%; ">DOCTOR</a>
        <a href="ALog.jsp" style=" margin-left: 21.7%; ">ADMIN</a>
        
    </body>
</html>

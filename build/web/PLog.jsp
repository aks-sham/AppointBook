<%-- 
    Document   : Start
    Created on : 29 Feb, 2020, 2:26:03 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #00FFFF">
        
        <br style="line-height: 1.7;">
        <h1 style="text-align: center; position: relative;">Hello!</h1>
        <br style="line-height: 1.5;">
        <h1 style="text-align:center; position: relative;">Welcome to Login Portal</h1>
        <br style="line-height: 3;">
            <form style="padding-left: 42%" action="PLogin" method="post">  
                <p style="padding-left: 5%;"><b>Patient Login</b><br style="line-height: 3"></p>
                 Enter Username:<input type="text" name="username"/><br/><br/>  
                 Enter Password:<input type="password" name="userpass"/><br/><br/>  
                 <input type="submit" value="login" style="margin-left: 30px">  
                 <a href="PRegister.jsp" style="margin-left: 70px;">Register</a>
            </form>  
        <form style="right: 15%; top: 20%;position: absolute;" action="Home.jsp" >  
            <input type="submit" value="HOME" style=" padding: 15px;">  
            </form>  
    </body>
</html>

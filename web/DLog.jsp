<%-- 
    Document   : DLog
    Created on : 24 Mar, 2020, 2:52:24 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #09eb09;  border: solid #ffffff 25px">
        <form style="right: 15%; top: 20%;position: absolute;" action="Home.jsp" >  
            <input type="submit" value="HOME" style=" padding: 15px;">  
            </form>  
        <br style="line-height: 3.7;">
        <h1 style="text-align: center; position: relative;">Hello!</h1>
        <br style="line-height: 1.5;">
        <h1 style="text-align:center; position: relative;">Welcome to Login Portal</h1>
        <br style="line-height: 3;">
        <form style="padding-left: 42%;" action="DLogin" method="post" >  
                <p style="padding-left: 7%;"><b>Doctor Login</b><br style="line-height: 3"></p>
                 Enter Username:<input type="text" name="username"/><br/><br/>  
                 Enter Password:<input type="password" name="userpass"/><br/><br/>  <br/>
                 <input type="submit" value="login" style="margin-left: 90px;">  
            </form>  
        <br style="line-height: 11.5;">
    </body>
</html>

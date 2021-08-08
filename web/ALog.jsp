<%-- 
    Document   : ALog
    Created on : 24 Mar, 2020, 3:03:53 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #FF0000;  border: solid #ffffff 6px">
        <form style="right: 15%; top: 20%;position: absolute;" action="Home.jsp" >  
            <input type="submit" value="HOME" style=" padding: 15px;">  
            </form>  
        <br style="line-height: 5.7;">
        <div style="background-color: #ffffff ;  border: solid #000000 6px; left: 15%; position: absolute; padding: 30px 50px 20px; left: 35%">
        <br style="line-height: 1.7;">
        <h1 style="text-align: center; position: relative;">Hello!</h1>
        <br style="line-height: 1.5;">
        <h1 style="text-align:center; position: relative;">Welcome to Login Portal</h1>
         
        <br style="line-height: 1;">
        <form style="padding-left: 17%;" action="ALogin" method="post" >  
                <p style="padding-left: 21%;"><b>Admin Login</b><br style="line-height: 3"></p>
                 Enter Username:<input type="text" name="username"/><br/><br/>  
                 Enter Password:<input type="password" name="userpass"/><br/><br/>  <br/>
                 <input type="submit" value="login" style="margin-left: 90px;">  
            </form>  
        <br style="line-height: 2;">
                </div>

        <br style="line-height: 39;">
    </body>
</html>

<%-- 
    Document   : PRegister
    Created on : 25 Mar, 2020, 2:53:54 PM
    Author     : aksha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #E7717D;  border: solid #ffffff 6px">
        <br style="line-height: 5.7;">
        <div style="background-color: #ffffff ;  border: solid #000000 6px; left: 15%; position: absolute; padding: 30px 50px 20px; left: 35%">
        <br style="line-height: 1;">
        <h1 style="text-align: center; position: relative;">Enter User's Details</h1>
        <br style="line-height: 1.5;">
        <form style="padding-left: 15%;" action="InfoAdd" method="post" >  
                Username:<input type="text" name="usernam"/><br/><br/>
                Password:<input type="password" name="userpass"/><br/><br/>
                Name:<input type="text" name="name"/><br/><br/>  
                Mobile:<input type="number" name="number"><br/><br/>
                Age:<input type="number" name="age"><br/><br/>
                Sex:<input type="text" name="sex"><br/><br/>
                <input type="submit" value="Sign-Up" style="margin-left: 85px;">  
            </form>  
        <br style="line-height: 2;">
                </div>

        <br style="line-height: 39;">
    </body>
</html>

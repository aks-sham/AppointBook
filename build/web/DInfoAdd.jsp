<%-- 
    Document   : DInfoAdd
    Created on : 25 Mar, 2020, 2:04:51 AM
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
        <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("ALog.jsp");
            }
            %>
            
        <form action="ALogout" style="right: 15%; position: absolute; top: 15%;">
            <input type="submit" value="  Logout  " style=" padding: 15px;">
        </form>
            <form action="AMenu.jsp" style="left: 15.7%; position: absolute; top: 15%;">
            <input type="submit" value="  Admin Menu  " style=" padding: 15px;">
        </form>
        
        <br style="line-height: 5.7;">
        <div style="background-color: #ffffff ;  border: solid #000000 6px;  position: absolute; padding: 30px 50px 20px; left: 35%;">
        <br style="line-height: 1;">
        <h1 style="text-align: center; position: relative;">Enter Doctor's Details</h1>
        <br style="line-height: 1.5;">
        <form style="padding-left: 15%;" action="Doctor_Info_Add" method="post" >  
                Username:<input type="text" name="dusername"/><br/><br/>
                Password:<input type="password" name="duserpass"/><br/><br/>
                Name:<input type="text" name="dname"/><br/><br/>  
                Mobile:<input type="number" name="dnumber"><br/><br/>
                Age:<input type="number" name="dage"><br/><br/>
                Experience:<input type="number" name="dexperience"><br/><br/>
                Specialization:<input type="text" name="dspecialization"/><br/><br/>
                Sex:<input type="text" name="dsex"><br/><br/>
                <input type="submit" value="Save" style="margin-left: 90px;">  
            </form>  
        <br style="line-height: 2;">
                </div>

        <br style="line-height: 39;">
    </body>
</html>

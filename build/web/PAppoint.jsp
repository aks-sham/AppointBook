<%-- 
    Document   : PAppoint
    Created on : 25 Mar, 2020, 11:08:44 PM
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
        
        <%
            if(session.getAttribute("log")==null)
            {
                response.sendRedirect("PLog.jsp");
            }
            %>
        <br style="line-height: 1.7;">
        <h1 style="text-align: center; position: relative;">APPOINTMENT FORM</h1>
        <br style="line-height: 0.2;">
        <form action="PLogout" style="right: 15%; top: 15%; position: absolute;">
            <input type="submit" value="  Logout  " style=" padding: 10px;">
        </form>
        <form action="PMenu.jsp" style="left: 15.7%; position: absolute; top: 15%;">
            <input type="submit" value="  Patient Menu  " style=" padding: 10px;">
        </form>
        <br style="line-height: 2.8;">
        
            <form style="padding-left: 42%" action="PAppointment" method="post">  
                <p style="padding-left: 5%;"><b>Patient Login</b><br style="line-height: 3"></p>
                 Patient Name:<input type="text" name="name"/><br/><br/>  
                 E-mail:<input type="text" name="email"/><br/><br/>  
                 Address:<input type="text" name="address"/><br/><br/>
                 Mobile:<input type="number" name="mobile"/><br/><br/>  
                 Appointment Date:<input type="date" name="adate"/><br/><br/>  
                 Doctors:
                        <select type="text" name="doctor">
                                <option value="Raj">Dr. Rajeev</option>
                                <option value="Vishal">Dr. Vishal Nigam</option>
                                <option value="Sahu">Dr.Manish Sahu</option>
                                <option value="jain">Dr. Jyoti Jain</option>
                                <option value="Shubhi">Dr. Shubhi</option>
                        </select><br/><br/>  
                 Reason for Appointment:<input type="text" name="reason"/><br/><br/>
                 <input type="submit" value="Make appointment" style="margin-left: 50px; padding: 7px;">  
               
            </form> 
    </body>
</html>

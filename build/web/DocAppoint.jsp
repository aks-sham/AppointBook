<%-- 
    Document   : DocAppoint
    Created on : 28 Mar, 2020, 12:21:55 PM
    Author     : aksha
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String id = (String)session.getAttribute("log");
String driver = "org.apache.derby.jdbc.ClientDriver";
String connectionUrl = "jdbc:derby://localhost:1527/today";
String database = "today";
String userid = "today";
String password = "today";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #ffe780;">
       
            ${id}
            <form action="ALogout" style="right: 15%; position: absolute; top: 15%;">
            <input type="submit" value="  Logout  " style=" padding: 10px;">
        </form>
            <form action="AMenu.jsp" style="left: 15.7%; position: absolute; top: 15%;">
            <input type="submit" value="  Admin Menu  " style=" padding: 10px;">
        </form>
<br style='line-height: 3;'>
    <h1 style="text-align: center; ">PATIENT  &nbsp; DETAILS</h1>
    <br style='line-height: 3;'>
<table border="1" style="margin-left: 25.2%;">
    <tr>
        <td style="padding: 10px;"><b>PATIENT NAME</b></td>
        <td style="padding: 10px;"><b>USERNAME</b></td>
        <td style="padding: 10px;"><b>EMAIL</b></td>
        <td style="padding: 10px;"><b>ADDRESS</b></td>
        <td style="padding: 10px;"><b>MOBILE</b></td>
        <td style="padding: 10px;"><b>DATE</b></td>
        <td style="padding: 10px;"><b>DOCTOR</b></td>
        <td style="padding: 10px;"><b>REASON</b></td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from appoin where doctor =" + id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>
<td style="padding: 10px;"><%=resultSet.getString("name") %></td>
<td style="padding: 10px;"><%=resultSet.getString("username") %></td>
<td style="padding: 10px;"><%=resultSet.getString("email") %></td>
<td style="padding: 10px;"><%=resultSet.getString("address") %></td>
<td style="padding: 10px;"><%=resultSet.getString("mobile") %></td>
<td style="padding: 10px;"><%=resultSet.getString("adate") %></td>
<td style="padding: 10px;"><%=resultSet.getString("doctor") %></td>
<td style="padding: 10px;"><%=resultSet.getString("reason") %></td>
</tr>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
    </body>
</html>

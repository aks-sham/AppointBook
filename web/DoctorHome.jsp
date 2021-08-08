<%-- 
    Document   : DoctorHome
    Created on : 27 Mar, 2020, 7:28:02 PM
    Author     : aksha
--%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
String id = request.getParameter("userid");
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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background-color: #ffe780;">
<br style='line-height: 3;'>
    <h1 style="text-align: center; ">DOCTOR'S  &nbsp; LIST</h1>
    <br style='line-height: 3;'>
<table border="1" style="margin-left: 27.9%;">
    <tr> 
        <td style="padding: 10px;"><b>NAME</b></td>
        <td style="padding: 10px;"><b>NUMBER</b></td>
        <td style="padding: 10px;"><b>AGE</b></td>
        <td style="padding: 10px;"><b>EXPERIENCE (Years)</b></td>
        <td style="padding: 10px;"><b>SPECIALIZATION</b></td>
        <td style="padding: 10px;"><b>SEX</b></td>

</tr>
<%
try{
connection = DriverManager.getConnection(connectionUrl, userid, password);
statement=connection.createStatement();
String sql ="select * from doctor";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr>

<td style="padding: 10px;"><%=resultSet.getString("dname") %></td>
<td style="padding: 10px;"><%=resultSet.getString("dnumber") %></td>
<td style="padding: 10px;"><%=resultSet.getString("dage") %></td>
<td style="padding: 10px;"><%=resultSet.getString("dexperience") %></td>
<td style="padding: 10px;"><%=resultSet.getString("dspecilization") %></td>
<td style="padding: 10px;"><%=resultSet.getString("dsex") %></td>

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
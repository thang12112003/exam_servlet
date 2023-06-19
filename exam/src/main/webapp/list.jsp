<%@ page import="Emloyee.Employee" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: May Tinh Cua Thang
  Date: 19/06/2023
  Time: 19:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Employee List</title>
</head>
<body>
<h1>Employee List</h1>
<table>
  <tr>
    <th>ID</th>
    <th>Full Name</th>
    <th>Birthday</th>
    <th>Address</th>
    <th>Position</th>
    <th>Department</th>
  </tr>
  <tbody>
  <%
    ResultSet rs = Employee.getAll();
    while (rs.next()){
  %>
  <tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("full_name") %></td>
    <td><%= rs.getString("birthday") %></td>
    <td><%= rs.getString("address") %></td>
    <td><%= rs.getString("position") %></td>
    <td><%= rs.getString("department") %></td>
  </tr>
  <%
    }
  %>
  </tbody>
</table>
</body>
</html>



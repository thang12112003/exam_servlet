<%--
  Created by IntelliJ IDEA.
  User: May Tinh Cua Thang
  Date: 19/06/2023
  Time: 19:02
  To change this template use File | Settings | File Templates.
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Employee</title>
</head>
<body>
<h1>Add Employee</h1>
<form action="EmployeeServlet" method="POST">
    <label for="id">ID:</label>
    <input type="text" id="id" name="id"><br><br>
    <label for="fullName">Full Name:</label>
    <input type="text" id="fullName" name="fullName"><br><br>
    <label for="birthday">Birthday:</label>
    <input type="text" id="birthday" name="birthday"><br><br>
    <label for="address">Address:</label>
    <input type="text" id="address" name="address"><br><br>
    <label for="position">Position:</label>
    <input type="text" id="position" name="position"><br><br>
    <label for="department">Department:</label>
    <input type="text" id="department" name="department"><br><br>
    <input type="submit" value="Submit">
    <input type="reset" value="Reset">
</form>
</body>
</html>



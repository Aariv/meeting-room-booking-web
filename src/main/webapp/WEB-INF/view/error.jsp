<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Error</title>
</head>
<body>
<div align="center">
<h1>Access Denied</h1>
<h2>Please Login Again</h2>
<form action="login" method="post">
Enter the Username <input type="text" id="name" name="name">
<br><br>
Enter the Password <input type="password" id ="password" name="password">
<br><br>
<input type="submit" value="Login">
</form>
</div>
</body>
</html>
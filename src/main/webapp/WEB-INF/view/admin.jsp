<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>admin</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("name") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
	<div align="center">
		<h1>Welcome Admin</h1>
		<h3> Please Select the Required Option</h3>
		<a href="add">Add User</a>
		    <a href="meetingroom">Add Meeting Room</a>
		<br><br>
		<form action="logout">
		<input type="submit" value="Logout">
	</form>
	</div>
</body>
</html>
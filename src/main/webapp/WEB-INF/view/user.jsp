<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User</title>
</head>
<body>
	<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("name") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
	<div align="center">
		<h1>Welcome User Select the Required Option</h1>
		<form action="book">
			<input type="submit" value="Book Meeting">
		</form>
		<br> <br>
		<form action="logout">
			<input type="submit" value="Logout">
		</form>
	</div>
</body>
</html>
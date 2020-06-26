<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add Meeting Room</title>
</head>
<body>
<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("name") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
<div align="center">
<h1> Add Meeting Room </h1>
<form action="addroom" method="post">
	Enter the Room Name <input type="text" id="name" name="name">
	<br><br>
	Enter the Location <input type="text" id="location" name="location">
	<br><br>
	Enter the Floor <input type="text" id="floor" name="floor">
	<br><br>
	<input type="submit" value="Add Room"> 
	</form>
	<br><br>
<form action="backmeeting">
<input type="submit" value="Back">
</form>
</div>
<div align="center">
	<h3>Room List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Location</th>
			<th>Floor</th>
		</tr>
		<c:forEach var="room" items="${roomlist}">
			<tr>
				<td>${room.id }</td>
				<td>${room.name}</td>
				<td>${room.location}</td>
				<td>${room.floor }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
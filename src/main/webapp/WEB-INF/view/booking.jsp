<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Meeting Booking</title>
</head>
<body>
<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("name") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
<div align="center">
<h1>Enter the Following Details to book the Meeting Room</h1>
<br><br>
<form>
Enter the Name: <input type="text" id="user" name="user">
Select the Meeting Room:  
Enter the Start Date: <input type="text" id="startDate" name="startDate">
Enter the End date: <input type="text" id="endDate" name="endDate">
Enter the Start Time: <input type="text" id="startTime" name="startTime">
Enter the End Time: <input type="text" id="endTime" name="endTime">
</form>
<br><br>
</div>
<div align="center">
	<h3>Booked List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>User</th>
			<th>Meeting Room</th>
			<th>Start Date</th>
			<th>End Date</th>
			<th>Start Time</th>
			<th>End Time</th>
		</tr>
		<c:forEach var="booking" items="${bookinglist}">
			<tr>
				<td>${booking.id }</td>
				<td>${booking.user}</td>
				<td>${booking.meetingRoom }</td>
				<td>${booking.startDate}</td>
				<td>${booking.endDate }</td>
				<td>${booking.startTime }</td>
				<td>${booking.endTime }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
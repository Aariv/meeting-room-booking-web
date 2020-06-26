<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add User</title>
</head>
<body>
<%
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("name") == null) {
			response.sendRedirect("index.jsp");
		}
	%>
<div align="center">
<h1>Add User</h1>
<form action="adduser" method="post">
Enter the Name : <input type="text" id="name" name="name"/>
<br><br>
Enter the Email Id : <input type="text" id="emailid" name="emailid"/>
<br><br>
Enter the Password  : <input type="password" id="password" name="password"/>
<br><br>
Select the Role: <select name="role" id="role">
  <option value="Admin" label="Admin"> Administrator </option>
  <option value="Employee" label="Employee" > Employee </option>
  <option value="Board of Directors" label="Board of Directors"> BoardOfDirectors  </option>
</select> <br><br>
Select the Team:<select name="team" id="team">
  <option value="learn" label="Learn" > Learn </option>
  <option value="learnmobile" label="LearnMobile" > LearnMobile </option>
  <option value="community" label="Community" > Community </option>
  <option value="bbss" label="BBSS" > BBSS </option>
  <option value="devops" label="Devops" > Devops </option>
  <option value="EQPT" label="EQPT" > EQPT </option>
</select>   <br><br>
<input type="submit" value="Add User">
</form>
<br><br>
<form action="backuser">
<input type="submit" value="Back">
</form>
</div>
<div align="center">
	<h3>User List</h3>
	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email ID</th>
			<th>Role</th>
			<th>Team</th>
		</tr>
		<c:forEach var="user" items="${userlist}">
			<tr>
				<td>${user.id }</td>
				<td>${user.name}</td>
				<td>${user.emailid}</td>
				<td>${user.role }</td>
				<td>${user.team }</td>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>
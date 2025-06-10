<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri =  "http://java.sun.com/jsp/jstl/core" prefix = "c"  %>
<!DOCTYPE html PUBLIC "-//W3//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/htm14/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" contents ="text/html; charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>List Employees</h1>
	
	<div>
		<table border = "1">
				<tr>
				<th>Full Name</th>
				<th>Email</th>
				<th>Gender</th>
				<th>Hobbies</th>
				<th>Country</th>
				<th>Address</th>
			</tr>
			<c:forEach items ="${listemployees}"var = "e">
			<td>${e.fullname}</td>
			<td>${e.email}</td>
			<td>${e.gender}</td>
			<td>${e.hobbies}</td>
			<td>${e.country}</td>
			<td>${e.address}</td>
			</c:forEach>
		</table>
	</div>
</body>
</html>
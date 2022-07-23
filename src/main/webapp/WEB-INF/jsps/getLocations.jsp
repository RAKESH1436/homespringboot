<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"       uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>location</title>

</head>
<body>
<a href="showLocation">Click to fill new page</a>
	<h2>All Locations</h2>
	<table border="1">
		<tr>
			<th>id</th>
			<th>code</th>
			<th>name</th>
			<th>type</th>
			<th>Delete</th>
			<th>Update</th>
		</tr>
		<c:forEach items="${locations}" var="location">
		<tr>
			<td>${location.id}</td>
			<td>${location.code}</td>
			<td>${location.name}</td>
			<td>${location.type}</td>
			<td><a href="deleteLocation?id=${location.id}">delete</a></td>
			<td><a href="updateLocation?id=${location.id}">Update</a></td>
			
		</tr>
		</c:forEach>
		

	</table>
</body>
</html>
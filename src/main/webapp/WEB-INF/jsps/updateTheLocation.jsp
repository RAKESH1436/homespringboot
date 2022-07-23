<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update location</title>
</head>
<body>
<a href="getLocations">Click to all locations</a>
<h2>Update Location</h2>
<form action="updateLocationData" method="post">
id<input type="text" name="id" value="${id}"readonly>
Name<input type="text" name="code" value="${Code}"/>
Code<input type="text" name="name" value="${Name}"/>
Type:urban<input type="radio" name="type" value="urban"/>
Rural<input type="radio" name="type" value="Rural"/>
<input type="submit" value="update"/>

</form>
${updateMsg}


</body>
</html>
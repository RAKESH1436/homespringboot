<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
	<a href="getLocations">Click to all locations</a>
	<h2>Location details</h2>
	<form action="saveLoc" method="post">
		Id<input type="text" name="id" /> Code<input type="text" name="code" />
		Name<input type="text" name="name" /> Urban: <input type="radio"
			name="type" value="urban" /> Rural: <input type="radio" name="type"
			value="Rural" /> <input type="submit" value="Save" />
	</form>

	${msg}

</body>
</html>
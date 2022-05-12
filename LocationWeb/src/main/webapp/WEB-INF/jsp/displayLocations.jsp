<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Locations Available</title>
</head>
<body>
	<h2>Locations:</h2>
	<table>
	<pre>
		<tr>
			<th>ID</th>
			<th>Code</th>
			<th>Name</th>
			<th>Type</th>
		</tr>

		<c:forEach items="${lc}" var="location">
			<tr>
				<td>${location.id}</td>
				<td>${location.code}</td>
				<td>${location.name}</td>
				<td>${location.type}</td>
				<td><a href="deleteLocation?id=${location.id}" >Delete</a></td>
			</tr>
		</c:forEach>
	</pre>

	</table>
	
	<br>
	<a href="create">Add Locations

</body>
</html>
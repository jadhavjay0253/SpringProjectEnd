<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Location</title>
</head>
<body>
	<form action="saveLoc" method="post">
	<pre>
        Id: <input type="text" name="id"/><br>
        Code: <input type="text" name="code"/><br>
        Name: <input type="text" name="name"/><br>
        Type: <br> 
        Rural <input type="radio" name="type"value="URBAN"/><br>
        Urban <input type="radio" name="type" value="RURAL" /><br>
        <input type="submit" value="Save">
	</pre>
    </form>
    ${msg}
    <br>
    <a href="displayLocations">View All</a>
    
</body>
</html>
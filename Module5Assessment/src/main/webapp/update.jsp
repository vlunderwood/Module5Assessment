<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Lake</title>
</head>
<body>


	<form action="updateLake" method="post">
		New Lake Name: <input type="text" name="lakeName" size="25" />
		New Average Temperature: <input type="text" name="avgTemperature" size="25" /> 
		New Maximum Depth: <input type="text" name="maxDepth" size="25" />
		Enter the current lake name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>
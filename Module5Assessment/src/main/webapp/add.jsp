<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Lake</title>
</head>
<body>
<form action="addLake" method="post">
		Name: <input
			type="text" name="lakeName" size="25"/> 
		
		Avg Temperature: <input
			type="text" name="avgTemperature" size="25"/> 
		
		Max Depth: <input
			type="text" name="maxDepth" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>
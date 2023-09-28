<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lakes</title>
</head>
<body>
	List of all lakes:
	<table>
		<c:forEach items="${requestScope.allLakes}" var="currentlake">
			<tr>
				<td>${currentlake.lakeName}|</td>
				<td>${currentlake.avgTemperature}|</td>
				<td>${currentlake.maxDepth}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>
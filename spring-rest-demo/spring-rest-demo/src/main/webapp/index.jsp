<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Landing page</title>
</head>
<body>
	Spring demo
	<hr>
	<a href="${pageContext.request.contextPath}/test/hello">Hello</a>
	<hr>
	<a href="${pageContext.request.contextPath}/api/students">Get All Students</a>
</body>
</html>
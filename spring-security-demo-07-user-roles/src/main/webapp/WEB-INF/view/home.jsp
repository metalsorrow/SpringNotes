<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>luv2code company home page</h2>
	<hr>
	<p>
		Welcome to the luv2code company home page!	
	</p>
	<hr>
		<!-- display user name and role -->
		 User: <security:authentication property="principal.username"/>
		 <br><br>
		 Role(s): <security:authentication property="principal.authorities"/>
	<hr>
	<!-- Add a logout button -->
	<form:form action="${pageContext.request.contextPath}/logout" method="POST">
		<button type="submit">Logout</button>
	</form:form>
</body>
</html>
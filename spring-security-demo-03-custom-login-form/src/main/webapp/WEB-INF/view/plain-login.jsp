<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Custom Login Page</title>
<style type="text/css">
	.failed{ color:red;}
</style>
</head>
<body>
	<h3>My custom login page</h3>
	
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser" method="POST">
		<!--  check for login error -->
		<c:if test="${param.error != null }">
			<i class="failed">Sorry! You entered invalid username/password</i>
		</c:if>
		<p> 
			User name: <input type="text" name="username"/> 
		</p>
		<p> 
			Password: <input type="password" name="password"/> 
		</p>
		
		<input type="submit" value="login"/>
	</form:form>
</body>
</html>
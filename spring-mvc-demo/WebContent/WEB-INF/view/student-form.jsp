<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>
<head>
<title>Student Registration Form</title>
</head>

<body>


<form:form action="processForm" modelAttribute="student">
	<br> <br>
	First name: <form:input path="firstName"/>
	<br> <br>
	Last name: <form:input path="lastName"/>
	
	<br> <br>
	Country:
	<br>

	<form:select path="country"> 
 		<form:options items="${theCountryOptions}" />
	</form:select>
	<br> <br>

	<br><br>
	Favorite Language:
	<br>
	<form:radiobuttons path="favoriteLanguage" items="${student.favoriteLanguageOptions}"  />
	<br><br>
	
	<br><br>
	Linux <form:checkbox path="operatingSystems" value="Linux"/>
	Windows <form:checkbox path="operatingSystems" value="Windows"/>
	Mac <form:checkbox path="operatingSystems" value="Mac"/>
	<br>
	
	<br>	
	
	<input type="submit" value="Submit"/>
</form:form>





</body>
</html>



















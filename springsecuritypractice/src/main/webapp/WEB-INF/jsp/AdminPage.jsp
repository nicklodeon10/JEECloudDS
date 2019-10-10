<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin</title>
</head>
<body>
	<h3>Welcome to Spring Security Admin</h3>
	<p>Function 1</p>
	<p>Function 2</p>
	<p>Function 3</p>
	<form:form action="logout" method="POST">
		<button type="submit">Logout</button>
	</form:form>
</body>
</html>
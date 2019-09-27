<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Login</title>
</head>
<body>
	<h3>Login Page:</h3>
	<form:form action="adminHome" method="POST">
		<table>
			<tr>
				<td>Username: </td>
				<td>
					<input type="text" name="adminUsername" />
				</td>
			</tr>
			<tr>
				<td>Password: </td>
				<td>
					<input type="password" name="adminPassword" />
				</td>
			</tr>
			<tr>
				<td>
					<input type="submit" value="Log In">
				</td>
			</tr>
		</table>
	</form:form>
</body>
</html>
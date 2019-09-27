<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve Trainee</title>
</head>
<body>
	<h2>Retrieve Trainee</h2>
	<form:form action="traineeRetrieve" method="POST">
		<table>
			<tr>
				<td>Please enter Trainee Id:</td>
				<td><input type="text" name="retrieveId" /></td>
				<td><input type="submit" value="traineeRetrieve" /></td>
			</tr>
		</table>
	</form:form>
	<br>
	<h2>Trainee Info</h2>
	<table>
		<tr>
			<th>Trainee ID</th>
			<th>Trainee Name</th>
			<th>Trainee Location</th>
			<th>Trainee Domain</th>
		</tr>
		<tr>
			<td>${trainee.traineeId}</td>
			<td>${trainee.traineeName}</td>
			<td>${trainee.traineeLocation}</td>
			<td>${trainee.traineeDomain}</td>
		</tr>
	</table>
</body>
</html>
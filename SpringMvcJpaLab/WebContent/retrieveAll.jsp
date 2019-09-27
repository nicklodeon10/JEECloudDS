<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="show" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieve All</title>
</head>
<body>
	<h2>Retrieve Trainee</h2>
	<table>
		<tr>
			<th>Trainee ID</th>
			<th>Trainee Name</th>
			<th>Trainee Location</th>
			<th>Trainee Domain</th>
		</tr>
		<show:forEach var="trainee" items="${traineeData}">
			<tr>
				<td>${trainee.traineeId}</td>
				<td>${trainee.traineeName}</td>
				<td>${trainee.traineeLocation}</td>
				<td>${trainee.traineeDomain}</td>
			</tr>
		</show:forEach>
	</table>
</body>
</html>
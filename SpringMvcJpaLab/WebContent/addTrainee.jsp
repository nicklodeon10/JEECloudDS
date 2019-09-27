<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Enter Trainee Details:</title>
</head>
<body>
	<h2>Enter Trainee Details:</h2>
	<form:form action="traineeAdd" method="POST" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id</td>
				<td><form:input path="traineeId"/></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName"/></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:radiobutton path="traineeLocation" value="Chennai" label="Chennai" /> 
				<form:radiobutton path="traineeLocation" value="Bangalore" label="Bangalore" /> 
				<form:radiobutton path="traineeLocation" value="Pune" label="Pune" /> 
				<form:radiobutton path="traineeLocation" value="Mumbai" label="Mumbai" /> </td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td>
					<form:select path="traineeDomain">
						<form:option value="JEE">JEE</form:option>
						<form:option value=".NET">.NET</form:option>
						<form:option value="C#">C#</form:option>
						<form:option value="ML">ML</form:option>
					</form:select> 
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Trainee"></input></td>
			</tr>
		</table>
	</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Add Employee:
	<br>
	<table>
		<form:form action="submitEmployee" method="POST" modelAttribute="employee">
			<tr>
				<td>Employee Id:</td>
				<td><form:input path="empId" /></td>
			</tr>
			<tr>
				<td>Employee Name:</td>
				<td><form:input path="empName" /></td>
			</tr>
			<tr>
				<td>Employee Department:</td>
				<td><form:input path="empDept" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="submitEmployee"></input></td>
			</tr>
		</form:form>
	</table>
</body>
</html>
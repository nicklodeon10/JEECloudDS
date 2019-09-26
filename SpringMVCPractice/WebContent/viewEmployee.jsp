<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="show" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>Employee Department</th>
		</tr>
		<show:forEach var="employee" items="${employeeData}">
			<tr>
				<td>${employee.empId}</td>
				<td>${employee.empName}</td>
				<td>${employee.empDept}</td>
			</tr>
		</show:forEach>
	</table>
</body>
</html>
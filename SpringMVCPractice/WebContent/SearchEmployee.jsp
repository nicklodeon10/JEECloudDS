<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="show" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Search:</title>
</head>
<body>
	<form:form action="viewEmployee" method="GET" >
		<table>
			<tr>
				<td>Enter Employee Id:</td>
				<td><input type="text" name="searchId"></td>
			</tr>
			<tr>
				<td><input type="submit" value="viewEmployee"></td> 
			</tr>
		</table>
	</form:form>
	<jsp:include page="viewEmployee.jsp"></jsp:include>
</body>
</html>
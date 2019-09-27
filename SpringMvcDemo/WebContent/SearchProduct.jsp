<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="show" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ProductSearch</title>
</head>
<body>
	<form:form action="viewProduct" method="GET" >
		<table>
			<tr>
				<td>Enter Product Id:</td>
				<td><input type="text" name="searchId"></td>
			</tr>
			<tr>
				<td><input type="submit" value="viewProduct"></td> 
			</tr>
		</table>
	</form:form>
	<jsp:include page="ShowProduct.jsp"></jsp:include>
</body>
</html>
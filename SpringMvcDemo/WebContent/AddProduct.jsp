<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Product</title>
</head>
<body>
	Add Product
	<br>
	<table>
		<form:form action="pagesubmit" method="POST" modelAttribute="product">
			<tr>
				<td>Product Id:</td>
				<td><form:input path="prodId" /></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><form:input path="prodName" /></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><form:input path="prodPrice" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="AddProduct"></input></td>
			</tr>
		</form:form>
	</table>
</body>
</html>
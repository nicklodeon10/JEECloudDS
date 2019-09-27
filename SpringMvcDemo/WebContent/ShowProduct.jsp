<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="show" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
	<table>
		<tr>
			<th>Product Id</th>
			<th>Product Name</th>
			<th>Product Price</th>
			<th>Product Feature</th>
			<th>Product Type</th>
			<th>Product Online</th>
		</tr>
		<show:forEach var="product" items="${productData}">
			<tr>
				<td>${product.prodId}</td>
				<td>${product.prodName}</td>
				<td>${product.prodPrice}</td>
				<td>${product.features}</td>
				<td>${product.type}</td>
				<td>${product.online}</td>
			</tr>
		</show:forEach>
	</table>
</body>
</html>
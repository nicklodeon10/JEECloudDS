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
				<td><span style="color:red;"><form:errors path="prodId"></form:errors></span></td>
			</tr>
			<tr>
				<td>Product Name:</td>
				<td><form:input path="prodName" /></td>
				<td><span style="color:red;"><form:errors path="prodName"></form:errors></span></td>
			</tr>
			<tr>
				<td>Product Price:</td>
				<td><form:input path="prodPrice" /></td>
				<td><span style="color:red;"><form:errors path="prodPrice"></form:errors></span></td>
			</tr>
			<tr>
				<td>Product Type:</td>
				<td><form:select path="type" items="${dataitem}" /></td>
			</tr>
			<tr>
				<td>Product Features: </td>
				<td><form:checkbox path="features" value="Feature1"/>Feature1</td>
				<td><form:checkbox path="features" value="Feature2"/>Feature2</td>
				<td><form:checkbox path="features" value="Feature3"/>Feature3</td>
				<td><form:checkbox path="features" value="Feature4"/>Feature4</td>
				<td><form:checkbox path="features" value="Feature5"/>Feature5</td>
				<td><form:checkbox path="features" value="Feature6"/>Feature6</td>
			</tr>
			<tr>
				<td>Product Online:</td>
				<td>
					<form:radiobutton path="online" value="yes"/>Yes
					<form:radiobutton path="online" value="no"/>No
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="AddProduct"></input></td>
			</tr>
		</form:form>
	</table>
</body>
</html>
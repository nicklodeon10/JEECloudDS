<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Product</title>
</head>
<body>
	<form action="deleteData" method="POST">
		<table>
			<tr>
				<td>Product Id:</td>
				<td><input type="text" name="pid"></td>
			</tr>
			<tr>
				<td><input type="submit" value="DeleteProduct"></td>
			</tr>
		</table>
	</form>
</body>
</html>
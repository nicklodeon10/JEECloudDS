<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Spring MVC Demo</title>
</head>
<body>
	<form action="">
		Id:&nbsp;
		<input type="number" value="id"><br>
		Name:&nbsp;
		<input type="text" value="name"><br>
		Technology:<br>
		<input type="checkbox" name="java" value="Java">
		<input type="checkbox" name="c#" value="C#">
		<input type="checkbox" name="angular" value="Angular">
		<input type="checkbox" name="python" value="Python">
		<input type="checkbox" name="react" value="React">
		<input type="checkbox" name="aws" value="AWS"><br>
		Gender:&nbsp;
		<input type="radio" name="gender" value="Male">
		<input type="radio" name="gender" value="Female"><br>
		Qualification:&nbsp;
		<select name="cars">
  			<option value="msc">M.Sc.</option>
  			<option value="be">B.E.</option>
  			<option value="btech">B.Tech.</option>
  			<option value="ms">MS</option>
  			<option value="ms">MBA</option>
		</select><br>
		<button type="button">Submit</button>
	</form>
</body>
</html>
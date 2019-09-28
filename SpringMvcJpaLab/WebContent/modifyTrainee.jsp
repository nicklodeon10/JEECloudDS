<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Modify Trainee</title>
</head>
<body>
	<form:form action="traineeViewModify" method="GET">
		<table>
			<tr>
				<td>Please enter Trainee Id:</td>
				<td><input type="text" name="modifyId" /></td>
				<td><input type="submit" value="Modify Trainee">
			</tr>
		</table>
	</form:form>
	<h2>Update Trainee Details:</h2>
	<form:form action="traineeModify" method="POST" modelAttribute="trainee">
		<table>
			<tr>
				<td>Trainee Id</td>
				<td><form:input path="traineeId" value="${traineeData.traineeId}" readonly="true" /></td>
			</tr>
			<tr>
				<td>Trainee Name</td>
				<td><form:input path="traineeName" value="${traineeData.traineeName}" /></td>
			</tr>
			<tr>
				<td>Trainee Location</td>
				<td><form:radiobutton id="Chennai" path="traineeLocation" value="Chennai" label="Chennai"  /> 
				<form:radiobutton id="Bangalore" path="traineeLocation" value="Bangalore" label="Bangalore" /> 
				<form:radiobutton id="Pune" path="traineeLocation" value="Pune" label="Pune" /> 
				<form:radiobutton id="Mumbai" path="traineeLocation" value="Mumbai" label="Mumbai" /> </td>
			</tr>
			<tr>
				<td>Trainee Domain</td>
				<td>
					<form:select path="traineeDomain">
						<form:option id="JEE" value="JEE">JEE</form:option>
						<form:option id=".NET" value=".NET">.NET</form:option>
						<form:option id="C#" value="C#">C#</form:option>
						<form:option id="ML" value="ML">ML</form:option>
					</form:select> 
				</td>
			</tr>
			<tr>
				<td><input type="submit" value="Modify Trainee"></input></td>
			</tr>
		</table>
	</form:form>
	<script type="text/javascript">
		var locations=["Chennai","Bangalore","Pune","Mumbai"];
		for(i=0; i<locations.length; i++){
			var currLocation=document.getElementById(locations[i]);
			if(currLocation.value=="${traineeData.traineeLocation}"){
				currLocation.checked=true;
			}
		}
		var domains=["JEE",".NET","C#","ML"];
		for(i=0; i<domains.length; i++){
			var currDomain=document.getElementById(domains[i]);
			if(currDomain.value=="${traineeData.traineeDomain}"){
				currDomain.selected=true;
			}
		}
	</script>
</body>
</html>
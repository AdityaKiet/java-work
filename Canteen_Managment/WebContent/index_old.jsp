<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome Admin !!!!</title>
</head>
<body>
	<h2>${message}</h2>
	<form action="index">
		<input type="submit" value="Feedback" name="index" /> 
		<input type="submit" value="All Orders" name="index" />
		<input type="submit" value="Add new Customer" name="index" />
		<input type="submit" value="Recharge" name="index" />
		<input type="submit" value="Available Items" name="index"/>
		<input type="submit" value="Add New Item" name="index"/>
		<input type="submit" value="Change Availability" name="index"/>
		<input type="submit" value="Delete an Item" name="index"/>
		<input type="submit" value="Delete customer" name="index"/>
		<input type="submit" value="Update an Item" name="index"/>
	</form>
</body>
</html>
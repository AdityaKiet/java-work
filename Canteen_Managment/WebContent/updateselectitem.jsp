<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Select an Item !!!</title>
</head>
<body>
<h1>Available Items are :-</h1>
	<br>
	<br>
	<form action="selectupdateitem" method="post">
		<table border="1">
			<tr>
				<th>Id</th>
				<th>Name</th>
				<th>Price</th>
				<th>Is Available</th>
			</tr>
			<c:forEach items="${items}" var="x">
				<tr>
					<td>${x.id}</td>
					<td>${x.name}</td>
					<td>${x.price}</td>
					<td><input type="radio" value="${x.id}" name="selecteditem"/></td>
				</tr>
			</c:forEach>
		</table>
		<input type="submit" value="Update" />
	</form>
</body>
</html>
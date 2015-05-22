<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Delete a customer</title>
</head>
<body>
	<form action="deletecustomer" method="post">
		<table border="1">
			<tr>
				<td>Account Number</td>
				<td>Name</td>
				<td>Balance</td>
				<td>Delete ??</td>
			</tr>
			<c:forEach items="${users}" var="x">
				<tr>
					<td>${x.account_number}</td>
					<td>${x.name}</td>
					<td>${x.balance}</td>
					<td><input type="checkbox" name="delete" value="${x.account_number}"/></td>
				</tr>
			</c:forEach>
		</table>
		<br><BR>
		<input type="submit" value="Delete Customers"/>
		<br>
		<br>
		<input type="reset" value="Reset"/>
	</form>
</body>
</html>
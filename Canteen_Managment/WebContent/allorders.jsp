<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Orders !!!</title>
</head>
<body>

	<h1>All Orders are...</h1>
	<form action="order" method="post">
		<input type="submit" value="Refresh" name="order"/>
		<br><br><Br>
		<table border="1">
			<thead>
				<tr>
					<th>Token Number</th>

					<th>Name of Student</th>

					<th>Order</th>

					<th>Amount</th>

					<th>Time</th>

					<th>Done ??</th>


				</tr>
			</thead>
			<c:forEach items="${orders}" var="x">
				<tr>
					<td>${x.token}</td>
					<td>${x.name}</td>
					<td>${x.items}</td>
					<td>${x.amount}</td>
					<td>${x.time}</td>
					<td><input type="checkbox" name="delete" value="${x.token}" /></td>
				</tr>

			</c:forEach>
		</table>
		<br> <br> <input type="submit" value="Update orders" name="order" />
	</form>
</body>
</html>
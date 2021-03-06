<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Available Items</title>
</head>
<body>
	<h1>Available Items are :-</h1>
	<br>
	<br>
	<form action="" method="post">
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
					<td><c:choose>
							<c:when test="${x.isAvailable}">
								<input type="checkbox" checked="checked" name="${x.id}" />
							</c:when>
							<c:otherwise>
								<input type="checkbox" name="${x.id}" />
							</c:otherwise>
						</c:choose></td>
				</tr>
			</c:forEach>
		</table>
		</form>
</body>
</html>
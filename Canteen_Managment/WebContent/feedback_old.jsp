<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Feedbacks !!!</title>
</head>
<body>
	<h1>All Feedbacks are...</h1>
	<form action="feedback">
		<table border="1">
			<caption>
				<b>Delete The Ones Which Have Been Solved</b>
			</caption>
			<thead>
				<tr>
					<th>Complaint ID</th>

					<th>Name of Student</th>

					<th>Complaint Category</th>

					<th>Complaint</th>

					<th>Is Solved??</th>
				</tr>
			</thead>
			<c:forEach items="${feedback}" var="x">
				<tr>
					<td>${x.id}</td>
					<td>${x.name}</td>
					<td>${x.category}</td>
					<td>${x.text}</td>
					<td><input type="checkbox" name="delete" value="${x.id}" /></td>
				</tr>

			</c:forEach>
		</table>
		<br> <br> <input type="submit" value="Delete these items" />
	</form>
</body>
</html>
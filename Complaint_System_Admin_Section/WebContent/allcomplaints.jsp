<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Complaints are here......</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Complaints are...</th>
			<th>Student Name</th>
			<th>Student Roll Number</th>
		</tr>

		<c:forEach items="${complaints}" var="x">
			<tr>
				<td>${x.complaint}</td>
				<td>${x.student_name}</td>
				<td>${x.student_roll_no}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<script>
	function goBack() {
		window.history.back();
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Complaints !!!</title>
</head>
<body>
<ducat:message message="message" />

	<h1>Your Complaints are...</h1>
	<form action="update" method="post" name="input">
		<table border="1">
			<caption><b>Select The Ones Which Have Been Solved</b></caption>
			<thead>
				<tr>
					<th>Complaint ID</th>

					<th>Complaint </th>

					<th>Complaint Category</th>
					
					<th>Is Solved ?</th>
				</tr>
			</thead>
			<c:forEach items="${complaints}" var="x">

				<tr>
					<td>${x.complaint_id}</td>
					<td>${x.complaint}</td>
					<td>${x.complaint_category}</td>
					<td>
					<c:choose>
						<c:when test="${x.is_solved}">
							<input type="radio" name="complaint_id" checked="checked" value="${x.complaint_id}"/>
						</c:when>
						<c:otherwise>
							<input type="radio" name="complaint_id" value="${x.complaint_id}"/>
						</c:otherwise>
					</c:choose>
					</td>
				</tr>
			</c:forEach>
		</table>

			<input type="submit" value="Solved !!!"/>
	</form>
	<button onclick="goBack()">Cancel</button>
</body>
</html>
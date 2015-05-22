<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Select An Option here</title>
</head>
<ducat:message message="message" />
<body>
	<form action="adminCategory" method="post">
		<h3>Select All Complaints of type....</h3>
		<select name="department">
			<c:forEach items="${complaint_type}" var="x">
				<option value="${x.complaint_type}">${x.complaint_type}</option>
			</c:forEach>
		</select>
		<input value="Get Complaints" type="submit" name="button"/>
		<br><br><br>
		<h2>Enter Category to be added</h2><br>
		<br>
		<input type="text" placeholder="Enter Any Category here which is to be added" name="category_name" required="required"/>
		<input type="submit" placeholder="Enter Any Category here which is to be added" value="Add Category" name="button"/>
		<br><Br>
		<input type="submit" value="All Complaints" name="button"/>
	</form>
</body>
</html>
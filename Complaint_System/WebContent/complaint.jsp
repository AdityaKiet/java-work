<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Your Complaint Here</title>
</head>
<body>${complaint_type}
	<h1>Enter Your Complaint details here</h1>
	<br>

	<form action="savecomplaint" method="post">
		<br> 
		<input placeholder="Enter Roll No Here" name="roll_no" type="text" required="required" /><br> 
			
		<input placeholder="Enter Name Here" name="name" type="text" required="required"/><br>
		
		<select name="department">
			<c:forEach items="${complaint_type}" var="x">
				<option value="${x.complaint_type}">${x.complaint_type}</option>
			</c:forEach>
		</select> 
		<br>
		
		<input placeholder="Enter Complaint Here" name="complaint" type="text" required="required"/> 
		<br>
		<input type="submit" value="Save Comaplaint !!!" />
	</form>
</body>
</html>
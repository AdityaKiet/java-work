<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Select An Option here</title>
</head>
<ducat:message message="message" />
<body>
	<form action="complaint">
		<input type="submit" value="Create a New Complaint" />
	</form>
	<form action="updatecomplaint">
		<input type="text" name="roll_no" placeholder="Enter Roll Numebr" required="required" /> 
		<input type="submit" value="View All your Complaints" />
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enter Roll No.</title>
</head>
<body>
	<ducat:message message="${message}" />
	<form action="ShowStudentDetails" method="post">
		<input name="rollno" type="text" required="required" /> <input
			type="submit" value="Next" />

	</form>
	<form action="Selectdept" method="post">
		<input type="submit" value="New User!" />
	</form>
</body>
</html>
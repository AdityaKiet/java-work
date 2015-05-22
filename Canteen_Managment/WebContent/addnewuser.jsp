<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Student</title>
</head>
<body>
	<form action="newuser" method="post">
	<h2>Enter user details....</h2>
		<input type="text" required="required" placeholder="Name" name="name"/>
		<br>
		<input type="password" required="required" placeholder="password" name="password"/>
		<br>
		<input type="text" required="required" placeholder="Roll No." name="rollno"/>
		<br>
		<input type="email" required="required"placeholder="Email" name="email"/>
		<br>
		<input type="text" required="required" placeholder="Phone No." name="phone"/>
		<br>
		<input type="number" required="required" placeholder="Balance" name="balance" min="1"/>
		<br>
		<input type="submit"value="Submit"/>
		<br>
		<input type="reset" value="Reset"/>  
	</form>
</body>
</html>
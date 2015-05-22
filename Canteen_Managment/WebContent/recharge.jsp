<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Re-charge !!!</title>
</head>
<body>
	<form action="recharge">
		<input placeholder="Account Number" name="account_number" type="text" required="required"/><br><Br>
		<input placeholder="Amount" name="balance" type="number" min="1" required="required" /> <br>
		<br> <input type="submit" value="Recharge" /> <br>
		<br> <input type="reset" value="Reset" />
	</form>
</body>
</html>
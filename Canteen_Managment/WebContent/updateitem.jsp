<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add New Item</title>
</head>
<body>
	<form action="update" method="post">
		<input type="text" value="${id}" placeholder="Id of Item" readonly="readonly" required="required" name="id"/>
		<br><br>
		<input type="text" value="${name}" placeholder="Name of Item" required="required" name="item"/>
		<br><br>
		<input type="number" value="${price}" placeholder="Amount" required="required" name="amount" min="1"/>
		<br><br>
		<input type="submit" value="Save"/>
		<br><br>
		<input type="reset" value="Reset"/>
	</form>	

</body>
</html>
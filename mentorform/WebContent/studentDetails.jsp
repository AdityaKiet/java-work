<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Details</title>
</head>
<body>
<ducat:message message="message"/>
	<form action="save" method="post">
		<input type="text" placeholder="Enter Name Here" name="name"
			required="required" /> <br> <select name="department">
			<c:forEach items="${branches}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>
		</select> <br> <input type="number" placeholder="Enter Roll no. Here"
			name="rollno" required="required" /><br> <input type="text"
			placeholder="Enter Enrollment No. Here" name="enrollmentno"
			required="required" /><br> <select name="batch">
			<option value="2010">2010</option>
			<option value="2011">2011</option>
			<option value="2012">2012</option>
			<option value="2013">2013</option>
			<option value="2014">2014</option>
			<option value="2015">2015</option>
			<option value="2016">2016</option>
			<option value="2018">2018</option>
			<option value="2019">2019</option>
			<option value="2020">2020</option>

		</select> <br> <select name="section">
			<option value="A">A</option>
			<option value="B">B</option>
			<option value="C">C</option>
			<option value="D">D</option>
			<option value="E">E</option>
		</select><br> 
		
		<input type="checkbox" name="isHosteller" />Are you Hosteller? <br>
		
		
		 <select name="hostel">
			<c:forEach items="${hostels}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>

		</select> <br> 
		
		
		<input type="text" placeholder="Enter Room No"
			name="room_no" /><br>
			
		<input type="text" placeholder="Enter Room Partner1" name="room_partner1" /><br> 
		
		
		<input type="text" placeholder="Enter Room partner2" name="room_partner2" /><br>
		
		<input type="text" placeholder="Enter Room partner3" name="room_partner3" /><br> 
		
		<input type="number" required="required" placeholder="Enter Phone No" name="phone_no" /><br>
		
		
		<input type="email" required="required" placeholder="Enter Email Id" name="email_id" /><br>
		
		<input type="text" required="required" placeholder="Enter Current Address" name="current_address" /><br>
		
		<input type="text" required="required" placeholder="Enter Father Name" name="father_name" /><br>
		
		<input type="text" required="required" placeholder="Enter Father Qualification" name="father_qualification" /><br>
		
		<input type="text" required="required" placeholder="Enter Father Profession"
		name="father_profession" /><br>
		
		 
		 <input type="text" required="required" placeholder="Enter Father Occupation" name="father_occupation" /><br> 
		 
		 
		 <select name="father_annual_income">
			<c:forEach items="${income}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>
		</select> <br> <input type="text" required="required"
			placeholder="Enter Mother Name" name="mother_name" /><br> <input
			type="text" required="required"
			placeholder="Enter Mother Qualification" name="mother_qualification" /><br>
		<input type="text" required="required"
			placeholder="Enter Mother Profession" name="mother_profession" /><br>
		<input type="text" required="required"
			placeholder="Enter Mother  Occupation" name="mother_occupation" /><br>
		<select name="mother_annual_income">
			<c:forEach items="${income}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>
		</select><br> <input type="text" required="required"
			placeholder="Enter Permanent Address" name="permanent_address" /><br>
		<input type="number" required="required"
			placeholder="Enter Permanent Phone No" name="permanent_phoneno" /><br>
		<input type="email" placeholder="Enter Permanent Email Id"
			required="required" name="permanent_email" /><br> <input
			type="text" required="required" placeholder="Enter Contact Address"
			name="contact_address" /><br> <input type="number"
			required="required" placeholder="Enter Contact Phone No"
			name="contact_phoneno" /><br> <input type="email"
			required="required" placeholder="Enter Contact Email Id"
			name="contact_email" /><br> <input type="text"
			placeholder="Enter Local Guardian Name" name="localguardian_name" />
		<br> <input type="text"
			placeholder="Enter Local Guardian Address"
			name="localguardian_address" /><br> <input type="number"
			placeholder="Enter Local Guardian Phone No"
			name="localguardian_phoneno" /><br> <input type="email"
			placeholder="Enter Local Guardian Email Id"
			name="localguardian_email" /><br> <input type="submit"
			value="Save">
	</form>
</body>
</html>
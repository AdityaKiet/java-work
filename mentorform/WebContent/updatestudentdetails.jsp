<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<script>
function goBack() {
    window.history.back();
}
</script>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome !!</title>
</head>
<body>
	<%
		request.setAttribute("student", request.getAttribute("student"));
	%>
	<form action="updateStudent" method="post">
		<input type="text" placeholder="Enter Name Here" readonly="readonly" name="name" value="${student.name}" /> <br> 
			
		<select name="department" >
		<option value="${student.dept}">${student.dept}</option>
			<c:forEach items="${branches}" var="x">
			<c:if test="${student.dept ne 'Ram'}">
			<option value="${x}">${x}</option>
			</c:if>
			</c:forEach>
		</select>
		<br>
		
		
		<input type="number" readonly="readonly" placeholder="Enter Roll no. Here" value="${student.roll_no}" name="rollno"   /><br>

		<input type="text" readonly="readonly" value="${student.enrollment}" placeholder="Enter Enrollment No. Here" name="enrollmentno"/><br>
		
		<select name="batch">
			<option value="${student.batch}">${student.batch}</option>
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

		</select><br>
		
		
		<select name="section">
			<option value="${student.section}">${student.section}</option>
			<option value="A">A</option>
			<option value="B">B</option>
			<option value="C">C</option>
			<option value="D">D</option>
			<option value="E">E</option>
		</select><br>
		 
		<c:choose>
    		<c:when test="${student.isHosteller eq '1'}">
        		<input checked="checked" type="checkbox" name="isHosteller" />Are you Hosteller ? <br>
   			</c:when>
    		<c:otherwise>
				<input  type="checkbox" name="isHosteller" />Are you Hosteller ? 
	    	</c:otherwise>
		</c:choose>
		
		<br>
		<select name="hostel">
		<option value="${student.nameOfHostel}">${student.nameOfHostel}</option>
			<c:forEach items="${hostels}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>

		</select> <br>
		
		<input type="text" placeholder="Enter Room No" name="room_no" value="${student.roomno}"   /><br>


		<input type="text" placeholder="Enter Room Partner1"
			name="room_partner1" value="${student.roomPartner1}"
			  /><br> <input type="text"
			placeholder="Enter Room partner2" name="room_partner2"
			value="${student.roomPartner2}"   /><br> <input
			type="text" placeholder="Enter Room partner3" name="room_partner3"
			value="${student.roomPartner3}"   /><br> <input
			type="number" required="required" placeholder="Enter Phone No"
			name="phone_no" value="${student.phoneno}"   /><br>

		<input type="email" required="required" placeholder="Enter Email Id"
			name="email_id" value="${student.emailid}"   /><br>

		<input type="text" required="required"
			placeholder="Enter Current Address" name="current_address"
			value="${student.address}"   /><br> 
			
		<input type="text" readonly="readonly" required="required" placeholder="Enter Father Name"
			name="father_name" value="${student.father.name}"   /><br>

		<input type="text" required="required"
			placeholder="Enter Father Qualification" name="father_qualification"
			value="${student.father.qualification}"   /><br>

		<input type="text" required="required"
			placeholder="Enter Father Profession" name="father_profession"
			value="${student.father.profession}"   /><br>

		<input type="text" required="required"
			placeholder="Enter Father Occupation" name="father_occupation"
			value="${student.father.occupation}"   /><br>

		<select name="father_annual_income">
			<option value="${student.father.annual_income}">${student.father.annual_income}</option>
			<c:forEach items="${income}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>
		</select> <br>
		
		
		<input
			type="text" readonly="readonly" required="required" placeholder="Enter Mother Name"
			name="mother_name"   value="${student.mother.name}" /><br>

		<input type="text" required="required"
			placeholder="Enter Mother Qualification" name="mother_qualification"
			  value="${student.mother.qualification}" /><br>

		<input type="text" required="required"
			placeholder="Enter Mother Profession" name="mother_profession"
			  value="${student.mother.profession}" /><br>

		<input type="text" required="required"
			placeholder="Enter Mother  Occupation" name="mother_occupation"
			  value="${student.mother.occupation}" /><br>

		<select name="mother_annual_income">
			<option value="${student.mother.annual_income}">${student.mother.annual_income}</option>
			<c:forEach items="${income}" var="x">
				<option value="${x}">${x}</option>
			</c:forEach>
		</select><br>
		
		
		<input type="text" required="required" placeholder="Enter Permanent Address"
			name="permanent_address"  
			value="${student.father.address}" /><br> <input type="number"
			required="required" placeholder="Enter Permanent Phone No"
			name="permanent_phoneno"  
			value="${student.father.phone_no}" /><br> <input type="email"
			placeholder="Enter Permanent Email Id" required="required"
			name="permanent_email"  
			value="${student.father.emailid}" /><br> <input type="text"
			required="required" placeholder="Enter Contact Address"
			name="contact_address"  
			value="${student.mother.address}" /><br> <input type="number"
			required="required" placeholder="Enter Contact Phone No"
			name="contact_phoneno"  
			value="${student.mother.phone_no}" /><br> 
			
		<input type="email" required="required" placeholder="Enter Contact Email Id" name="contact_email"value="${student.mother.emailid}" /><br> 
			
		<input type="text" placeholder="Enter Local Guardian Name" name="localguardian_name" value="${student.local_guardian.name}" /><br>

		<input type="text" placeholder="Enter Local Guardian Address" name="localguardian_address" value="${student.local_guardian.address}" /><br> 
			
			
		<input type="number" placeholder="Enter Local Guardian Phone No" name="localguardian_phoneno" value="${student.local_guardian.phone_no}" /><br> 
			
		<input type="email" placeholder="Enter Local Guardian Email Id" name="localguardian_email" value="${student.local_guardian.emailid}" /><br> 
			
			<input type="submit" value="Save">
	</form>

<button onclick="goBack()">Go Back</button>

</body>
</html>
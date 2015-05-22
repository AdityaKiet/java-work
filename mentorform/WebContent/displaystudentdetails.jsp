<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome !!</title>
</head>
<body>
	<%
		session.setAttribute("student", request.getAttribute("student"));
	%>
	<ducat:message message="message"/>
	<form action="UpdateDetails" method="post">
		<input type="text" placeholder="Enter Name Here" name="name"
			value="${student.name}"readonly="readonly" /> <br> 
			
		<input name="department" value="${student.dept}"readonly="readonly"/> <br>
	
	
		<input type="number" placeholder="Enter Roll no. Here" value="${student.roll_no}" name="rollno"
			readonly="readonly" /><br> 
			
		
		<input type="text" value="${student.enrollment}"placeholder="Enter Enrollment No. Here" name="enrollmentno"
			readonly="readonly" /><br> 
			
		<input type="text" value="${student.batch}"placeholder="Enter Batch No. Here" name="batch"
			readonly="readonly" /><br>
			 
		<input type="text" value="${student.section}" name="section"/>
			 <br> 
			 ${student.isHosteller}	 Are you Hosteller ? <br> 
			 
		<input name="hostel" value="${student.nameOfHostel}" readonly="readonly"/>
			 <br> 
			 
		<input type="text" placeholder="Enter Room No" name="room_no" value="${student.roomno}" readonly="readonly"/><br> 
		
		
		<input type="text" placeholder="Enter Room Partner1" name="room_partner1" value="${student.roomPartner1}" readonly="readonly"/><br> 
		<input type="text" placeholder="Enter Room partner2" name="room_partner2" value="${student.roomPartner2}" readonly="readonly"/><br>
		<input type="text" placeholder="Enter Room partner3" name="room_partner3" value="${student.roomPartner3}" readonly="readonly"/><br> 
		
		
		
		<input type="number" required="required" placeholder="Enter Phone No" name="phone_no" value="${student.phoneno}" readonly="readonly"/><br>
		
		<input type="email" required="required" placeholder="Enter Email Id" name="email_id" value="${student.emailid}" readonly="readonly"/><br>
		
		<input type="text" required="required"  placeholder="Enter Current Address" name="current_address" value="${student.address}" readonly="readonly" /><br>
		
		<input type="text" required="required" placeholder="Enter Father Name" name="father_name" value="${student.father.name}" readonly="readonly"/><br>
		
		<input type="text" required="required" placeholder="Enter Father Qualification" name="father_qualification" value="${student.father.qualification}" readonly="readonly"/><br> 
		
		<input type="text" required="required" placeholder="Enter Father Profession" name="father_profession" value="${student.father.profession}" readonly="readonly"/><br> 
		
		<input type="text" required="required" placeholder="Enter Father Occupation" name="father_occupation" value="${student.father.occupation}" readonly="readonly"/><br>
		
		<input type="text" name="father_annual_income" readonly="readonly" value="${student.father.annual_income}"/><br> 
		
		<input type="text" required="required" placeholder="Enter Mother Name" name="mother_name" readonly="readonly" value="${student.mother.name}"/><br> 
		
		<input type="text" required="required" placeholder="Enter Mother Qualification" name="mother_qualification" readonly="readonly" value="${student.mother.qualification}"/><br>
		
		<input type="text" required="required" placeholder="Enter Mother Profession" name="mother_profession" readonly="readonly" value="${student.mother.profession}"/><br>
		
		<input type="text" required="required" placeholder="Enter Mother  Occupation" name="mother_occupation" readonly="readonly" value="${student.mother.occupation}"/><br>
		
		<input type="text" name="mother_annual_income" readonly="readonly" value="${student.mother.annual_income}"/><br> 
		
		<input type="text" required="required" placeholder="Enter Permanent Address" name="permanent_address" readonly="readonly" value="${student.father.address}" /><br>
		
		<input type="number" required="required" placeholder="Enter Permanent Phone No" name="permanent_phoneno" readonly="readonly" value="${student.father.phone_no}"/><br>
		
		<input type="email" placeholder="Enter Permanent Email Id" required="required" name="permanent_email" readonly="readonly" value="${student.father.emailid}"/><br>
		
		<input type="text" required="required" placeholder="Enter Contact Address" name="contact_address" readonly="readonly" value="${student.mother.address}"/><br> 
		 
		<input type="number" required="required" placeholder="Enter Contact Phone No" name="contact_phoneno" readonly="readonly" value="${student.mother.phone_no}" /><br> 
		
		<input type="email" required="required" placeholder="Enter Contact Email Id" name="contact_email" readonly="readonly" value="${student.mother.emailid}" /><br> 
		
		<input type="text" placeholder="Enter Local Guardian Name" name="localguardian_name" readonly="readonly" value="${student.local_guardian.name}"/><br> 
		
		<input type="text"	placeholder="Enter Local Guardian Address" name="localguardian_address" readonly="readonly" value="${student.local_guardian.address}"/><br>
		
		<input type="number" placeholder="Enter Local Guardian Phone No" name="localguardian_phoneno" readonly="readonly" value="${student.local_guardian.phone_no}"/><br>
		 
		<input type="email" placeholder="Enter Local Guardian Email Id" name="localguardian_email" readonly="readonly" value="${student.local_guardian.emailid}"/><br> 
		
		<input type="submit" value="Update">
	</form>

	<form action="secondpageservlet">
	<input type="submit" value="Next Page !!!"/>
	</form>
</body>
</html>
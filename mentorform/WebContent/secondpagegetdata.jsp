<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Details Here</title>
</head>
<body>
 Hello Roll No. ${roll_no}
<ducat:session id="${roll_no}" session="session"/>
<h1 align="center">Enter Your Attendance Here...</h1>
	<form action="secondpagesavedataservlet">
	<input type="number" placeholder="1st Sem Attendence"  name="Sem1Attendence"/><br>
	<input type="number" placeholder="2nd Sem Attendence"  name="Sem2Attendence"/><br>
	<input type="number" placeholder="3rd Sem Attendence"  name="Sem3Attendence"/><br>
	<input type="number" placeholder="4th Sem Attendence"  name="Sem4Attendence"/><br>
	<input type="number" placeholder="5th Sem Attendence"  name="Sem5Attendence"/><br>
	<input type="number" placeholder="6th Sem Attendence"  name="Sem6Attendence"/><br>
	<input type="number" placeholder="7th Sem Attendence"  name="Sem7Attendence"/><br>
	<input type="number" placeholder="8th Sem Attendence"  name="Sem8Attendence"/><br>
	
	<h1 align="center"> Enter your percentage here..</h1>
	<input type="number" placeholder="1st Sem Percentage"  name="Sem1Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem1carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem1">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem1">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	<input type="number" placeholder="2nd Sem Percentage"  name="Sem2Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem2carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem2">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem2">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	<input type="number" placeholder="3rd Sem Percentage"  name="Sem3Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem3carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem3">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem3">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	<input type="number" placeholder="4th Sem Percentage"  name="Sem4Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem4carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem4">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem4">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	
	<input type="number" placeholder="5th Sem Percentage"  name="Sem5Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem5carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem5">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem5">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	<input type="number" placeholder="6th Sem Percentage"  name="Sem6Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem6carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem6">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem6">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	
	<input type="number" placeholder="7th Sem Percentage"  name="Sem7Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem7carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem7">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem7">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	
	
	<input type="number" placeholder="8th Sem Percentage"  name="Sem8Percentage" max="100" min="0"/>
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<select name="sem8carryover">
	<option value="0"> 0 </option>
	<option value="1"> 1 </option>
	<option value="2"> 2 </option>
	<option value="3"> 3 </option>
	<option value="4"> 4 </option>
	<option value="5"> 5 </option>
	<option value="6"> 6 </option>
	<option value="7"> 7 </option>
	<option value="8"> 8 </option>
	</select>
	
	<select name="commnunicationwithparentssem8">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	
	<select name="responsefromparentssem8">
		<option value="1"> Yes </option>
		<option value="0"> No </option>
	</select>
	<br>
	
	<br><br><br><br><br>
	<h1 align="center"> Extra Carricular Activities</h1>
	
	<textarea rows="20" cols="150" maxlength="10000" name="extracarricularactivities" ></textarea>
	<br><br>
	<input type="submit" value="Submit"/>
	
	</form>
</body>
</html>
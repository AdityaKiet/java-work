<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script>
	function goBack() {
		window.history.back();
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update your data!!</title>
</head>
<body>
	Hello Roll No. ${roll_no}
	<br />
	<ducat:message message="message" />
	<ducat:session id="${roll_no}" session="session" />
	<h1 align="center">Enter Your Attendance Here...</h1>
	<form action="secondpageupdate">
		<input type="number" placeholder="1st Sem Attendence"
			name="Sem1Attendence"
			value="${secondPageDTO.attendenceDTO.sem1Attendence}" /><br> <input
			type="number" placeholder="2nd Sem Attendence" name="Sem2Attendence"
			value="${secondPageDTO.attendenceDTO.sem2Attendence}" /><br> <input
			type="number" placeholder="3rd Sem Attendence" name="Sem3Attendence"
			value="${secondPageDTO.attendenceDTO.sem3Attendence}" /><br> <input
			type="number" placeholder="4th Sem Attendence" name="Sem4Attendence"
			value="${secondPageDTO.attendenceDTO.sem4Attendence}" /><br> <input
			type="number" placeholder="5th Sem Attendence" name="Sem5Attendence"
			value="${secondPageDTO.attendenceDTO.sem5Attendence}" /><br> <input
			type="number" placeholder="6th Sem Attendence" name="Sem6Attendence"
			value="${secondPageDTO.attendenceDTO.sem6Attendence}" /><br> <input
			type="number" placeholder="7th Sem Attendence" name="Sem7Attendence"
			value="${secondPageDTO.attendenceDTO.sem7Attendence}" /><br> <input
			type="number" placeholder="8th Sem Attendence" name="Sem8Attendence"
			value="${secondPageDTO.attendenceDTO.sem8Attendence}" /><br>

		<h1 align="center">Enter your percentage here..</h1>
		<input type="number" placeholder="1st Sem Percentage"
			name="Sem1Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem1percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem1carryover">
			<option value="${secondPageDTO.percentageDTO.sem1backs}">${secondPageDTO.percentageDTO.sem1backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem1">
			<c:if test="${secondPageDTO.percentageDTO.sem1communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem1communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem1communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem1communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem1">
			<c:if test="${secondPageDTO.percentageDTO.sem1responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem1responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem1responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem1responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="2nd Sem Percentage"
			name="Sem2Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem2percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem2carryover">
			<option value="${secondPageDTO.percentageDTO.sem2backs}">${secondPageDTO.percentageDTO.sem2backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem2">
			<c:if test="${secondPageDTO.percentageDTO.sem2communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem2communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem2communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem2communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem2">
			<c:if test="${secondPageDTO.percentageDTO.sem2responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem2responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem2responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem2responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="3rd Sem Percentage"
			name="Sem3Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem3percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem3carryover">
			<option value="${secondPageDTO.percentageDTO.sem3backs}">${secondPageDTO.percentageDTO.sem3backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem3">
			<c:if test="${secondPageDTO.percentageDTO.sem3communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem3communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem3communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem3communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem3">
			<c:if test="${secondPageDTO.percentageDTO.sem3responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem3responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem3responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem3responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="4th Sem Percentage"
			name="Sem4Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem4percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem4carryover">
			<option value="${secondPageDTO.percentageDTO.sem4backs}">${secondPageDTO.percentageDTO.sem4backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem4">
			<c:if test="${secondPageDTO.percentageDTO.sem4communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem4communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem4communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem4communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem4">
			<c:if test="${secondPageDTO.percentageDTO.sem4responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem4responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem4responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem4responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="5th Sem Percentage"
			name="Sem5Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem5percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem5carryover">
			<option value="${secondPageDTO.percentageDTO.sem5backs}">${secondPageDTO.percentageDTO.sem5backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem5">
			<c:if test="${secondPageDTO.percentageDTO.sem5communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem5communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem5communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem5communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem5">
			<c:if test="${secondPageDTO.percentageDTO.sem5responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem5responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem5responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem5responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="6th Sem Percentage"
			name="Sem6Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem6percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem6carryover">
			<option value="${secondPageDTO.percentageDTO.sem6backs}">${secondPageDTO.percentageDTO.sem6backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem6">
			<c:if test="${secondPageDTO.percentageDTO.sem6communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem6communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem6communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem6communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem6">
			<c:if test="${secondPageDTO.percentageDTO.sem6responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem6responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem6responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem6responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="7th Sem Percentage"
			name="Sem7Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem7percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem7carryover">
			<option value="${secondPageDTO.percentageDTO.sem7backs}">${secondPageDTO.percentageDTO.sem7backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem7">
			<c:if test="${secondPageDTO.percentageDTO.sem7communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem7communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem7communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem7communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem7">
			<c:if test="${secondPageDTO.percentageDTO.sem7responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem7responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem7responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem7responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <input type="number" placeholder="8th Sem Percentage"
			name="Sem8Percentage" max="100" min="0"
			value="${secondPageDTO.percentageDTO.sem8percent}" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <select name="sem8carryover">
			<option value="${secondPageDTO.percentageDTO.sem8backs}">${secondPageDTO.percentageDTO.sem8backs}</option>
			<option value="0">0</option>
			<option value="1">1</option>
			<option value="2">2</option>
			<option value="3">3</option>
			<option value="4">4</option>
			<option value="5">5</option>
			<option value="6">6</option>
			<option value="7">7</option>
			<option value="8">8</option>
		</select> <select name="commnunicationwithparentssem8">
			<c:if test="${secondPageDTO.percentageDTO.sem8communication == 1}">
				<option value="${secondPageDTO.percentageDTO.sem8communication}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem8communication == 0}">
				<option value="${secondPageDTO.percentageDTO.sem8communication}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <select name="responsefromparentssem8">
			<c:if test="${secondPageDTO.percentageDTO.sem8responce==1}">
				<option value="${secondPageDTO.percentageDTO.sem8responce}">Yes</option>
			</c:if>
			<c:if test="${secondPageDTO.percentageDTO.sem8responce==0}">
				<option value="${secondPageDTO.percentageDTO.sem8responce}">No</option>
			</c:if>
			<option value="1">Yes</option>
			<option value="0">No</option>
		</select> <br> <br>
		<br>
		<br>
		<br>
		<br>
		<h1 align="center">Extra Carricular Activities</h1>

		<textarea rows="20" cols="150" maxlength="10000"
			name="extracarricularactivities">${secondPageDTO.extraActivitiesDTO.extraActivities} </textarea>
		<br>
		<br> <input type="submit" value="Save" />

	</form>
	<br>
	<form action="thirdPage">
		<input type="submit" value="Next Page" />
	</form>
	<br>
	<button onclick="goBack()">Go Back</button>


</body>
</html>
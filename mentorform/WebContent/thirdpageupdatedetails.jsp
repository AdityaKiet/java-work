<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>	
<script>
	function goBack() {
		window.history.back();
	}
</script>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Update Details Here</title>
</head>
<body>
Hello Roll Number ${thirdpage.roll_no}
<br><br>

	<form action="ThirdPageUpdateDataServlet" method="post">
	Special Courses and Certifications<br><br>
		<textarea rows="10" cols="150"name="special_courses">${thirdpage.thirdPageActivityDTO.special_courses}</textarea>
	<br><br>
	Training
		<br><br><textarea rows="10" cols="150" name="training">${thirdpage.thirdPageActivityDTO.training}</textarea>
	<br><br>
	Carrer Aspirations
		<br><br><textarea rows="10" cols="150" name="carrer_aspirations">${thirdpage.thirdPageActivityDTO.aspirations}</textarea>
		<br><br>
		Scores in competetive Exams
		<br><br>
		<h5>Gate Exam</h5>
		<br><input type="number" name="gate_score" placeholder="Score" value="${thirdpage.thirdPageScoreDTO.gate_score}"/>
			<input type="number" name="gate_year"placeholder="Year" value="${thirdpage.thirdPageScoreDTO.gate_year}"/>
			<input type="number" name="gate_air"placeholder="AIR" value="${thirdpage.thirdPageScoreDTO.gate_air}"/>
			<input type="text" name="gate_remarks"placeholder="Remakrs" value="${thirdpage.thirdPageScoreDTO.gate_remarks}"/>
		<br><br>
		<br><br>
		<h5>CAT Exam</h5>
		<br><input type="number" name="cat_score"placeholder="Score" value="${thirdpage.thirdPageScoreDTO.cat_score}"/>
			<input type="number" name="cat_year"placeholder="Year" value="${thirdpage.thirdPageScoreDTO.cat_year}"/>
			<input type="number" name="cat_air"placeholder="AIR"value="${thirdpage.thirdPageScoreDTO.cat_air}"/>
			<input type="text" name="cat_remarks"placeholder="Remakrs"value="${thirdpage.thirdPageScoreDTO.cat_remarks}"/>
		<br><br>
		<br><br>
		<h5>GMAT Exam</h5>
		<br><input type="number" name="gmat_score"placeholder="Score" value="${thirdpage.thirdPageScoreDTO.gmat_score}"/>
			<input type="number" name="gmat_year"placeholder="Year" value="${thirdpage.thirdPageScoreDTO.gmat_year}"/>
			<input type="number" name="gmat_air"placeholder="AIR" value="${thirdpage.thirdPageScoreDTO.gmat_air}"/>
			<input type="text" name="gmat_remarks"placeholder="Remakrs" value="${thirdpage.thirdPageScoreDTO.gmat_remarks}"/>
		<br><br>
		<br><br>
		<h5>Others Exam</h5>
		<br><input type="number" name="other_score"placeholder="Score"value="${thirdpage.thirdPageScoreDTO.other_score}"/>
			<input type="number" name="other_year"placeholder="Year" value="${thirdpage.thirdPageScoreDTO.other_year}"/>
			<input type="number" name="other_air"placeholder="AIR" value="${thirdpage.thirdPageScoreDTO.other_year}"/>
			<input type="text" name="other_remarks"placeholder="Remakrs" value="${thirdpage.thirdPageScoreDTO.other_remarks}"/>
		<br><br>
		Achievements
		<textarea rows="10" cols="150" name="achivements">${thirdpage.thirdPageActivityDTO.achievements}</textarea>
		<br><br>
		<input type="submit" value="Save"/>

	</form>
	<form action="">
		<input type="submit" value="Next Page" />
	</form>
	<br>
	<button onclick="goBack()">Go Back</button>
	
	</body>
</html>
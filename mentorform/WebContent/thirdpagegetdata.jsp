<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="ducat" tagdir="/WEB-INF/tags"%>	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Enter Details Here</title>
</head>
<body>
	<ducat:message message="message"/>
	<form action="ThirdPageSaveDataServlet" method="post">
	Special Courses and Certifications<br><br>
		<textarea rows="10" cols="150"name="special_courses"></textarea>
	<br><br>
	Training
		<br><br><textarea rows="10" cols="150" name="training"></textarea>
	<br><br>
	Carrer Aspirations
		<br><br><textarea rows="10" cols="150" name="carrer_aspirations"></textarea>
		<br><br>
		Scores in competetive Exams
		<br><br>
		<h5>Gate Exam</h5>
		<br><input type="number" name="gate_score" placeholder="Score"/>
			<input type="number" name="gate_year"placeholder="Year"/>
			<input type="number" name="gate_air"placeholder="AIR"/>
			<input type="text" name="gate_remarks"placeholder="Remakrs"/>
		<br><br>
		<br><br>
		<h5>CAT Exam</h5>
		<br><input type="number" name="cat_score"placeholder="Score"/>
			<input type="number" name="cat_year"placeholder="Year"/>
			<input type="number" name="cat_air"placeholder="AIR"/>
			<input type="text" name="cat_remarks"placeholder="Remakrs"/>
		<br><br>
		<br><br>
		<h5>GMAT Exam</h5>
		<br><input type="number" name="gmat_score"placeholder="Score"/>
			<input type="number" name="gmat_year"placeholder="Year"/>
			<input type="number" name="gmat_air"placeholder="AIR"/>
			<input type="text" name="gmat_remarks"placeholder="Remakrs"/>
		<br><br>
		<br><br>
		<h5>Others Exam</h5>
		<br><input type="number" name="other_score"placeholder="Score"/>
			<input type="number" name="other_year"placeholder="Year"/>
			<input type="number" name="other_air"placeholder="AIR"/>
			<input type="text" name="other_remarks"placeholder="Remakrs"/>
		<br><br>
		Achievements
		<textarea rows="10" cols="150" name="achivements"></textarea>
		<br><br>
		<input type="submit" value="Submit"/>

	</form>
</body>
</html>
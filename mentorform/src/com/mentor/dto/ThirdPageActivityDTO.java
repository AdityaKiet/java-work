package com.mentor.dto;

public class ThirdPageActivityDTO {
	private String roll_no;
	private String special_courses;
	private String training;
	private String aspirations;
	private String achievements;
	@Override
	public String toString() {
		return "ThirdPageDTO [roll_no=" + roll_no + ", special_courses="
				+ special_courses + ", training=" + training + ", aspirations="
				+ aspirations + ", achievements=" + achievements + "]";
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public String getSpecial_courses() {
		return special_courses;
	}
	public void setSpecial_courses(String special_courses) {
		this.special_courses = special_courses;
	}
	public String getTraining() {
		return training;
	}
	public void setTraining(String training) {
		this.training = training;
	}
	public String getAspirations() {
		return aspirations;
	}
	public void setAspirations(String aspirations) {
		this.aspirations = aspirations;
	}
	public String getAchievements() {
		return achievements;
	}
	public void setAchievements(String achievements) {
		this.achievements = achievements;
	}
}

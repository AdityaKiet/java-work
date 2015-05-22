package com.complaint.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Complaint_master")
public class Complaint {
	private String complaint;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int complaint_id;
	private String complaint_category;
	private String student_name;
	private String student_roll_no;
	private boolean is_solved;

	public String getComplaint() {
		return complaint;
	}

	public void setComplaint(String complaint) {
		this.complaint = complaint;
	}

	public int getComplaint_id() {
		return complaint_id;
	}

	public void setComplaint_id(int complaint_id) {
		this.complaint_id = complaint_id;
	}

	public String getComplaint_category() {
		return complaint_category;
	}

	public void setComplaint_category(String complaint_category) {
		this.complaint_category = complaint_category;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_roll_no() {
		return student_roll_no;
	}

	public void setStudent_roll_no(String student_roll_no) {
		this.student_roll_no = student_roll_no;
	}

	public boolean isIs_solved() {
		return is_solved;
	}

	public void setIs_solved(boolean is_solved) {
		this.is_solved = is_solved;
	}

	@Override
	public String toString() {
		return "Complaint [complaint=" + complaint + ", complaint_id="
				+ complaint_id + ", complaint_category=" + complaint_category
				+ ", student_name=" + student_name + ", student_roll_no="
				+ student_roll_no + ", is_solved=" + is_solved + "]";
	}

}

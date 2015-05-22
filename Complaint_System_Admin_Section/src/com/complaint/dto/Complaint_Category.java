package com.complaint.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Complaint Category Entity of database
 * 
 * @author aditya
 *
 */
@Entity
@Table(name = "complaint_type")
public class Complaint_Category {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int complaint_type_id;
	private String complaint_type;

	public int getComplaint_type_id() {
		return complaint_type_id;
	}

	public void setComplaint_type_id(int complaint_type_id) {
		this.complaint_type_id = complaint_type_id;
	}

	public String getComplaint_type() {
		return complaint_type;
	}

	public void setComplaint_type(String complaint_type) {
		this.complaint_type = complaint_type;
	}

	@Override
	public String toString() {
		return "Complaint_Category [complaint_type_id=" + complaint_type_id
				+ ", complaint_type=" + complaint_type + "]";
	}

}

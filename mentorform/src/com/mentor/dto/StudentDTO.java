package com.mentor.dto;

public class StudentDTO {
	private String dept;
	private String name;
	private String roll_no;
	private String enrollment;
	private String batch;
	private char section;
	private int isHosteller;
	private String nameOfHostel;
	private String roomno;
	private String roomPartner1;
	private String roomPartner2;
	private String roomPartner3;
	private String phoneno;
	private String emailid;
	private String address;
	private ParentDTO father;
	private ParentDTO mother;
	private ParentDTO local_guardian;

	@Override
	public String toString() {
		return "StudentDTO [dept=" + dept + ", name=" + name + ", roll_no="
				+ roll_no + ", enrollment=" + enrollment + ", batch=" + batch
				+ ", section=" + section + ", isHosteller=" + isHosteller
				+ ", nameOfHostel=" + nameOfHostel + ", roomno=" + roomno
				+ ", roomPartner1=" + roomPartner1 + ", roomPartner2="
				+ roomPartner2 + ", roomPartner3=" + roomPartner3
				+ ", phoneno=" + phoneno + ", emailid=" + emailid
				+ ", address=" + address + ", father=" + father + ", mother="
				+ mother + ", local_guardian=" + local_guardian + "]";
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}

	public String getEnrollment() {
		return enrollment;
	}

	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

	public String getBatch() {
		return batch;
	}

	public void setBatch(String batch) {
		this.batch = batch;
	}

	public char getSection() {
		return section;
	}

	public void setSection(char section) {
		this.section = section;
	}

	public int getIsHosteller() {
		return isHosteller;
	}

	public void setIsHosteller(int isHosteller) {
		this.isHosteller = isHosteller;
	}

	public String getNameOfHostel() {
		return nameOfHostel;
	}

	public void setNameOfHostel(String nameOfHostel) {
		this.nameOfHostel = nameOfHostel;
	}

	public String getRoomno() {
		return roomno;
	}

	public void setRoomno(String roomno) {
		this.roomno = roomno;
	}

	public String getRoomPartner1() {
		return roomPartner1;
	}

	public void setRoomPartner1(String roomPartner1) {
		this.roomPartner1 = roomPartner1;
	}

	public String getRoomPartner2() {
		return roomPartner2;
	}

	public void setRoomPartner2(String roomPartner2) {
		this.roomPartner2 = roomPartner2;
	}

	public String getRoomPartner3() {
		return roomPartner3;
	}

	public void setRoomPartner3(String roomPartner3) {
		this.roomPartner3 = roomPartner3;
	}

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ParentDTO getFather() {
		return father;
	}

	public void setFather(ParentDTO father) {
		this.father = father;
	}

	public ParentDTO getMother() {
		return mother;
	}

	public void setMother(ParentDTO mother) {
		this.mother = mother;
	}

	public ParentDTO getLocal_guardian() {
		return local_guardian;
	}

	public void setLocal_guardian(ParentDTO local_guardian) {
		this.local_guardian = local_guardian;
	}

}

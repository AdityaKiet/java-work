package com.mentor.dto;

public class SecondPageDTO {
	private AttendenceDTO attendenceDTO;
	private PercentageDTO percentageDTO;
	private ExtraActivitiesDTO extraActivitiesDTO;
	private String roll_no;
	public AttendenceDTO getAttendenceDTO() {
		return attendenceDTO;
	}
	public void setAttendenceDTO(AttendenceDTO attendenceDTO) {
		this.attendenceDTO = attendenceDTO;
	}
	public PercentageDTO getPercentageDTO() {
		return percentageDTO;
	}
	public void setPercentageDTO(PercentageDTO percentageDTO) {
		this.percentageDTO = percentageDTO;
	}
	public ExtraActivitiesDTO getExtraActivitiesDTO() {
		return extraActivitiesDTO;
	}
	public void setExtraActivitiesDTO(ExtraActivitiesDTO extraActivitiesDTO) {
		this.extraActivitiesDTO = extraActivitiesDTO;
	}
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	@Override
	public String toString() {
		return "SecondPageDTO [attendenceDTO=" + attendenceDTO
				+ ", percentageDTO=" + percentageDTO + ", extraActivitiesDTO="
				+ extraActivitiesDTO + ", roll_no=" + roll_no + "]";
	}
	

}

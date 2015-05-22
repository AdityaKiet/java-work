package com.mentor.dto;

public class ThirdPageDTO {
	private String roll_no;
	private ThirdPageScoreDTO thirdPageScoreDTO;
	private ThirdPageActivityDTO thirdPageActivityDTO;
	public String getRoll_no() {
		return roll_no;
	}
	public void setRoll_no(String roll_no) {
		this.roll_no = roll_no;
	}
	public ThirdPageScoreDTO getThirdPageScoreDTO() {
		return thirdPageScoreDTO;
	}
	public void setThirdPageScoreDTO(ThirdPageScoreDTO thirdPageScoreDTO) {
		this.thirdPageScoreDTO = thirdPageScoreDTO;
	}
	public ThirdPageActivityDTO getThirdPageActivityDTO() {
		return thirdPageActivityDTO;
	}
	public void setThirdPageActivityDTO(ThirdPageActivityDTO thirdPageActivityDTO) {
		this.thirdPageActivityDTO = thirdPageActivityDTO;
	}
	@Override
	public String toString() {
		return "ThirdPageDTO [roll_no=" + roll_no + ", thirdPageScoreDTO="
				+ thirdPageScoreDTO + ", thirdPageActivityDTO="
				+ thirdPageActivityDTO + "]";
	}
	
}

package com.mentor.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import com.mentor.dto.AttendenceDTO;
import com.mentor.dto.ExtraActivitiesDTO;
import com.mentor.dto.ParentDTO;
import com.mentor.dto.PercentageDTO;
import com.mentor.dto.SecondPageDTO;
import com.mentor.dto.StudentDTO;
import com.mentor.dto.ThirdPageActivityDTO;
import com.mentor.dto.ThirdPageDTO;
import com.mentor.dto.ThirdPageScoreDTO;

/**
 * 
 * @author Aditya Set of methods to get data from Database of Mentor Form
 *         Module.
 * 
 */
public class JDBC {

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *             It creates connection with database.
	 */
	private static Connection getConnection() throws ClassNotFoundException,
			SQLException {
		ResourceBundle rb = ResourceBundle.getBundle("db");
		String driverName = rb.getString("drivername");
		Class.forName(driverName);
		System.out.println("Driver Loaded...");
		String url = rb.getString("dburl");
		String userid = rb.getString("userid");
		String password = rb.getString("password");
		Connection con = DriverManager.getConnection(url, userid, password);
		if (con != null) {
			System.out.println("Connection Ready...");
		}
		return con;
	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *             Takes the list of department from Database.
	 */
	public static List<String> getBranches() throws ClassNotFoundException,
			SQLException {
		List<String> branches = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from department");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				branches.add(rs.getString("Dept_Name"));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return branches;
	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 *             Gives the list of hostels stored in database.
	 */
	public static List<String> getHostel() throws ClassNotFoundException,
			SQLException {
		List<String> hostel = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from hostel");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				hostel.add(rs.getString("hostel_name"));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return hostel;
	}

	/**
	 * 
	 * @param studentDTO
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static boolean saveStudentData(StudentDTO studentDTO)
			throws SQLException, ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultSet;
		try {
			con = getConnection();
			pstmt = con
					.prepareStatement("insert into student_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			con.setAutoCommit(false);
			pstmt.setString(1, studentDTO.getDept());
			pstmt.setString(2, studentDTO.getName());
			pstmt.setString(3, studentDTO.getRoll_no());
			pstmt.setString(4, studentDTO.getEnrollment());
			pstmt.setString(5, studentDTO.getBatch());
			pstmt.setString(6, "" + studentDTO.getSection());
			pstmt.setInt(7, studentDTO.getIsHosteller());
			pstmt.setString(8, studentDTO.getNameOfHostel());
			pstmt.setString(9, studentDTO.getRoomno());
			pstmt.setString(10, studentDTO.getRoomPartner1());
			pstmt.setString(11, studentDTO.getRoomPartner2());
			pstmt.setString(12, studentDTO.getRoomPartner3());
			pstmt.setString(13, studentDTO.getPhoneno());
			pstmt.setString(14, studentDTO.getEmailid());
			pstmt.setString(15, studentDTO.getAddress());
			pstmt.setString(16, studentDTO.getFather().getName());
			pstmt.setString(17, studentDTO.getFather().getQualification());
			pstmt.setString(18, studentDTO.getFather().getProfession());
			pstmt.setString(19, studentDTO.getFather().getOccupation());
			pstmt.setString(20, studentDTO.getFather().getAnnual_income());
			pstmt.setString(21, studentDTO.getMother().getName());
			pstmt.setString(22, studentDTO.getMother().getQualification());
			pstmt.setString(23, studentDTO.getMother().getProfession());
			pstmt.setString(24, studentDTO.getMother().getOccupation());
			pstmt.setString(25, studentDTO.getMother().getAnnual_income());
			pstmt.setString(26, studentDTO.getFather().getAddress());
			pstmt.setString(27, studentDTO.getFather().getPhone_no());
			pstmt.setString(28, studentDTO.getFather().getEmailid());
			pstmt.setString(29, studentDTO.getMother().getAddress());
			pstmt.setString(30, studentDTO.getMother().getPhone_no());
			pstmt.setString(31, studentDTO.getMother().getEmailid());
			pstmt.setString(32, studentDTO.getLocal_guardian().getName());
			pstmt.setString(33, studentDTO.getLocal_guardian().getAddress());
			pstmt.setString(34, studentDTO.getLocal_guardian().getPhone_no());
			pstmt.setString(35, studentDTO.getLocal_guardian().getEmailid());
			resultSet = pstmt.executeUpdate();
			if (resultSet > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

	/**
	 * 
	 * @param rollno
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static StudentDTO getStudentDetails(String rollno)
			throws ClassNotFoundException, SQLException {
		StudentDTO studentDTO = new StudentDTO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = getConnection();
			pstmt = con
					.prepareStatement("select * from student_info where roll_no = '"
							+ rollno + "'");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				studentDTO.setName(rs.getString("name"));
				studentDTO.setDept(rs.getString("dept"));
				studentDTO.setRoll_no(rs.getString("roll_no"));
				studentDTO.setEnrollment(rs.getString("enrollment_no"));
				studentDTO.setBatch(rs.getString("batch"));
				studentDTO.setSection(rs.getString("section").charAt(0));
				studentDTO.setIsHosteller(rs.getInt("isHosteller"));
				studentDTO.setNameOfHostel(rs.getString("nameOfHostel"));
				studentDTO.setRoomno(rs.getString("room_no"));
				studentDTO.setRoomPartner1(rs.getString("room_partner1"));
				studentDTO.setRoomPartner2(rs.getString("room_partner2"));
				studentDTO.setRoomPartner3(rs.getString("room_partner3"));
				studentDTO.setPhoneno(rs.getString("phone_no"));
				studentDTO.setEmailid(rs.getString("email_id"));
				studentDTO.setAddress(rs.getString("current_address"));
				ParentDTO dto = new ParentDTO();
				dto.setName(rs.getString("father_name"));
				dto.setQualification(rs.getString("father_qualification"));
				dto.setProfession(rs.getString("father_profession"));
				dto.setOccupation(rs.getString("father_occupation"));
				dto.setAnnual_income(rs.getString("father_annual_income"));
				dto.setAddress(rs.getString("permanent_address"));
				dto.setPhone_no(rs.getString("permanent_phoneno"));
				dto.setEmailid(rs.getString("permanent_email"));
				studentDTO.setFather(dto);
				dto = null;
				dto = new ParentDTO();
				dto.setName(rs.getString("mother_name"));
				dto.setQualification(rs.getString("mother_qualification"));
				dto.setProfession(rs.getString("mother_profession"));
				dto.setOccupation(rs.getString("mother_occupation"));
				dto.setAnnual_income(rs.getString("mother_annual_income"));
				dto.setAddress(rs.getString("contact_address"));
				dto.setPhone_no(rs.getString("contact_phoneno"));
				dto.setEmailid(rs.getString("contact_email"));
				studentDTO.setMother(dto);
				dto = null;
				dto = new ParentDTO();
				dto.setName(rs.getString("localguardian_name"));
				dto.setAddress(rs.getString("localguardian_address"));
				dto.setPhone_no(rs.getString("localguardian_phoneno"));
				dto.setEmailid(rs.getString("localguardian_email"));
				studentDTO.setLocal_guardian(dto);
				dto = null;
			} else {
				studentDTO = null;
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return studentDTO;
	}

	/**
	 * 
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static List<String> getIncomeList() throws ClassNotFoundException,
			SQLException {
		List<String> income = new ArrayList<>();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = getConnection();
			pstmt = con.prepareStatement("select * from income");
			rs = pstmt.executeQuery();
			while (rs.next()) {
				income.add(rs.getString("Income"));
			}
		} finally {
			if (rs != null) {
				rs.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return income;
	}

	/**
	 * 
	 * @param studentDTO
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static boolean updateStudentData(StudentDTO studentDTO)
			throws SQLException, ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		int resultSet;
		try {
			con = getConnection();
			pstmt = con
					.prepareStatement("update student_info set dept =?,name=?,roll_no=?,enrollment_no=?,batch=?,section=?,isHosteller=?,nameOfHostel=?,room_no=?,room_partner1=?,room_partner2=?,room_partner3=?,phone_no=?,email_id=?,current_address=?,father_name=?,father_qualification=?,father_profession=?,father_occupation=?,father_annual_income=?,mother_name=?,mother_qualification=?,mother_profession=?,mother_occupation=?,mother_annual_income=?,permanent_address=?,permanent_phoneno=?,permanent_email=?,contact_address=?,contact_phoneno=?,contact_email=?,localguardian_name=?,localguardian_address=?,localguardian_phoneno=?,localguardian_email=? where roll_no = '"
							+ studentDTO.getRoll_no() + "'");
			con.setAutoCommit(false);
			pstmt.setString(1, studentDTO.getDept());
			pstmt.setString(2, studentDTO.getName());
			pstmt.setString(3, studentDTO.getRoll_no());
			pstmt.setString(4, studentDTO.getEnrollment());
			pstmt.setString(5, studentDTO.getBatch());
			pstmt.setString(6, "" + studentDTO.getSection());
			pstmt.setInt(7, studentDTO.getIsHosteller());
			pstmt.setString(8, studentDTO.getNameOfHostel());
			pstmt.setString(9, studentDTO.getRoomno());
			pstmt.setString(10, studentDTO.getRoomPartner1());
			pstmt.setString(11, studentDTO.getRoomPartner2());
			pstmt.setString(12, studentDTO.getRoomPartner3());
			pstmt.setString(13, studentDTO.getPhoneno());
			pstmt.setString(14, studentDTO.getEmailid());
			pstmt.setString(15, studentDTO.getAddress());
			pstmt.setString(16, studentDTO.getFather().getName());
			pstmt.setString(17, studentDTO.getFather().getQualification());
			pstmt.setString(18, studentDTO.getFather().getProfession());
			pstmt.setString(19, studentDTO.getFather().getOccupation());
			pstmt.setString(20, studentDTO.getFather().getAnnual_income());
			pstmt.setString(21, studentDTO.getMother().getName());
			pstmt.setString(22, studentDTO.getMother().getQualification());
			pstmt.setString(23, studentDTO.getMother().getProfession());
			pstmt.setString(24, studentDTO.getMother().getOccupation());
			pstmt.setString(25, studentDTO.getMother().getAnnual_income());
			pstmt.setString(26, studentDTO.getFather().getAddress());
			pstmt.setString(27, studentDTO.getFather().getPhone_no());
			pstmt.setString(28, studentDTO.getFather().getEmailid());
			pstmt.setString(29, studentDTO.getMother().getAddress());
			pstmt.setString(30, studentDTO.getMother().getPhone_no());
			pstmt.setString(31, studentDTO.getMother().getEmailid());
			pstmt.setString(32, studentDTO.getLocal_guardian().getName());
			pstmt.setString(33, studentDTO.getLocal_guardian().getAddress());
			pstmt.setString(34, studentDTO.getLocal_guardian().getPhone_no());
			pstmt.setString(35, studentDTO.getLocal_guardian().getEmailid());
			resultSet = pstmt.executeUpdate();
			if (resultSet > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}
		} finally {
			if (pstmt != null) {
				pstmt.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

	/**
	 * 
	 */
	public static boolean saveSecondPageStudentData(SecondPageDTO secondPageDTO)
			throws SQLException, ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		AttendenceDTO attendenceDTO = secondPageDTO.getAttendenceDTO();
		PercentageDTO percentageDTO = secondPageDTO.getPercentageDTO();
		ExtraActivitiesDTO extraActivitiesDTO = secondPageDTO
				.getExtraActivitiesDTO();
		String roll_no = secondPageDTO.getRoll_no();

		try {
			con = getConnection();
			con.setAutoCommit(false);
			pstmt1 = con
					.prepareStatement("insert into aggregate_attendance values(?,?,?,?,?,?,?,?,?)");
			pstmt1.setString(1, roll_no);
			pstmt1.setString(2, attendenceDTO.getSem1Attendence());
			pstmt1.setString(3, attendenceDTO.getSem2Attendence());
			pstmt1.setString(4, attendenceDTO.getSem3Attendence());
			pstmt1.setString(5, attendenceDTO.getSem4Attendence());
			pstmt1.setString(6, attendenceDTO.getSem5Attendence());
			pstmt1.setString(7, attendenceDTO.getSem6Attendence());
			pstmt1.setString(8, attendenceDTO.getSem7Attendence());
			pstmt1.setString(9, attendenceDTO.getSem8Attendence());
			rs1 = pstmt1.executeUpdate();

			pstmt2 = con
					.prepareStatement("insert into percentage_master values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt2.setString(1, roll_no);
			pstmt2.setString(2, percentageDTO.getSem1percent());
			pstmt2.setInt(3, percentageDTO.getSem1backs());
			pstmt2.setInt(4, percentageDTO.getSem1communication());
			pstmt2.setInt(5, percentageDTO.getSem1responce());
			pstmt2.setString(6, percentageDTO.getSem2percent());
			pstmt2.setInt(7, percentageDTO.getSem2backs());
			pstmt2.setInt(8, percentageDTO.getSem2communication());
			pstmt2.setInt(9, percentageDTO.getSem2responce());
			pstmt2.setString(10, percentageDTO.getSem3percent());
			pstmt2.setInt(11, percentageDTO.getSem3backs());
			pstmt2.setInt(12, percentageDTO.getSem3communication());
			pstmt2.setInt(13, percentageDTO.getSem3responce());
			pstmt2.setString(14, percentageDTO.getSem4percent());
			pstmt2.setInt(15, percentageDTO.getSem4backs());
			pstmt2.setInt(16, percentageDTO.getSem4communication());
			pstmt2.setInt(17, percentageDTO.getSem4responce());
			pstmt2.setString(18, percentageDTO.getSem5percent());
			pstmt2.setInt(19, percentageDTO.getSem5backs());
			pstmt2.setInt(20, percentageDTO.getSem5communication());
			pstmt2.setInt(21, percentageDTO.getSem5responce());
			pstmt2.setString(22, percentageDTO.getSem6percent());
			pstmt2.setInt(23, percentageDTO.getSem6backs());
			pstmt2.setInt(24, percentageDTO.getSem6communication());
			pstmt2.setInt(25, percentageDTO.getSem6responce());
			pstmt2.setString(26, percentageDTO.getSem7percent());
			pstmt2.setInt(27, percentageDTO.getSem7backs());
			pstmt2.setInt(28, percentageDTO.getSem7communication());
			pstmt2.setInt(29, percentageDTO.getSem7responce());
			pstmt2.setString(30, percentageDTO.getSem8percent());
			pstmt2.setInt(31, percentageDTO.getSem8backs());
			pstmt2.setInt(32, percentageDTO.getSem8communication());
			pstmt2.setInt(33, percentageDTO.getSem8responce());
			rs2 = pstmt2.executeUpdate();

			pstmt3 = con
					.prepareStatement("insert into extra_carricular_activities values(?,?)");
			pstmt3.setString(1, roll_no);
			pstmt3.setString(2, extraActivitiesDTO.getExtraActivities());
			rs3 = pstmt3.executeUpdate();

			if (rs1 > 0 && rs2 > 0 && rs3 > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}

		} finally {
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (pstmt3 != null) {
				pstmt3.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

	/**
	 * 
	 * @param rollno
	 * @return
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static SecondPageDTO getSecondPageData(String rollno)
			throws ClassNotFoundException, SQLException {

		SecondPageDTO secondPageDTO = new SecondPageDTO();
		AttendenceDTO attendenceDTO = null;
		PercentageDTO percentageDTO = null;
		ExtraActivitiesDTO extraActivitiesDTO = null;

		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		ResultSet rs3 = null;

		try {
			con = getConnection();

			pstmt1 = con
					.prepareStatement("select * from aggregate_attendance where roll_no = '"
							+ rollno + "'");
			rs1 = pstmt1.executeQuery();

			pstmt2 = con
					.prepareStatement("select * from percentage_master where roll_no = '"
							+ rollno + "'");
			rs2 = pstmt2.executeQuery();

			pstmt3 = con
					.prepareStatement("select * from extra_carricular_activities where roll_no = '"
							+ rollno + "'");
			rs3 = pstmt3.executeQuery();

			if (rs1.next() && rs2.next() && rs3.next()) {

				attendenceDTO = new AttendenceDTO();
				attendenceDTO.setSem1Attendence(rs1.getString("sem1"));
				attendenceDTO.setSem2Attendence(rs1.getString("sem2"));
				attendenceDTO.setSem3Attendence(rs1.getString("sem3"));
				attendenceDTO.setSem4Attendence(rs1.getString("sem4"));
				attendenceDTO.setSem5Attendence(rs1.getString("sem5"));
				attendenceDTO.setSem6Attendence(rs1.getString("sem6"));
				attendenceDTO.setSem7Attendence(rs1.getString("sem7"));
				attendenceDTO.setSem8Attendence(rs1.getString("sem8"));
				secondPageDTO.setAttendenceDTO(attendenceDTO);

				percentageDTO = new PercentageDTO();
				percentageDTO.setSem1percent(rs2.getString("sem1"));
				percentageDTO.setSem2percent(rs2.getString("sem2"));
				percentageDTO.setSem3percent(rs2.getString("sem3"));
				percentageDTO.setSem4percent(rs2.getString("sem4"));
				percentageDTO.setSem5percent(rs2.getString("sem5"));
				percentageDTO.setSem6percent(rs2.getString("sem6"));
				percentageDTO.setSem7percent(rs2.getString("sem7"));
				percentageDTO.setSem8percent(rs2.getString("sem8"));
				percentageDTO.setSem1backs(Integer.parseInt(rs2
						.getString("sem1backs")));
				percentageDTO.setSem2backs(Integer.parseInt(rs2
						.getString("sem2backs")));
				percentageDTO.setSem3backs(Integer.parseInt(rs2
						.getString("sem3backs")));
				percentageDTO.setSem4backs(Integer.parseInt(rs2
						.getString("sem4backs")));
				percentageDTO.setSem5backs(Integer.parseInt(rs2
						.getString("sem5backs")));
				percentageDTO.setSem6backs(Integer.parseInt(rs2
						.getString("sem6backs")));
				percentageDTO.setSem7backs(Integer.parseInt(rs2
						.getString("sem7backs")));
				percentageDTO.setSem8backs(Integer.parseInt(rs2
						.getString("sem8backs")));
				percentageDTO.setSem1communication(Integer.parseInt(rs2
						.getString("sem1communication")));
				percentageDTO.setSem2communication(Integer.parseInt(rs2
						.getString("sem2communication")));
				percentageDTO.setSem3communication(Integer.parseInt(rs2
						.getString("sem3communication")));
				percentageDTO.setSem4communication(Integer.parseInt(rs2
						.getString("sem4communication")));
				percentageDTO.setSem5communication(Integer.parseInt(rs2
						.getString("sem5communication")));
				percentageDTO.setSem6communication(Integer.parseInt(rs2
						.getString("sem6communication")));
				percentageDTO.setSem7communication(Integer.parseInt(rs2
						.getString("sem7communication")));
				percentageDTO.setSem8communication(Integer.parseInt(rs2
						.getString("sem8communication")));
				percentageDTO.setSem1responce(Integer.parseInt(rs2
						.getString("sem1response")));
				percentageDTO.setSem2responce(Integer.parseInt(rs2
						.getString("sem2response")));
				percentageDTO.setSem3responce(Integer.parseInt(rs2
						.getString("sem3response")));
				percentageDTO.setSem4responce(Integer.parseInt(rs2
						.getString("sem4response")));
				percentageDTO.setSem5responce(Integer.parseInt(rs2
						.getString("sem5response")));
				percentageDTO.setSem6responce(Integer.parseInt(rs2
						.getString("sem6response")));
				percentageDTO.setSem7responce(Integer.parseInt(rs2
						.getString("sem7response")));
				percentageDTO.setSem8responce(Integer.parseInt(rs2
						.getString("sem8response")));
				secondPageDTO.setPercentageDTO(percentageDTO);

				extraActivitiesDTO = new ExtraActivitiesDTO();
				extraActivitiesDTO.setExtraActivities(rs3
						.getString("activities"));
				secondPageDTO.setExtraActivitiesDTO(extraActivitiesDTO);

			} else {
				secondPageDTO = null;
			}
		} finally {
			if (rs1 != null) {
				rs1.close();
			}
			if (rs2 != null) {
				rs2.close();
			}
			if (rs3 != null) {
				rs3.close();
			}
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (pstmt3 != null) {
				pstmt3.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return secondPageDTO;
	}

	/**
	 * 
	 * @param secondPageDTO
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static boolean updateSecondPageStudentData(
			SecondPageDTO secondPageDTO) throws SQLException,
			ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		PreparedStatement pstmt3 = null;
		int rs1 = 0;
		int rs2 = 0;
		int rs3 = 0;
		AttendenceDTO attendenceDTO = secondPageDTO.getAttendenceDTO();
		PercentageDTO percentageDTO = secondPageDTO.getPercentageDTO();
		ExtraActivitiesDTO extraActivitiesDTO = secondPageDTO
				.getExtraActivitiesDTO();

		try {
			con = getConnection();
			con.setAutoCommit(false);
			pstmt1 = con
					.prepareStatement("update aggregate_attendance set sem1=?,sem2=?,sem3=?,sem4=?,sem5=?,sem6=?,sem7=?,sem8=? where roll_no = '"
							+ secondPageDTO.getRoll_no() + "'");
			pstmt1.setString(1, attendenceDTO.getSem1Attendence());
			pstmt1.setString(2, attendenceDTO.getSem2Attendence());
			pstmt1.setString(3, attendenceDTO.getSem3Attendence());
			pstmt1.setString(4, attendenceDTO.getSem4Attendence());
			pstmt1.setString(5, attendenceDTO.getSem5Attendence());
			pstmt1.setString(6, attendenceDTO.getSem6Attendence());
			pstmt1.setString(7, attendenceDTO.getSem7Attendence());
			pstmt1.setString(8, attendenceDTO.getSem8Attendence());
			rs1 = pstmt1.executeUpdate();

			pstmt2 = con
					.prepareStatement("update percentage_master set sem1=?,sem1backs=?,sem1communication=?,sem1response=?,sem2=?,sem2backs=?,sem2communication=?,sem2response=?,sem3=?,sem3backs=?,sem3communication=?,sem3response=?,sem4=?,sem4backs=?,sem4communication=?,sem4response=?,sem5=?,sem5backs=?,sem5communication=?,sem5response=?,sem6=?,sem6backs=?,sem6communication=?,sem6response=?,sem7=?,sem7backs=?,sem7communication=?,sem7response=?,sem8=?,sem8backs=?,sem8communication=?,sem8response=? where roll_no='"
							+ secondPageDTO.getRoll_no() + "'");
			pstmt2.setString(1, percentageDTO.getSem1percent());
			pstmt2.setInt(2, percentageDTO.getSem1backs());
			pstmt2.setInt(3, percentageDTO.getSem1communication());
			pstmt2.setInt(4, percentageDTO.getSem1responce());
			pstmt2.setString(5, percentageDTO.getSem2percent());
			pstmt2.setInt(6, percentageDTO.getSem2backs());
			pstmt2.setInt(7, percentageDTO.getSem2communication());
			pstmt2.setInt(8, percentageDTO.getSem2responce());
			pstmt2.setString(9, percentageDTO.getSem3percent());
			pstmt2.setInt(10, percentageDTO.getSem3backs());
			pstmt2.setInt(11, percentageDTO.getSem3communication());
			pstmt2.setInt(12, percentageDTO.getSem3responce());
			pstmt2.setString(13, percentageDTO.getSem4percent());
			pstmt2.setInt(14, percentageDTO.getSem4backs());
			pstmt2.setInt(15, percentageDTO.getSem4communication());
			pstmt2.setInt(16, percentageDTO.getSem4responce());
			pstmt2.setString(17, percentageDTO.getSem5percent());
			pstmt2.setInt(18, percentageDTO.getSem5backs());
			pstmt2.setInt(19, percentageDTO.getSem5communication());
			pstmt2.setInt(20, percentageDTO.getSem5responce());
			pstmt2.setString(21, percentageDTO.getSem6percent());
			pstmt2.setInt(22, percentageDTO.getSem6backs());
			pstmt2.setInt(23, percentageDTO.getSem6communication());
			pstmt2.setInt(24, percentageDTO.getSem6responce());
			pstmt2.setString(25, percentageDTO.getSem7percent());
			pstmt2.setInt(26, percentageDTO.getSem7backs());
			pstmt2.setInt(27, percentageDTO.getSem7communication());
			pstmt2.setInt(28, percentageDTO.getSem7responce());
			pstmt2.setString(29, percentageDTO.getSem8percent());
			pstmt2.setInt(30, percentageDTO.getSem8backs());
			pstmt2.setInt(31, percentageDTO.getSem8communication());
			pstmt2.setInt(32, percentageDTO.getSem8responce());
			rs2 = pstmt2.executeUpdate();

			pstmt3 = con
					.prepareStatement("update extra_carricular_activities set activities=? where roll_no ='"
							+ secondPageDTO.getRoll_no() + "'");
			pstmt3.setString(1, extraActivitiesDTO.getExtraActivities());
			rs3 = pstmt3.executeUpdate();

			if (rs1 > 0 && rs2 > 0 && rs3 > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}

		} finally {
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (pstmt3 != null) {
				pstmt3.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

	/**
	 * 
	 * @param thirdPageDTO
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static boolean saveThirdPageStudentData(ThirdPageDTO thirdPageDTO)
			throws SQLException, ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		int rs1 = 0;
		int rs2 = 0;

		ThirdPageActivityDTO thirdPageActivityDTO = thirdPageDTO
				.getThirdPageActivityDTO();
		ThirdPageScoreDTO thirdPageScoreDTO = thirdPageDTO
				.getThirdPageScoreDTO();

		try {
			con = getConnection();
			con.setAutoCommit(false);
			pstmt1 = con
					.prepareStatement("insert into third_page_master values(?,?,?,?,?)");
			pstmt1.setString(1, thirdPageDTO.getRoll_no());
			pstmt1.setString(2, thirdPageActivityDTO.getSpecial_courses());
			pstmt1.setString(3, thirdPageActivityDTO.getTraining());
			pstmt1.setString(4, thirdPageActivityDTO.getAspirations());
			pstmt1.setString(5, thirdPageActivityDTO.getAchievements());
			rs1 = pstmt1.executeUpdate();

			pstmt2 = con
					.prepareStatement("insert into competetive_exams values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			pstmt2.setString(1, thirdPageScoreDTO.getGate_score());
			pstmt2.setString(2, thirdPageScoreDTO.getGate_air());
			pstmt2.setString(3, thirdPageScoreDTO.getGate_year());
			pstmt2.setString(4, thirdPageScoreDTO.getGate_remarks());
			pstmt2.setString(5, thirdPageScoreDTO.getCat_score());
			pstmt2.setString(6, thirdPageScoreDTO.getCat_air());
			pstmt2.setString(7, thirdPageScoreDTO.getCat_year());
			pstmt2.setString(8, thirdPageScoreDTO.getCat_remarks());
			pstmt2.setString(9, thirdPageScoreDTO.getGmat_score());
			pstmt2.setString(10, thirdPageScoreDTO.getGmat_air());
			pstmt2.setString(11, thirdPageScoreDTO.getGmat_year());
			pstmt2.setString(12, thirdPageScoreDTO.getGmat_remarks());
			pstmt2.setString(13, thirdPageScoreDTO.getOther_score());
			pstmt2.setString(14, thirdPageScoreDTO.getOther_air());
			pstmt2.setString(15, thirdPageScoreDTO.getOther_year());
			pstmt2.setString(16, thirdPageScoreDTO.getOther_remarks());
			pstmt2.setString(17, thirdPageScoreDTO.getRoll_no());
			rs2 = pstmt2.executeUpdate();

			if (rs1 > 0 && rs2 > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}

		} finally {
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

	public static ThirdPageDTO getThirdPageData(String rollno)
			throws ClassNotFoundException, SQLException {

		ThirdPageDTO thirdPageDTO = new ThirdPageDTO();
		ThirdPageActivityDTO thirdPageActivityDTO = null;
		ThirdPageScoreDTO thirdPageScoreDTO = null;

		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;

		try {
			con = getConnection();

			pstmt1 = con
					.prepareStatement("select * from third_page_master where roll_no = '"
							+ rollno + "'");
			rs1 = pstmt1.executeQuery();

			pstmt2 = con
					.prepareStatement("select * from competetive_exams where roll_no = '"
							+ rollno + "'");
			rs2 = pstmt2.executeQuery();

			if (rs1.next() && rs2.next()) {

				thirdPageActivityDTO = new ThirdPageActivityDTO();
				thirdPageActivityDTO.setSpecial_courses(rs1
						.getString("special_courses"));
				thirdPageActivityDTO.setTraining(rs1.getString("training"));
				thirdPageActivityDTO.setAspirations(rs1
						.getString("aspirations"));
				thirdPageActivityDTO.setAchievements(rs1
						.getString("achievements"));
				thirdPageDTO.setThirdPageActivityDTO(thirdPageActivityDTO);

				thirdPageScoreDTO = new ThirdPageScoreDTO();
				thirdPageScoreDTO.setGate_score(rs2.getString("gate_score"));
				thirdPageScoreDTO.setGate_air(rs2.getString("gate_air"));
				thirdPageScoreDTO.setGate_year(rs2.getString("gate_year"));
				thirdPageScoreDTO
						.setGate_remarks(rs2.getString("gate_remarks"));
				thirdPageScoreDTO.setCat_score(rs2.getString("cat_score"));
				thirdPageScoreDTO.setCat_air(rs2.getString("cat_air"));
				thirdPageScoreDTO.setCat_year(rs2.getString("cat_year"));
				thirdPageScoreDTO.setCat_remarks(rs2.getString("cat_remarks"));
				thirdPageScoreDTO.setGmat_score(rs2.getString("gmat_score"));
				thirdPageScoreDTO.setGmat_air(rs2.getString("gmat_air"));
				thirdPageScoreDTO.setGmat_year(rs2.getString("gmat_year"));
				thirdPageScoreDTO
						.setGmat_remarks(rs2.getString("gmat_remarks"));
				thirdPageScoreDTO.setOther_score(rs2.getString("other_score"));
				thirdPageScoreDTO.setOther_air(rs2.getString("other_air"));
				thirdPageScoreDTO.setOther_year(rs2.getString("other_year"));
				thirdPageScoreDTO.setOther_remarks(rs2
						.getString("other_remarks"));
				thirdPageDTO.setThirdPageScoreDTO(thirdPageScoreDTO);

				thirdPageDTO.setRoll_no(rollno);

			} else {
				thirdPageDTO = null;
			}
		} finally {
			if (rs1 != null) {
				rs1.close();
			}
			if (rs2 != null) {
				rs2.close();
			}
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return thirdPageDTO;
	}

	/**
	 * 
	 * @param thirdPageDTO
	 * @return
	 * @throws SQLException
	 * @throws ClassNotFoundException
	 */
	public static boolean updateThirdPageStudentData(ThirdPageDTO thirdPageDTO)
			throws SQLException, ClassNotFoundException {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		int rs1 = 0;
		int rs2 = 0;

		ThirdPageActivityDTO thirdPageActivityDTO = thirdPageDTO
				.getThirdPageActivityDTO();
		ThirdPageScoreDTO thirdPageScoreDTO = thirdPageDTO
				.getThirdPageScoreDTO();

		try {
			con = getConnection();
			con.setAutoCommit(false);
			pstmt1 = con
					.prepareStatement("update third_page_master set special_courses=?,training=?,aspirations=?,achievements=? where roll_no = '"
							+ thirdPageDTO.getRoll_no() + "'");
			pstmt1.setString(1, thirdPageActivityDTO.getSpecial_courses());
			pstmt1.setString(2, thirdPageActivityDTO.getTraining());
			pstmt1.setString(3, thirdPageActivityDTO.getAspirations());
			pstmt1.setString(4, thirdPageActivityDTO.getAchievements());
			rs1 = pstmt1.executeUpdate();

			pstmt2 = con
					.prepareStatement("update competetive_exams set gate_score=?,gate_air=?,gate_year=?,gate_remarks=?,cat_score=?,cat_air=?,cat_year=?,cat_remarks=?,gmat_score=?,gmat_air=?,gmat_year=?,gmat_remarks=?,other_score=?,other_air=?,other_year=?,other_remarks=? where roll_no='"
							+ thirdPageDTO.getRoll_no() + "'");
			pstmt2.setString(1, thirdPageScoreDTO.getGate_score());
			pstmt2.setString(2, thirdPageScoreDTO.getGate_air());
			pstmt2.setString(3, thirdPageScoreDTO.getGate_year());
			pstmt2.setString(4, thirdPageScoreDTO.getGate_remarks());
			pstmt2.setString(5, thirdPageScoreDTO.getCat_score());
			pstmt2.setString(6, thirdPageScoreDTO.getCat_air());
			pstmt2.setString(7, thirdPageScoreDTO.getCat_year());
			pstmt2.setString(8, thirdPageScoreDTO.getCat_remarks());
			pstmt2.setString(9, thirdPageScoreDTO.getGmat_score());
			pstmt2.setString(10, thirdPageScoreDTO.getGmat_air());
			pstmt2.setString(11, thirdPageScoreDTO.getGmat_year());
			pstmt2.setString(12, thirdPageScoreDTO.getGmat_remarks());
			pstmt2.setString(13, thirdPageScoreDTO.getOther_score());
			pstmt2.setString(14, thirdPageScoreDTO.getOther_air());
			pstmt2.setString(15, thirdPageScoreDTO.getOther_year());
			pstmt2.setString(16, thirdPageScoreDTO.getOther_remarks());
			rs2 = pstmt2.executeUpdate();

			if (rs1 > 0 && rs2 > 0) {
				con.commit();
				result = true;
			} else {
				con.rollback();
			}

		} finally {
			if (pstmt1 != null) {
				pstmt1.close();
			}
			if (pstmt2 != null) {
				pstmt2.close();
			}
			if (con != null) {
				con.close();
			}
		}
		return result;
	}

}

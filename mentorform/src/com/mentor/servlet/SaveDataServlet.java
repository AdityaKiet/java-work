package com.mentor.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mentor.dto.ParentDTO;
import com.mentor.dto.StudentDTO;
import com.mentor.jdbc.JDBC;

public class SaveDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		StudentDTO student = new StudentDTO();
		student.setName(request.getParameter("name").trim());
		student.setDept(request.getParameter("department").trim());
		student.setRoll_no(request.getParameter("rollno").trim());
		student.setEnrollment(request.getParameter("enrollmentno").trim());
		student.setBatch(request.getParameter("batch").trim());
		student.setSection(request.getParameter("section").charAt(0));
		if (request.getParameter("isHosteller") == null) {
			student.setIsHosteller(0);
			student.setNameOfHostel("");
		} else {
			student.setIsHosteller(1);
			student.setNameOfHostel(request.getParameter("hostel"));
		}
		student.setRoomno(request.getParameter("room_no"));
		student.setRoomPartner1(request.getParameter("room_partner1"));
		student.setRoomPartner2(request.getParameter("room_partner2"));
		student.setRoomPartner3(request.getParameter("room_partner3"));
		student.setPhoneno(request.getParameter("phone_no"));
		student.setEmailid(request.getParameter("email_id"));
		student.setAddress(request.getParameter("current_address"));
		ParentDTO parentDTO = new ParentDTO();
		parentDTO.setName(request.getParameter("father_name"));
		parentDTO
				.setQualification(request.getParameter("father_qualification"));
		parentDTO.setProfession(request.getParameter("father_profession"));
		parentDTO.setOccupation(request.getParameter("father_occupation"));
		parentDTO
				.setAnnual_income(request.getParameter("father_annual_income"));
		parentDTO.setAddress(request.getParameter("permanent_address"));
		parentDTO.setPhone_no(request.getParameter("permanent_phoneno"));
		parentDTO.setEmailid(request.getParameter("permanent_email"));
		student.setFather(parentDTO);
		parentDTO = null;
		parentDTO = new ParentDTO();
		parentDTO.setName(request.getParameter("mother_name"));
		parentDTO
				.setQualification(request.getParameter("mother_qualification"));
		parentDTO.setProfession(request.getParameter("mother_profession"));
		parentDTO.setOccupation(request.getParameter("mother_occupation"));
		parentDTO
				.setAnnual_income(request.getParameter("mother_annual_income"));
		parentDTO.setAddress(request.getParameter("contact_address"));
		parentDTO.setPhone_no(request.getParameter("contact_phoneno"));
		parentDTO.setEmailid(request.getParameter("contact_email"));
		student.setMother(parentDTO);
		parentDTO = null;
		parentDTO = new ParentDTO();
		parentDTO.setName(request.getParameter("localguardian_name"));
		parentDTO.setAddress(request.getParameter("localguardian_address"));
		parentDTO.setPhone_no(request.getParameter("localguardian_phoneno"));
		parentDTO.setEmailid(request.getParameter("localguardian_email"));
		student.setLocal_guardian(parentDTO);

		try {
			if (JDBC.saveStudentData(student)) {
				request.setAttribute("message",
						"You have been saved..Please login back");

				RequestDispatcher rd = request
						.getRequestDispatcher("enterrollnumber.jsp");
				rd.forward(request, response);
				return;
			} else {
				request.setAttribute("message", "Error Occured try again !!!");

				RequestDispatcher rd = request
						.getRequestDispatcher("Selectdept");
				rd.forward(request, response);
				return;
			}
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}

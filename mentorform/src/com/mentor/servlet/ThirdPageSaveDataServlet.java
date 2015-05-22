package com.mentor.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mentor.dto.ThirdPageActivityDTO;
import com.mentor.dto.ThirdPageDTO;
import com.mentor.dto.ThirdPageScoreDTO;
import com.mentor.jdbc.JDBC;

/**
 * Servlet implementation class ThirdPageSaveDataServlet
 */
@WebServlet("/ThirdPageSaveDataServlet")
public class ThirdPageSaveDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();

		String roll_no = (String) session.getAttribute("id");
		System.out.println(roll_no);

		ThirdPageDTO thirdPageDTO = new ThirdPageDTO();

		thirdPageDTO.setRoll_no(roll_no);

		ThirdPageActivityDTO thirdPageActivityDTO = new ThirdPageActivityDTO();
		thirdPageActivityDTO.setRoll_no(roll_no);
		thirdPageActivityDTO.setSpecial_courses(request
				.getParameter("special_courses"));
		thirdPageActivityDTO.setTraining(request.getParameter("training"));
		thirdPageActivityDTO.setAchievements(request
				.getParameter("achivements"));
		thirdPageActivityDTO.setAspirations(request
				.getParameter("carrer_aspirations"));
		thirdPageDTO.setThirdPageActivityDTO(thirdPageActivityDTO);

		ThirdPageScoreDTO thirdPageScoreDTO = new ThirdPageScoreDTO();
		thirdPageScoreDTO.setRoll_no(roll_no);
		thirdPageScoreDTO.setGate_score(request.getParameter("gate_score"));
		thirdPageScoreDTO.setGate_air(request.getParameter("gate_air"));
		thirdPageScoreDTO.setGate_year(request.getParameter("gate_year"));
		thirdPageScoreDTO.setGate_remarks(request.getParameter("gate_remarks"));
		thirdPageScoreDTO.setCat_score(request.getParameter("cat_score"));
		thirdPageScoreDTO.setCat_air(request.getParameter("cat_air"));
		thirdPageScoreDTO.setCat_year(request.getParameter("cat_year"));
		thirdPageScoreDTO.setCat_remarks(request.getParameter("cat_remarks"));
		thirdPageScoreDTO.setGmat_score(request.getParameter("gmat_score"));
		thirdPageScoreDTO.setGmat_air(request.getParameter("gmat_air"));
		thirdPageScoreDTO.setGmat_year(request.getParameter("gmat_year"));
		thirdPageScoreDTO.setGmat_remarks(request.getParameter("gmat_remarks"));
		thirdPageScoreDTO.setOther_score(request.getParameter("other_score"));
		thirdPageScoreDTO.setOther_air(request.getParameter("other_air"));
		thirdPageScoreDTO.setOther_year(request.getParameter("other_year"));
		thirdPageScoreDTO.setOther_remarks(request
				.getParameter("other_remarks"));
		thirdPageDTO.setThirdPageScoreDTO(thirdPageScoreDTO);
		System.out.println("Third page DTO is = " + thirdPageDTO);
		try {
			if (JDBC.saveThirdPageStudentData(thirdPageDTO)) {
				request.setAttribute("message", "You have been saved..");

				RequestDispatcher rd = request
						.getRequestDispatcher("thirdPage");
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

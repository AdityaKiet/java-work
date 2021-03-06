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

import com.mentor.dto.AttendenceDTO;
import com.mentor.dto.ExtraActivitiesDTO;
import com.mentor.dto.PercentageDTO;
import com.mentor.dto.SecondPageDTO;
import com.mentor.jdbc.JDBC;

@WebServlet("/secondpageupdate")
public class SecondPageUpdateData extends HttpServlet {
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

		SecondPageDTO secondPageDTO = new SecondPageDTO();

		secondPageDTO.setRoll_no(roll_no);

		AttendenceDTO attendenceDTO = new AttendenceDTO();
		attendenceDTO.setSem1Attendence(request.getParameter("Sem1Attendence"));
		attendenceDTO.setSem2Attendence(request.getParameter("Sem2Attendence"));
		attendenceDTO.setSem3Attendence(request.getParameter("Sem3Attendence"));
		attendenceDTO.setSem4Attendence(request.getParameter("Sem4Attendence"));
		attendenceDTO.setSem5Attendence(request.getParameter("Sem5Attendence"));
		attendenceDTO.setSem6Attendence(request.getParameter("Sem6Attendence"));
		attendenceDTO.setSem7Attendence(request.getParameter("Sem7Attendence"));
		attendenceDTO.setSem8Attendence(request.getParameter("Sem8Attendence"));
		secondPageDTO.setAttendenceDTO(attendenceDTO);

		PercentageDTO percentageDTO = new PercentageDTO();
		percentageDTO.setSem1percent(request.getParameter("Sem1Percentage"));
		percentageDTO.setSem2percent(request.getParameter("Sem2Percentage"));
		percentageDTO.setSem3percent(request.getParameter("Sem3Percentage"));
		percentageDTO.setSem4percent(request.getParameter("Sem4Percentage"));
		percentageDTO.setSem5percent(request.getParameter("Sem5Percentage"));
		percentageDTO.setSem6percent(request.getParameter("Sem6Percentage"));
		percentageDTO.setSem7percent(request.getParameter("Sem7Percentage"));
		percentageDTO.setSem8percent(request.getParameter("Sem8Percentage"));

		percentageDTO.setSem1backs(Integer.parseInt(request
				.getParameter("sem1carryover")));
		percentageDTO.setSem2backs(Integer.parseInt(request
				.getParameter("sem2carryover")));
		percentageDTO.setSem3backs(Integer.parseInt(request
				.getParameter("sem3carryover")));
		percentageDTO.setSem4backs(Integer.parseInt(request
				.getParameter("sem4carryover")));
		percentageDTO.setSem5backs(Integer.parseInt(request
				.getParameter("sem5carryover")));
		percentageDTO.setSem6backs(Integer.parseInt(request
				.getParameter("sem6carryover")));
		percentageDTO.setSem7backs(Integer.parseInt(request
				.getParameter("sem7carryover")));
		percentageDTO.setSem8backs(Integer.parseInt(request
				.getParameter("sem8carryover")));

		percentageDTO.setSem1communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem1")));
		percentageDTO.setSem2communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem2")));
		percentageDTO.setSem3communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem3")));
		percentageDTO.setSem4communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem4")));
		percentageDTO.setSem5communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem5")));
		percentageDTO.setSem6communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem6")));
		percentageDTO.setSem7communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem7")));
		percentageDTO.setSem8communication(Integer.parseInt(request
				.getParameter("commnunicationwithparentssem8")));

		percentageDTO.setSem1responce(Integer.parseInt(request
				.getParameter("responsefromparentssem1")));
		percentageDTO.setSem2responce(Integer.parseInt(request
				.getParameter("responsefromparentssem2")));
		percentageDTO.setSem3responce(Integer.parseInt(request
				.getParameter("responsefromparentssem3")));
		percentageDTO.setSem4responce(Integer.parseInt(request
				.getParameter("responsefromparentssem4")));
		percentageDTO.setSem5responce(Integer.parseInt(request
				.getParameter("responsefromparentssem5")));
		percentageDTO.setSem6responce(Integer.parseInt(request
				.getParameter("responsefromparentssem6")));
		percentageDTO.setSem7responce(Integer.parseInt(request
				.getParameter("responsefromparentssem7")));
		percentageDTO.setSem8responce(Integer.parseInt(request
				.getParameter("responsefromparentssem8")));
		secondPageDTO.setPercentageDTO(percentageDTO);

		ExtraActivitiesDTO extraActivitiesDTO = new ExtraActivitiesDTO();
		extraActivitiesDTO.setExtraActivities(request
				.getParameter("extracarricularactivities"));
		secondPageDTO.setExtraActivitiesDTO(extraActivitiesDTO);

		try {
			if (JDBC.updateSecondPageStudentData(secondPageDTO)) {
				request.setAttribute("message", "You have been saved..");

				RequestDispatcher rd = request.getRequestDispatcher("secondpageservlet");
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

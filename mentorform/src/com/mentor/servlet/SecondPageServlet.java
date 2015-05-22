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

import com.mentor.dto.SecondPageDTO;
import com.mentor.dto.StudentDTO;
import com.mentor.jdbc.JDBC;

@WebServlet("/secondpageservlet")
public class SecondPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SecondPageDTO secondPageDTO;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		StudentDTO studentDTO = new StudentDTO();
		studentDTO = (StudentDTO) session.getAttribute("student");
		request.setAttribute("roll_no", studentDTO.getRoll_no());
		try {
			secondPageDTO = JDBC.getSecondPageData(studentDTO.getRoll_no());
			System.out.println(secondPageDTO);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		if (secondPageDTO == null) {
			RequestDispatcher rd = request
					.getRequestDispatcher("secondpagegetdata.jsp");
			rd.forward(request, response);
		} else {
			System.out.println(request.getAttribute("message"));
			request.setAttribute("message", request.getAttribute("message"));
			request.setAttribute("secondPageDTO", secondPageDTO);
			RequestDispatcher rd = request
					.getRequestDispatcher("secondpageupdate.jsp");
			rd.forward(request, response);
		}
	}

}

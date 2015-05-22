package com.mentor.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mentor.dto.StudentDTO;
import com.mentor.jdbc.JDBC;

public class StudentDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getAttribute("message"));
		try {
			StudentDTO studentDTO = JDBC.getStudentDetails(request
					.getParameter("rollno"));
			if (studentDTO == null) {
				request.setAttribute("message",
						"This Roll no. could not be found !!!");

				RequestDispatcher rd = request
						.getRequestDispatcher("enterrollnumber.jsp");
				rd.forward(request, response);
				return;
			} else {
				request.setAttribute("student", studentDTO);
				request.setAttribute("message", request.getAttribute("message"));
				RequestDispatcher rd = request
						.getRequestDispatcher("displaystudentdetails.jsp");
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

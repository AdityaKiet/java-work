package com.mentor.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mentor.jdbc.JDBC;

public class GetDepartmentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		try {
			System.out.println("We Entered");
			request.setAttribute("branches", JDBC.getBranches());
			request.setAttribute("hostels", JDBC.getHostel());
			request.setAttribute("income", JDBC.getIncomeList());
			if (request.getParameter("message") != null) {
				request.setAttribute("message", request.getParameter("message")
						.trim());
			}
			RequestDispatcher rd = request
					.getRequestDispatcher("studentDetails.jsp");
			rd.forward(request, response);
			return;

		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
	}

}

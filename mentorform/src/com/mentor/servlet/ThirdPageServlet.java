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

import com.mentor.dto.ThirdPageDTO;
import com.mentor.jdbc.JDBC;

@WebServlet("/thirdPage")
public class ThirdPageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ThirdPageDTO thirdPageDTO;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String roll_no = (String) session.getAttribute("id");
		System.out.println(roll_no+request.getParameter("message"));
		request.setAttribute("message", request.getParameter("message"));
		// request.setAttribute("message", "You have been saved..");
		try {
			thirdPageDTO = JDBC.getThirdPageData(roll_no);
			System.out.println(thirdPageDTO);
		} catch (ClassNotFoundException e) {
		} catch (SQLException e) {
		}
		if (thirdPageDTO != null) {
			request.setAttribute("thirdpage", thirdPageDTO);
			RequestDispatcher rd = request
					.getRequestDispatcher("thirdpageupdatedetails.jsp");
			rd.forward(request, response);
			return;
		} else {
			RequestDispatcher rd = request
					.getRequestDispatcher("thirdpagegetdata.jsp");
			rd.forward(request, response);
			return;
		}
		

	}

}

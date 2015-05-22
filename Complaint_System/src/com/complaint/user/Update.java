package com.complaint.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.complaint.dao.ComplaintDAO;

/**
 * Servlet implementation class Update
 */
@WebServlet("/update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("complaint_id"));
		ComplaintDAO complaintDAO = new ComplaintDAO();
		boolean isDone = complaintDAO.deleteComplaint(Integer.parseInt(request
				.getParameter("complaint_id").trim()));
		if (isDone) {
			request.setAttribute("message",
					"Since your problem was solved... It has been deleted!!!");
			RequestDispatcher rd = request.getRequestDispatcher("updatecomplaint");
			rd.forward(request, response);
			return;
		} else {
			request.setAttribute("message",
					"There was some problem .. Please try again later!!!");
			RequestDispatcher rd = request.getRequestDispatcher("updatecomplaint");
			rd.forward(request, response);
			return;
		}
	}

}

package com.complaint.admin;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.complaint.dao.ComplaintDAO;

/**
 * 
 * @author aditya Receives the tyep of complaints and send it to jsp.
 */
@WebServlet("/complaint")
public class GetComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		ComplaintDAO complaintDAO = new ComplaintDAO();
		if (request.getParameter("message") != null) {
			request.setAttribute("message", request.getParameter("message"));
		}
		request.setAttribute("complaint_type",
				complaintDAO.getComplaintCategory());
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
		complaintDAO = null;
		return;
	}

}

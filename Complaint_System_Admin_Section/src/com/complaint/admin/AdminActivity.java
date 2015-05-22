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
 * Servlet implementation class AddCategory
 */
@WebServlet("/adminCategory")
public class AdminActivity extends HttpServlet {
	ComplaintDAO complaintDAO;
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		complaintDAO = new ComplaintDAO();
		boolean isDone;
		switch (request.getParameter("button").toString().trim()) {

		case "Add Category":
			isDone = complaintDAO.addComplaintCategory(request
					.getParameter("category_name").toString().trim());
			if (isDone) {
				request.setAttribute("message", "Cateogory "
						+ request.getParameter("category_name").toString()
								.trim() + " has been added..");
				RequestDispatcher rd = request
						.getRequestDispatcher("complaint");
				rd.forward(request, response);
			} else {
				request.setAttribute("message", "Cateogory "
						+ request.getParameter("category_name").toString()
								.trim()
						+ " has not been added..Please try again later..");
				RequestDispatcher rd = request
						.getRequestDispatcher("complaint");
				rd.forward(request, response);
				return;
			}
			break;
		case "Get Complaints":
			request.setAttribute("complaints", complaintDAO
					.getAllComplaintOnCategroy(request
							.getParameter("department")));
			RequestDispatcher rd = request
					.getRequestDispatcher("complaints_category.jsp");
			rd.forward(request, response);
			return;

		case "All Complaints":
			request.setAttribute("complaints", complaintDAO.getAllComplaint());
			RequestDispatcher rd1 = request
					.getRequestDispatcher("allcomplaints.jsp");
			rd1.forward(request, response);
			return;
		}
	}
}

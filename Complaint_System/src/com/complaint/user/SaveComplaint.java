package com.complaint.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.complaint.dao.ComplaintDAO;
import com.complaint.dto.Complaint;

/**
 * 
 * @author aditya Saves the complaint to database.
 *
 */
@WebServlet("/savecomplaint")
public class SaveComplaint extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * 
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		boolean isSaved;
		Complaint complaint = new Complaint();
		complaint.setComplaint(request.getParameter("complaint"));
		complaint.setComplaint_category(request.getParameter("department"));
		complaint.setIs_solved(false);
		complaint.setStudent_name(request.getParameter("name"));
		complaint.setStudent_roll_no(request.getParameter("roll_no"));
		ComplaintDAO complaintDAO = new ComplaintDAO();
		isSaved = complaintDAO.saveComplaint(complaint);
		if (isSaved) {
			request.setAttribute("message", "Complaint has been saved !!!");
			RequestDispatcher rd = request
					.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			return;
		} else {
			request.setAttribute("message",
					"Complaint could not be saved !!!");
			RequestDispatcher rd = request
					.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			return;
		}
	}

}

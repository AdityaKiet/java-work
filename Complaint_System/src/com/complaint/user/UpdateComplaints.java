package com.complaint.user;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.complaint.dao.ComplaintDAO;
import com.complaint.dto.Complaint;

/**
 * 
 * @author aditya
 *
 */
@WebServlet("/updatecomplaint")
public class UpdateComplaints extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		System.out.println(request.getParameter("roll_no"));
		String roll_no;

		if (session.getAttribute("roll_no") == null) {
			session.setAttribute("roll_no", request.getParameter("roll_no"));
			roll_no = request.getParameter("roll_no");
		} else {
			roll_no = (String) session.getAttribute("roll_no");
		}
		ComplaintDAO complaintDAO = new ComplaintDAO();
		List<Complaint> complaints = complaintDAO.getComplaint(roll_no);
		if (complaints.size() == 0) {
			request.setAttribute("message",
					"None of your previous complaints are found!!!");
			RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
			rd.forward(request, response);
			return;
		} else {
			request.setAttribute("message", request.getAttribute("message"));
			request.setAttribute("complaints", complaints);
			RequestDispatcher rd = request
					.getRequestDispatcher("updatecomplaints.jsp");
			rd.forward(request, response);
			return;
		}
	}

}

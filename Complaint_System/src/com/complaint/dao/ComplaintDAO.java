package com.complaint.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.complaint.dto.Complaint;
import com.complaint.dto.Complaint_Category;

/**
 * 
 * @author aditya DAO class to perform CRUD operations on database using
 *         hibernate.
 */
public class ComplaintDAO {
	@SuppressWarnings("deprecation")
	SessionFactory sessionFactory = new Configuration().configure()
			.buildSessionFactory();

	/**
	 * Takes all the type of complaints from database and sends it to jsp.
	 * 
	 * @return Complaint List
	 */
	@SuppressWarnings("unchecked")
	public List<Complaint_Category> getComplaintCategory() {
		List<Complaint_Category> category = new ArrayList<Complaint_Category>();

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		Query query = session.createQuery("from Complaint_Category");
		category = query.list();
		trans.commit();
		session.close();
		return category;
	}

	@SuppressWarnings("unchecked")
	public List<Complaint> getComplaint(String roll_no) {
		List<Complaint> complaints = new ArrayList<Complaint>();

		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		String queryString = "from Complaint where student_roll_no = :roll_no";
		Query query = session.createQuery(queryString);
		query.setString("roll_no", roll_no);
		complaints = query.list();
		trans.commit();
		session.close();
		return complaints;
	}

	public boolean saveComplaint(Complaint complaint) {
		boolean isSaved = false;
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		if (session.save(complaint) != null) {
			isSaved = true;
		}
		trans.commit();
		System.out.println("Record Added...");
		session.close();
		return isSaved;
	}

	public boolean deleteComplaint(int complaint_id) {
		boolean result = false;
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		Complaint empObject = (Complaint) session.get(Complaint.class,
				complaint_id);
		if (empObject == null) {

		} else {
			session.delete(empObject);
			result = true;
		}

		trans.commit();

		session.close();

		return result;
	}
}

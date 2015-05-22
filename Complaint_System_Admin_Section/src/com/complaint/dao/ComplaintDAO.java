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
	public List<Complaint> getAllComplaint() {
		List<Complaint> complaints = new ArrayList<Complaint>();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		String queryString = "from Complaint where is_solved = false";
		Query query = session.createQuery(queryString);
		complaints = query.list();
		trans.commit();
		session.close();
		return complaints;
	}
	
	@SuppressWarnings("unchecked")
	public List<Complaint> getAllComplaintOnCategroy(String category) {
		List<Complaint> complaints = new ArrayList<Complaint>();
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		String queryString = "from Complaint where complaint_category = :complaint_category and is_solved = false";
		Query query = session.createQuery(queryString);
		query.setString("complaint_category", category);
		complaints = query.list();
		trans.commit();
		session.close();
		return complaints;
	}
	
	public boolean addComplaintCategory(String complaint_type) {
		boolean isSaved = false;
		Complaint_Category complaint_Category = new Complaint_Category();
		complaint_Category.setComplaint_type(complaint_type);
		Session session = sessionFactory.openSession();
		Transaction trans = session.beginTransaction();
		if (session.save(complaint_Category) != null) {
			isSaved = true;
		}
		trans.commit();
		System.out.println("Category Added...");
		session.close();
		return isSaved;
	}

}

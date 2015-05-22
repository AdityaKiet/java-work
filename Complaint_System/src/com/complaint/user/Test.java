package com.complaint.user;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.complaint.dto.Complaint;

public class Test {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");// populates the data of the
											// configuration file

		// creating seession factory object
		@SuppressWarnings("deprecation")
		SessionFactory factory = cfg.buildSessionFactory();

		// creating session object
		Session session = factory.openSession();

		// creating transaction object
		Transaction t = session.beginTransaction();
		@SuppressWarnings("unused")
		Complaint ram = new Complaint();

		t.commit();// transaction is committed
		session.close();

		System.out.println("successfully saved");

	}
}

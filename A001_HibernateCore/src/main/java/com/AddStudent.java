package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
   


public class AddStudent {
	public static void main(String[] args) {
		
		
		Student st = new Student();
		st.setName("Harshani");
		st.setEmail("harshani@gmail.com");
		
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session s  = sf.openSession();
		Transaction tx = s.beginTransaction();
		s.saveOrUpdate(st);
		
		tx.commit();
		
		
		
		
		
	}
}

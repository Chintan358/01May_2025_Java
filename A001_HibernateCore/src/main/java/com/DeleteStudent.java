package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
   


public class DeleteStudent {
	public static void main(String[] args) {
		
	
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session s  = sf.openSession();
		Transaction tx = s.beginTransaction();
	
		Student st =  s.load(Student.class, 2); 

		s.delete(st);
		
		tx.commit();
		

	}
}

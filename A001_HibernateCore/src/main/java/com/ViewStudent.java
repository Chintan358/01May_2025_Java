package com;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
   


public class ViewStudent {
	public static void main(String[] args) {
		
	
		
		
		Configuration cfg = new Configuration();
		cfg = cfg.configure("hibernate.cfg.xml");
		cfg = cfg.addAnnotatedClass(Student.class);
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session s  = sf.openSession();
		Transaction tx = s.beginTransaction();
		
//		Student st =  s.load(Student.class, 25); //exception
//		Student st =  s.get(Student.class, 25);  //null
		
//		System.out.println(st);
//		System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
		
		List<Student> allstudent =  s.createQuery("from Student").list();
		
		for(Student st  :allstudent)
		{
			System.out.println(st.getId()+" "+st.getName()+" "+st.getEmail());
		}
	}
}

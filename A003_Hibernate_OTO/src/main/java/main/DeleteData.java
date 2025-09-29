package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;

public class DeleteData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Passport.class)
				.buildSessionFactory();
		
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Person p = session.load(Person.class, 1);
		session.delete(p);
		
		
		
		tx.commit();
		
		
	}
}

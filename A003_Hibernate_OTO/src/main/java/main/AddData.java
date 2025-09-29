package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;

public class AddData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Passport.class)
				.buildSessionFactory();
		
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		
		Passport p1 = new Passport();
		p1.setPassport_number("456454df4564564");	
		
		Person p = new Person();
		p.setName("Kanha");
		p.setEmail("kanha@gmail.com");
		p.setPassport(p1);
		
		
		
		session.save(p);		
		
		tx.commit();
		
		
	}
}

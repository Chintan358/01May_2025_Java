package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Passport;
import model.Person;

public class ViewData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Person.class)
				.addAnnotatedClass(Passport.class)
				.buildSessionFactory();
		
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
	
		List<Person> persons = session.createQuery("from Person").list();
		for(Person p: persons)
		{
			System.out.println(p.getId()+" "+p.getName()+" "+p.getEmail()+" "+p.getPassport().getPassport_number());
		}
			
	
		
		
	}
}

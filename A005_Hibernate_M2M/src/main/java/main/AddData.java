package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Actors;
import model.Movie;

public class AddData {
	public static void main(String[] args) {
		
		
		SessionFactory sf  =
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Actors.class)
				.addAnnotatedClass(Movie.class)
				.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		
		
//		Movie m1 = new Movie();
//		m1.setName("Housefull");
//		
//		Movie m2 = new Movie();
//		m2.setName("RR");
//		
//		Movie m3 = new Movie();
//		m3.setName("Heraferi");
//		
//		Actors a1 = new Actors();
//		a1.setName("Akshay kumar");
//		a1.addMovie(m1);
//		a1.addMovie(m2);
//		a1.addMovie(m3);
//		
//		
//		s.save(a1);
//		s.save(m1);
//		s.save(m2);
//		s.save(m3);
		
		Actors a1 = new Actors();
		a1.setName("Ajay dewgan");
		
		Actors a2 = new Actors();
		a2.setName("Tushar kapoor");
		
		Actors a3 = new Actors();
		a3.setName("Arshad warsi");
		
		
		Movie m1 = new Movie();
		m1.setName("Golmal");
		m1.addActor(a1);
		m1.addActor(a2);
		m1.addActor(a3);
		
		s.save(m1);
		s.save(a1);
		s.save(a2);
		s.save(a3);
		
		
		tx.commit();
		
		
	}
}

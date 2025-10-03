package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Actors;
import model.Movie;

public class DeleteData {
	public static void main(String[] args) {
		
		
		SessionFactory sf  =
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Actors.class)
				.addAnnotatedClass(Movie.class)
				.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		
		Actors a  =s.load(Actors.class, 1);
		s.delete(a);
		
		
		
		tx.commit();
		
		
	}
}

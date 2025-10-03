package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Actors;
import model.Movie;

public class ViewData {
	public static void main(String[] args) {
		
		
		SessionFactory sf  =
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Actors.class)
				.addAnnotatedClass(Movie.class)
				.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		List<Actors> actors = s.createQuery("from Actors").list();
		
		for(Actors a  :actors)
		{
			System.out.println(a.getId()+" "+a.getName());
			for(Movie m : a.getMovies()) {
				System.out.println(m.getId()+" "+m.getName());
			}
		}
		

		
		
	}
}

package main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class ViewData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
		
		List<Category> cat = s.createQuery("from Category").list();
		for(Category c  :cat)
		{
			System.out.println("****************");
			System.out.println(c.getId()+" "+c.getName());
			for(Product p : c.getProducts())
			{
				System.out.println(p.getId()+" "+p.getName()+" "+p.getPrice());
			}
		}
		
		
		
		
		
	}
}

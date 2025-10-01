package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.Category;
import model.Product;

public class AddData {
	public static void main(String[] args) {
		
		
		SessionFactory sf = 
				new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Category.class)
				.addAnnotatedClass(Product.class)
				.buildSessionFactory();
		
		Session s = sf.openSession();
		Transaction tx  =s.beginTransaction();
		
//		
//		Category c = new Category();
//		c.setName("Cloths");
//		
//		Product p1 = new Product();
//		p1.setName("Tshirt");
//		p1.setPrice(5000);
//		p1.setCategory(c);
//		
//		
//		Product p2 = new Product();
//		p2.setName("Shirt");
//		p2.setPrice(50000);
//		p2.setCategory(c);
		

		Category c = s.load(Category.class, 1);
		c.setName("Sports");
		
		Product p1 = new Product();
		p1.setName("Bat");
		p1.setPrice(5000);
		p1.setCategory(c);
		
		
		Product p2 = new Product();
		p2.setName("Ball");
		p2.setPrice(50000);
		p2.setCategory(c);
		
		
		s.saveOrUpdate(c);
		s.saveOrUpdate(p1);
		s.saveOrUpdate(p2);
		
		
		tx.commit();
		
		
	}
}

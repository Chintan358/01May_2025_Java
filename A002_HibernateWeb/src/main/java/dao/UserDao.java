package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import model.User;

public class UserDao {
		
	SessionFactory sf=null;
	public UserDao() {
		
		         sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(User.class)
				.buildSessionFactory();	
	}
	
	public int addUser(User user)
	{
		int i=0;
		try {
			
			Session s  =sf.openSession();
			Transaction tx  =s.beginTransaction();
			s.saveOrUpdate(user);
			tx.commit();
			i=1;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return i;
	}
}

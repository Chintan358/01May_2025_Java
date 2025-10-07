package model;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Student st = context.getBean("std",Student.class);
		st.display();
		
		
	}
}	

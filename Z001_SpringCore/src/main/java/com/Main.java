package com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationcontext2.xml");
		
		Emp e = context.getBean("emp",Emp.class);
		e.display();
		
		
	}
}

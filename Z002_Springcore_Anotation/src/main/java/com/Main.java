package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		
		ApplicationContext cx = 
				new AnnotationConfigApplicationContext(App.class);
		
		
		Sports c = cx.getBean("cri",Sports.class);
		c.players();
		
		Cricket c1  =new Cricket();
		
		
//		Sports k = cx.getBean("kabbaddi",Sports.class);
//		k.players();
		
		
		
	}
}

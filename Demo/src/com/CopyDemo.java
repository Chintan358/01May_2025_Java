package com;

import java.util.ArrayList;

class Car
{
	String name;
	ArrayList<String> colors;
	public Car(String name, ArrayList<String> colors) {
		super();
		this.name = name;
		this.colors = colors;
	}
	
	
}

public class CopyDemo {

	public static void main(String[] args) {
		
		ArrayList<String> colors = new ArrayList<>();
		colors.add("RED");
		colors.add("WHITE");
		Car c = new Car("Honda", colors);
		
		
//		for(String s : c.colors) {
//			System.out.println(s);
//		}
		
		
//		//shallow
//		Car scopy = c;
//		scopy.colors.add("GREEN");
//		
//		System.out.println("Shallo copy");
//		for(String s : scopy.colors) {
//			System.out.println(s);
//		}
//		
//		System.out.println("ORIGINAL");
//		for(String s : c.colors) {
//			System.out.println(s);
//		}
		
		
		Car dcopy = new Car(c.name, new ArrayList<>(c.colors));
		
		dcopy.colors.add("Black");
		
		System.out.println("Deep copy");
		for(String s : dcopy.colors) {
			System.out.println(s);
		}
		
		
		
		System.out.println("***********");
		System.out.println("ORIGINAL");
		for(String s : c.colors) {
			System.out.println(s);
		}
		
		
	}
	
		
	

}

package com;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test {
	
	public static int square(int a)
	{
		return a*a;
	}
	
	public static boolean oddCheck(int a)
	{
		if(a%2!=0)
		{
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
//		ArrayList<Integer> al = new ArrayList<>();
//		al.add(10);
//		al.add(2);
//		al.add(45);
//		al.add(32);
//		al.add(46);
//		al.add(85);
		
		
//		List<Integer> k =  al.stream().map(ele->square(ele)).collect(Collectors.toList());
//		System.out.println(k);
//		
//		List<Integer> k =  al.stream().filter(ele->oddCheck(ele)).collect(Collectors.toList());
//		System.out.println(k);
		
//		
//		List<String> subjects = Arrays.asList("Java","Php","Android","Node");
//		
//		List<Integer> total = subjects.stream().map(ele->ele.length()).collect(Collectors.toList());
//		System.out.println(total);
//		
//		
//		List<String> s = subjects.stream().filter(ele->ele.toLowerCase().contains("a")).collect(Collectors.toList());
//		System.out.println(s);
		
		
		List<Integer> al = Arrays.asList(10,25,4,12,49,9,64,32,45);
		
		List<Integer> k = al.stream().filter(ele->(Math.sqrt(ele)==(int)Math.sqrt(ele))).collect(Collectors.toList());
		System.out.println(k);
		
		

		
		
		
		
		
	}
}

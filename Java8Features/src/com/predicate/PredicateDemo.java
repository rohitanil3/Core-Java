package com.predicate;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p= (i)->(i>20);
		System.out.println(p.test(10));
		System.out.println(p.test(21));
		
		Predicate<String> s= (arg)->(arg.length()>2);
				
		
		System.out.println(s.test("Rohit"));
		System.out.println(s.test("m"));

		
	}

}

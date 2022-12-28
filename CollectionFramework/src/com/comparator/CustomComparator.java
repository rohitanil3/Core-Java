package com.comparator;

import java.util.TreeSet;

public class CustomComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Employee> ts=new TreeSet<>(new EmpComparator());
		ts.add(new Employee(1, "ROhit", "K"));
		ts.add(new Employee(3, "sOhit", "K"));
		ts.add(new Employee(2, "MOhit", "K"));
		
		System.out.println(ts);


	}

}

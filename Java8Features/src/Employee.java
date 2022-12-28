package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class Employee {
	
	int id;
	String name;
	int sal;
	String country;
	
	
	
	
	
	


	public Employee(int id, String name, int sal, String country) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.country = country;
	}








	public int getId() {
		return id;
	}








	public void setId(int id) {
		this.id = id;
	}








	public String getName() {
		return name;
	}








	public void setName(String name) {
		this.name = name;
	}








	public int getSal() {
		return sal;
	}








	public void setSal(int sal) {
		this.sal = sal;
	}








	public String getCountry() {
		return country;
	}








	public void setCountry(String country) {
		this.country = country;
	}








	public static void main(String[] args) {
		
		
	ArrayList<Employee> al=new ArrayList<>();
	al.add(new Employee(1, "Rk", 100000, "US"));
	al.add(new Employee(2, "Rock", 10000, "India"));
	al.add(new Employee(3, "Brock", 1000, "Pak"));
	al.add(new Employee(4, "Vidyut", 100, "India"));
	al.add(new Employee(5, "Rk", 100000, "US"));
	al.add(new Employee(6, "shyam", 10000, "India"));
	al.add(new Employee(7, "rick", 1000, "Norway"));
	al.add(new Employee(8, "steve", 100, "Brazil"));
	
	System.out.println(al.stream().collect(Collectors.partitioningBy(Employee e->e.country.equalsIgnoreCase("US"))));

		
	}

}

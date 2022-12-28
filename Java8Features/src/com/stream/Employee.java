package com.stream;

import java.util.ArrayList;

enum Address{
	
	BANGALORE,
	PUNE,
	MYSURU,
	VELLORE,
	CHITTUR
}

public class Employee {
	
	int id;
	String name;
	Address address;
	
	
	
	
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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




	public Address getAddress() {
		return address;
	}




	public void setAddress(Address address) {
		this.address = address;
	}




	public static void main(String[] args) {
		
		
		ArrayList<Employee> al=new ArrayList<>();
		al.add(new Employee(1, "Rohit", Address.BANGALORE));
		al.add(new Employee(2, "Mohit", Address.PUNE));
		al.add(new Employee(3, "Suchit", Address.MYSURU));
		al.add(new Employee(4, "Vidyut", Address.VELLORE));

		
		al.stream().filter(s->s.getAddress()==Address.BANGALORE && s.getId()==1).map(s->s.getName().toUpperCase()).sorted().forEach(s->System.out.println("name is "+s));
	}

}

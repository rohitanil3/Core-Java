package com.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


public class SecondHighest {
	
	int id;
	String name;
	int sal;
	
	
	
	
	public SecondHighest(int id, String name, int sal, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.address = address;
	}




	public int getSal() {
		return sal;
	}




	public void setSal(int sal) {
		this.sal = sal;
	}




	Address address;
	
	
	
	

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
		
		
	ArrayList<SecondHighest> al=new ArrayList<>();
	al.add(new SecondHighest(1, "Rk", 100000, Address.BANGALORE));
	al.add(new SecondHighest(1, "Rk", 10000, Address.BANGALORE));
	al.add(new SecondHighest(1, "Rk", 1000, Address.BANGALORE));
	al.add(new SecondHighest(1, "Rk", 100, Address.BANGALORE));
	
	Comparator<SecondHighest> c=(i1,i2)->i2.getSal()-i1.getSal();
     
	Optional<SecondHighest> findFirst = al.stream().sorted(c).skip(1).findFirst();
	System.out.println(findFirst.get().getSal());
	 Optional<SecondHighest> findFirst2 = al.stream().sorted((i1,i2)->-i1.getSal()-i2.getSal()).skip(1).findFirst();
	 System.out.println(findFirst2.get().getSal());

		
	}

}

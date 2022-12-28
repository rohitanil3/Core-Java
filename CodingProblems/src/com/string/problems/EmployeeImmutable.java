package com.string.problems;

import java.util.ArrayList;
import java.util.List;

public final class EmployeeImmutable {
	
	private final int id;
	
	private final String name;
	
	private final String last_name;
	
	private final List<String> mobnos;
	
	

	public EmployeeImmutable(int id, String name, String last_name, List<String> mobnos) {
		super();
		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.mobnos = mobnos;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getLast_name() {
		return last_name;
	}

	public List<String> getMobnos() {
		List<String> temp=new ArrayList<String>();
		for (String string : mobnos) {
			temp.add(string);
			
		}
		return temp;
	}

	@Override
	public String toString() {
		return "EmployeeImmutable [id=" + id + ", name=" + name + ", last_name=" + last_name + ", mobnos=" + mobnos
				+ "]";
	}
	
	
	

}

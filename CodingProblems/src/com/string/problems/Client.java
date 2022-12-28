package com.string.problems;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<String> monos=new ArrayList<>();
		monos.add("Airtel");
		monos.add("Idea");
		monos.add("Jio");
		
		EmployeeImmutable employeeImmutable=new EmployeeImmutable(1, "Rohit", "Karambali", monos);
		System.out.println(employeeImmutable.getName());
		System.out.println(employeeImmutable.getMobnos());
		employeeImmutable.getMobnos().add("Vodafone");
		System.out.println("After alter "+employeeImmutable.getMobnos());
		
	}

}

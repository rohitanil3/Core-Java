package com.rank.salary;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> empList=new ArrayList<>();
		empList.add(new Employee("ROhit", "Senior Software Engineer", 80000, 1));
		empList.add(new Employee("Vidyut", "Senior Software Engineer", 40000, 2));
		empList.add(new Employee("Samar", "Senior Software Engineer", 170000, 3));
		empList.add(new Employee("Piter", "Senior Software Engineer", 7000, 4));
		empList.add(new Employee("Piter", "Senior Software Engineer", 9000, 5));
		empList.add(new Employee("Piter", "Senior Software Engineer", 10000, 10));


		Comparator<Employee> c=(i1,i2)->(i2.getSalary()-i1.getSalary());
		
		//third highest salary
	 Employee employee = empList.stream().sorted(c).skip(2).findFirst().get();
		System.out.println(employee.getSalary());

	}

}

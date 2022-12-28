package com.rank.salary;

public class Employee {
	
	String name,designation;
	int salary,empid;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public Employee(String name, String designation, int salary, int empid) {
		super();
		this.name = name;
		this.designation = designation;
		this.salary = salary;
		this.empid = empid;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", designation=" + designation + ", salary=" + salary + ", empid=" + empid
				+ "]";
	}
	
	

}

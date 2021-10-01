package com.simplilearn.datastructure.linkedlist;

public class Employee {
	
	//properties
	public int id;
	public String name;
	public String dept;
	public double salary;
	
	// Constructor
	public Employee() {}
	// Parameterized constructor
	public Employee(int id, String name, String dept, double salary) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	// Override toString()
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
}	

package com.simplilearn.collections.set.employee;

import java.util.LinkedHashSet;
import java.util.Set;

public class EmployeeSet {

	public static void main(String[] args) {

		// create employee
		Employee employee1 = new Employee(1001, "John Smith", "Engieering", 23987634.34);
		Employee employee2 = new Employee(1002, "Ava Junier", "Engieering", 123987634.34);
		Employee employee3 = new Employee(1003, "Tony Stark", "Entertainment", 34987634.34);
		Employee employee4 = new Employee(1004, "Marry Joe", "HR", 987634.34);
		Employee employee5 = new Employee(1005, "Angelina jolie", "Entertainment", 78987634.34);

		//create a set 
		Set<Employee> employeeSet = new LinkedHashSet<Employee>();
		
		// add employee into set
		employeeSet.add(employee1);
		employeeSet.add(employee2);
		employeeSet.add(employee3);
		employeeSet.add(employee4);
		
		//print each emp
		for(Employee emp : employeeSet) {
			System.out.println("----------------");
//			 System.out.println(emp);
			 System.out.println(emp.id);
			 System.out.println(emp.name);
			 System.out.println(emp.dept);
			 System.out.println(emp.salary);
		}
		
		
	}

}

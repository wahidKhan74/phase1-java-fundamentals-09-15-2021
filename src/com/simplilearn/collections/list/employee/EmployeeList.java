package com.simplilearn.collections.list.employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {

		// create employee
		Employee employee1 = new Employee(1001, "John Smith", "Engieering", 23987634.34);
		Employee employee2 = new Employee(1002, "Ava Junier", "Engieering", 123987634.34);
		Employee employee3 = new Employee(1003, "Tony Stark", "Entertainment", 34987634.34);
		Employee employee4 = new Employee(1004, "Marry Joe", "HR", 987634.34);
		Employee employee5 = new Employee(1005, "Angelina jolie", "Entertainment", 78987634.34);

		// create employee list
		List<Employee> listOfEmployees = new ArrayList<Employee>();

		// add employee
		listOfEmployees.add(employee1);
		listOfEmployees.add(employee2);
		listOfEmployees.add(employee3);

		// print employee list
		System.out.println(listOfEmployees);

		// insert employee at index 0
		listOfEmployees.add(0, employee4);

		// access employee with index 0
		System.out.println("The 0 index emeployee " + listOfEmployees.get(0));

		// replace
		listOfEmployees.set(1, employee5);
		System.out.println(listOfEmployees);

		// iterate
		for (Employee emp : listOfEmployees) {
			System.out.println("--------------------");
			// System.out.println(emp);
			System.out.println(emp.id);
			System.out.println(emp.name);
			System.out.println(emp.salary);
			System.out.println(emp.dept);
		}

	}

}

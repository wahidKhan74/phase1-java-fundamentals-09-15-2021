package com.simplilearn.datastructure.linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {

		// create employee
		Employee employee1 = new Employee(1001, "John Smith", "Engieering", 23987634.34);
		Employee employee2 = new Employee(1002, "Ava Junier", "Engieering", 123987634.34);
		Employee employee3 = new Employee(1003, "Tony Stark", "Entertainment", 34987634.34);
		Employee employee4 = new Employee(1004, "Marry Joe", "HR", 987634.34);
		Employee employee5 = new Employee(1005, "Angelina jolie", "Entertainment", 78987634.34);

		//create a linked list 
		LinkedList<Employee> emplist = new LinkedList<Employee>();
		
		emplist.add(employee1);
		emplist.add(employee2);
		emplist.add(employee3);
		
		emplist.addFirst(employee4); //head
		emplist.addLast(employee5);  //tail
		
		for(Employee emp : emplist) {
			System.out.println(emp);
		}
		
	}

}

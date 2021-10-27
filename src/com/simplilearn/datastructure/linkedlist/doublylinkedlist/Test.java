package com.simplilearn.datastructure.linkedlist.doublylinkedlist;


public class Test {
	
	public static void main(String[] args) {
		
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		// create doubly linked list
		DoublyLinkedList dList = new DoublyLinkedList();
		
		System.out.println("List is empty : "+dList.isEmpty());
		System.out.println("List size : "+dList.size());
		
		System.out.println("----------------");
		dList.addToFront(employee1);
		dList.addToFront(employee2);
		dList.addToFront(employee3);
		
		System.out.println("List is empty : "+dList.isEmpty());
		System.out.println("List size : "+dList.size());
		
		dList.addToEnd(employee4);
		dList.addToEnd(employee5);
		
		System.out.println("----------------");
		Node reNode= dList.removeFromFront();
		System.out.println("Removed First Node :"+reNode);
		
		System.out.println("----------------");
		Node laNode= dList.removeFromEnd();
		System.out.println("Removed Last Node :"+laNode);
		
		System.out.println("----------------");
		
		dList.printList();
	}
}

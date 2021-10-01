package com.simplilearn.datastructure.linkedlist.singlylinkedlist;

public class Test {

	public static void main(String[] args) {
		// create employees
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		// create singly linked list
		SinglyLinkedList sList = new SinglyLinkedList();
		
		System.out.println("List is empty : "+sList.isEmpty());
		System.out.println("List size : "+sList.size());

		sList.add(employee1);
		sList.add(employee2);
		sList.add(employee3);
		System.out.println("----------------");
		System.out.println("List is empty : "+sList.isEmpty());
		System.out.println("List size : "+sList.size());
		
		sList.add(employee4);
		sList.add(employee5);  //head
		System.out.println("----------------");
		sList.printList();
		
		Node removedNode = sList.remove();
		System.out.println("Removed Node : "+removedNode);
	}

}

package com.simplilearn.datastructure.linkedlist.circularlinkedlist;

public class Test {

	public static void main(String[] args) {

		// create employees
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);
		
		// create a circular linked list
		CircularLinkedList clist = new CircularLinkedList();
		
		System.out.println("List is empty : "+clist.isEmpty());
		System.out.println("List size : "+clist.size());
		
		clist.add(employee1);
		clist.add(employee2);
		clist.add(employee3);
		
		System.out.println("-----------------------");
		System.out.println("List is empty : "+clist.isEmpty());
		System.out.println("List size : "+clist.size());
		
		System.out.println("-----------------------");
		clist.printList();

		System.out.println("-----------------------");
		Node removedNode = clist.remove();
		System.out.println("Removed Node : "+removedNode);
		
		System.out.println("-----------------------");
		clist.printList();
	}

}

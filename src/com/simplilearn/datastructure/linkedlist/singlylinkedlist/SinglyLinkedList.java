package com.simplilearn.datastructure.linkedlist.singlylinkedlist;

public class SinglyLinkedList {

	private Node head;
	private int size;
	
	// linked operations
	// size
	public int size() {
		return size;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return head==null;
	}
	
	// add element
	public void add(Employee data) {
		// create node
		Node  node = new Node(data);
		//set next node value previous head
		node.setNext(head);
		// set head as new node
		head = node;
		size++;
	}
	
	// remove 
	public Node remove() {
		if(isEmpty()) {
			return null;
		}
		// removed node
		Node  removedNnode = head;
		//set next node value as head
		head= head.getNext();
		size--;
		// nullify the moved  node
		removedNnode.setNext(null);
		return removedNnode;
	}
	
	// print list
	public void printList() {
		Node current = head;
		System.out.println(" Head =>");
		while(current != null) {
			System.out.println(current.getData());
			System.out.println("=>");
			current = current.getNext();
		}
		System.out.println("Null");
	}
}

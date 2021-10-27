package com.simplilearn.datastructure.linkedlist.circularlinkedlist;

public class Node {
		
	private Employee data;
	private Node next;
	
	// create a node
	public Node(Employee data) {
		this.data = data;
	}

	// set & get methods
	public Employee getData() {
		return data;
	}

	public void setData(Employee data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	
}

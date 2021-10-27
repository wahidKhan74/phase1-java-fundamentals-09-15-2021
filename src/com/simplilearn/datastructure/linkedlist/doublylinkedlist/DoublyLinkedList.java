package com.simplilearn.datastructure.linkedlist.doublylinkedlist;

public class DoublyLinkedList {

	// head, tail, size
	private Node head;
	private Node tail;
	private int size;

	// size
	public int size() {
		return size;
	}

	// isEmpty
	public boolean isEmpty() {
		return head == null;
	}

	// add element to front
	public void addToFront(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list empty head and tail are same
		if (isEmpty()) {
			tail = node;
		} else {
			head.setPrevious(node);
			node.setNext(head);
		}
		// new node as head
		head = node;
		size++;
	}

	// add element to end
	public void addToEnd(Employee data) {
		// create a node
		Node node = new Node(data);
		// if list empty head and tail are same
		if (isEmpty()) {
			head = node;
		} else {
			tail.setNext(node);
			node.setPrevious(tail);
		}
		// new node as head
		tail = node;
		size++;
	}

	// remove element from front
	public Node removeFromFront() {
		// if list empty return null
		if (isEmpty()) {
			return null;
		}
		Node removedNode = head;
		// only one element
		if (head.getNext() == null) {
			tail = null;
		} else {
			head.getNext().setPrevious(null);
		}
		// next node as head
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}

	// remove element from end
	public Node removeFromEnd() {
		// if list empty return null
		if (isEmpty()) {
			return null;
		}
		Node removedNode = tail;
		// only one element
		if (tail.getPrevious() == null) {
			head = null;
		} else {
			tail.getPrevious().setNext(null);
		}
		// next node as tail
		tail = tail.getPrevious();
		size--;
		removedNode.setPrevious(null);
		return removedNode;
	}

	// print list
	public void printList() {
		Node current = head;
		System.out.println(" Head =>");
		while (current != null) {
			System.out.println(current.getData());
			System.out.println("< = >");
			current = current.getNext();
		}
		System.out.println("<= Tail");
	}
}

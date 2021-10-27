package com.simplilearn.datastructure.linkedlist.circularlinkedlist;


public class CircularLinkedList {

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

	// add element
	public void add(Employee data) {
		// create node
		Node node = new Node(data);
		// if list is empty
		if (isEmpty()) {
			head = node;
			tail = node;
		} else {
			tail.setNext(node);
		}
		// set tail as new node
		tail = node;
		// for circular linked list -> tail next should be head
		tail.setNext(head);
		size++;
	}

	// remove
	public Node remove() {
		// verfiy linked list empty
		if (isEmpty()) {
			return null;
		}
		// removed node
		Node removedNnode = head;
		// set next node value as head
		head = head.getNext();
		size--;
		// nullify the moved node
		removedNnode.setNext(null);
		// change tail to new node or circular linked list
		tail.setNext(head);
		return removedNnode;
	}

	// print list
	public void printList() {
		Node current = head;		
		if(current ==null) {
			System.out.println("Circular Linked is empty !");
		} else {
			System.out.println(" Head =>");
			do {
				if(current!=null) {
					System.out.println(current.getData());
					System.out.println("=>");
					current = current.getNext();
				}
			}while (current != head);
		}
		
	}
}

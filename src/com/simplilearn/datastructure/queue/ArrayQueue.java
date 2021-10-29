package com.simplilearn.datastructure.queue;

public class ArrayQueue {
	
	private Employee[] queue;
	private int front;
	private int rear;
	
	// create array queue
	public ArrayQueue(int capacity) {
		queue = new Employee[capacity];
	}
	
	// capacity
	public int capacity() {
		return queue.length;
	}
	
	// size
	public int size() {
		return rear-front;
	}
	
	// is empty
	public boolean isEmpty() {
		return size() == 0;
	}
	
	// add : insert data at the rear end 
	public void add(Employee data) {
		// queue is full => auto growable
		if(rear == queue.length) {
			//double the size of queue
			Employee[] tempArr= new Employee[2*queue.length];
			System.arraycopy(queue, 0, tempArr, 0, queue.length);
			queue = tempArr;
		}
		// add values in queue
		queue[rear++] = data;
	}
	
	// remove  : remove data from the front end
	public Employee remove() {
		//verify for queue empty
		if(isEmpty()) {
			front =0;
			rear = 0;
			return null;
		}
		Employee removedNode = queue[front];
		queue[front] = null;
		front ++;
		return removedNode;
	}
	
	// peek : print top 
	public Employee peek() {
		//verify queue is empty
		if(isEmpty()) {
			front =0;
			rear = 0;
			return null;
		}
		return queue[front];
	}
	
	// print queue
	public void printqueue() {
		System.out.println("Front -> ");
		for (int i = front; i < rear ; i++) {
			System.out.println(queue[i]);
		}
		System.out.println(" <- Rear");
	}
}

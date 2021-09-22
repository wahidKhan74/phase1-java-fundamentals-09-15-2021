package com.simplilearn.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		// Queue is a data structure which works in first in first out order.
		Queue<String> peopleQueue = new ArrayDeque<String>();
		
		// add element into queue
		peopleQueue.add("John Smith");
		peopleQueue.add("Mike Smith");
		peopleQueue.add("Ava Smith");
		peopleQueue.add("William Smith");
		peopleQueue.add("Marry Smith");
		
		//print queue
		System.out.println(peopleQueue);
		
		// peek element
		System.out.println("Head : "+peopleQueue.peek());
		System.out.println("Head : "+peopleQueue.element());
		
		// print and remove from queue
		System.out.println("Removed Head : "+peopleQueue.poll());
		System.out.println("Head : "+peopleQueue.peek());
		
		System.out.println("--------------");
		//iterate over queue
		for(String person : peopleQueue) {
			System.out.println("Name : "+person);
		}
		
		// PriorityQueue : does not maintains the FIFO order.
		Queue<String> banKQueue  = new PriorityQueue<String>();
		
		banKQueue.add("John");
		banKQueue.add("Smith");
		banKQueue.add("Parul");
		banKQueue.add("Jeet");
		banKQueue.add("Mike");
		
		System.out.println("--------------");
		//iterate over queue
		for(String person : banKQueue) {
			System.out.println("Name : "+person);
		}
	}

}

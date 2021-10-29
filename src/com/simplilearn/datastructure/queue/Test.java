package com.simplilearn.datastructure.queue;

public class Test {
	public static void main(String[] args) {

		// create employees
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);

		// create a array queue
		ArrayQueue queue = new ArrayQueue(2);

		System.out.println("Queue size :: " + queue.size());
		System.out.println("Queue capacity :: " + queue.capacity());
		System.out.println("Queue is empty :: " + queue.isEmpty());

		System.out.println("-------------------");
		queue.add(employee1);
		queue.add(employee2);
		queue.add(employee3);
		queue.add(employee4);
		queue.add(employee5);

		System.out.println("Queue size :: " + queue.size());
		System.out.println("Queue capacity :: " + queue.capacity());
		System.out.println("Queue is empty :: " + queue.isEmpty());

		System.out.println("-------------------");

//		queue.printqueue();

		System.out.println("Front Element Queue :: " + queue.peek());
		System.out.println("Removed Element Queue :: " + queue.remove());

		System.out.println("-------------------");

		queue.printqueue();

	}
}

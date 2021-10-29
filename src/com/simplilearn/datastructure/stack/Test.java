package com.simplilearn.datastructure.stack;

public class Test {

	public static void main(String[] args) {
		// create employees
		Employee employee1 = new Employee(1001, "John Snow", "Engineering", 97564.54);
		Employee employee2 = new Employee(1002, "Ava Smith", "Engineering", 97564.54);
		Employee employee3 = new Employee(1003, "Raj Rajan", "Engineering", 97564.54);
		Employee employee4 = new Employee(1004, "Syed Ahmad", "Engineering", 97564.54);
		Employee employee5 = new Employee(1005, "Maria James", "Engineering", 97564.54);

		// create a array stack
		ArrayStack stack = new ArrayStack(2);

		System.out.println("Stack size :: " + stack.size());
		System.out.println("Stack capacity :: " + stack.capacity());
		System.out.println("Stack is empty :: " + stack.isEmpty());

		System.out.println("-------------------");
		stack.push(employee1);
		stack.push(employee2);
		stack.push(employee3);
		stack.push(employee4);
		stack.push(employee5);

		System.out.println("-------------------");
		System.out.println("Top :-> " + stack.peek());
		System.out.println("-------------------");

		System.out.println("-------------------");
		System.out.println("Removed Top :-> " + stack.pop());
		System.out.println("-------------------");

		System.out.println("Stack size :: " + stack.size());
		System.out.println("Stack capacity :: " + stack.capacity());
		System.out.println("Stack is empty :: " + stack.isEmpty());
		System.out.println("-------------------");
		stack.printStack();

	}
}

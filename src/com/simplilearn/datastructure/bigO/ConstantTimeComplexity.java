package com.simplilearn.datastructure.bigO;

public class ConstantTimeComplexity {

	public static void main(String[] args) {
		// search operations
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		displayOne(items);
		displayTwo(items);
	}

	// This methods runs in O(1) -> Constant Time Complexity
	private static void displayOne(int[] items) {
		System.out.println("The item : " + items[5]);
	}

	// This methods runs in O(1+1) => O(2) => O(1) -> Constant Time Complexity
	private static void displayTwo(int[] items) {
		System.out.println("The item : " + items[5]);
		System.out.println("The item : " + items[7]);
	}

}

package com.simplilearn.datastructure.bigO;

public class LinearTimeComplexity {

	public static void main(String[] args) {
		// search operations
		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		displayAll(items);

		displayAllOne(items);

	}

	// This method runs in O(n) : Linear Time Complexity
	private static void displayAll(int[] items) {
		for (int index = 0; index < items.length; index++) {
			System.out.println("The item at index " + index + " is " + items[index]);
		}
	}

	// This method runs in O(n) + O(1)= O(n+1) => O(n): Linear Time Complexity
	private static void displayAllOne(int[] items) {
		for (int index = 0; index < items.length; index++) {
			System.out.println("The item at index " + index + " is " + items[index]);
		}
		System.out.println("The Items "+ items[5]);
	}

}

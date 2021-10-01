package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayOrderStatisticDemo {

	public static void main(String[] args) {
		// Array order statistic identify kth smallest & largest element.
		int[] items = { -15, 4,-2, -2, 40, 34, 78, 67, 50 };

		// kth largest
		int position = 2;
		int result = findKthLargest(items, position);
		System.out.println("The position " + position + " based largest value " + result);

		// kth smallest
		int result2 = findKthSmallest(items, position);
		System.out.println("The position " + position + " based smallest value " + result2);
	}

	private static int findKthSmallest(int[] items, int position) {
		// step1: sort arrays int ascending order
		Arrays.sort(items);

		// return data with kth position
		return items[position-1];
	}

	private static int findKthLargest(int[] items, int pos) {
		// step1: sort arrays int ascending order
		Arrays.sort(items);
		// return data with kth position
		return items[items.length - pos];
	}
}

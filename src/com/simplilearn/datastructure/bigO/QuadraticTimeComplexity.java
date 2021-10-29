package com.simplilearn.datastructure.bigO;

public class QuadraticTimeComplexity {

	public static void main(String[] args) {

		int[] items = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };

		displayAllPairs(items);
		displayAllThreePairs(items);
	}

	// This methods run in O(n * n) => O(n^2) => Quadratic Time Complexity
	private static void displayAllPairs(int[] items) {
		for (int first : items) {
			for (int second : items) {
				System.out.println(first + "  " + second);
			}
		}
	}

	// This methods run in O(n * n * n) => O(n^3) => O(n^2) => Quadratic Time Complexity
	private static void displayAllThreePairs(int[] items) {
		for (int first : items) {
			for (int second : items) {
				for(int third : items) {
					System.out.println(first + "  " + second +"  "+ third);
				}
			}
		}
	}

}

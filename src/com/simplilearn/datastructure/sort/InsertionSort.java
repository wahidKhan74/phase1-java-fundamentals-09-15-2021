package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before Sort : " + Arrays.toString(inputs));
		insertionSort(inputs);
		System.out.println("After Sort : " + Arrays.toString(inputs));

	}

	private static void insertionSort(int[] inputs) {
		
		for (int start = 1; start < inputs.length; start++) {
			
			int element = inputs[start];
			int index ; 
			// System.out.println("Start Index : "+start);
			// System.out.println("Start Element : "+element);
			// Comparison loop
			for (index = start; index > 0 && inputs[index-1]>element; index--) {
				// swap
				// System.out.println("Index "+index +" Element "+ inputs[index]);
				inputs[index] = inputs[index-1];
			}
			inputs[index] = element;
		}
		
	}

}

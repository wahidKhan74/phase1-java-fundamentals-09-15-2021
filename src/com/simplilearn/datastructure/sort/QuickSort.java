package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before Sort : " + Arrays.toString(inputs));
		int start = 0;
		int end = inputs.length;
		quickSort(inputs, start, end);
		System.out.println("After Sort : " + Arrays.toString(inputs));

	}

	private static void quickSort(int[] inputs, int start, int end) {

		// break logic for recursion
		if (end - start < 2) {
			return;
		}
		
		// create a partition based on pivot
		int pivotIndex = partitionSort(inputs, start, end);
		
		// call quick sort for first half
		quickSort(inputs, start, pivotIndex);
		
		// call quick sort second half
		quickSort(inputs, pivotIndex+1, end);
	}

	private static int partitionSort(int[] inputs, int start, int end) {

		int pivot = inputs[start];

		int i = start;
		int j = end;
		while (i < j) {

			// empty body while for element greater then pivot
			while (i < j && inputs[--j] >= pivot);
			
			if (i < j) {
				inputs[i] = inputs[j];
			}

			// empty body while for element less then pivot
			while (i < j && inputs[++i] <= pivot);
			
			if (i < j) {
				inputs[j] = inputs[i];
			}

		}
		inputs[j] = pivot;
		
		return j;
	}

}

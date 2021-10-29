package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] inputs = { 20 ,35,-15, 5, 55, 2, -18 };
		
		System.out.println("Before Sort : "+Arrays.toString(inputs));
		selectionSort(inputs);
		System.out.println("After Sort : "+Arrays.toString(inputs));
	}

	private static void selectionSort(int[] inputs) {
		// iterate over unsorted partition
		for (int lastUnsortedIndex = inputs.length-1 ; lastUnsortedIndex >0; lastUnsortedIndex--) {
			int largest= 0;
			// find largest
			for (int index = 1; index <= lastUnsortedIndex ; index++) {
				if(inputs[index]>inputs[largest]) {
					largest = index;
				}
			}
			swap(inputs,largest,lastUnsortedIndex);
		}		
	}

	private static void swap(int[] inputs, int a, int b) {
		if(a==b) {
			return ;
		}
		int tmp = inputs[a];
		inputs[a] = inputs[b];
		inputs[b] = tmp;
	}

}

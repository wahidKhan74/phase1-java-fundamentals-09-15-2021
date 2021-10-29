package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before Sort : " + Arrays.toString(inputs));
		bubbleSort(inputs);
		System.out.println("After Sort : " + Arrays.toString(inputs));

	}

	private static void bubbleSort(int[] inputs) {
		for (int end = inputs.length-1 ; end >0; end--) {
			// Comparison loop
			for (int index = 0; index < end; index++) {
				if(inputs[index]>inputs[index+1]) {
					swap(inputs,index,index+1);
				}
			}
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

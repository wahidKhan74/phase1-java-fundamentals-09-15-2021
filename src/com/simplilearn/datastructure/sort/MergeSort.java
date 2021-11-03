package com.simplilearn.datastructure.sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] inputs = { 20, 35, -15, 5, 55, 2, -18 };

		System.out.println("Before Sort : " + Arrays.toString(inputs));
		int start = 0;
		int end = inputs.length;
		mergeSort(inputs, start, end);
		System.out.println("After Sort : " + Arrays.toString(inputs));

	}

	private static void mergeSort(int[] inputs, int start, int end) {
		
		// break logic for recursion
		if(end-start <2) {
			return ;
		}
		// step1 : divide arrays elements into two half
		int mid = (start + end) / 2;

		// step2 : call merge sort for first half
		mergeSort(inputs, start, mid);

		// step3 : call merge sort for second half
		mergeSort(inputs, mid, end);
		
		// step4 : compare & merge
		merge(inputs,start,mid,end);
	}

	private static void merge(int[] inputs, int start, int mid, int end) {
		// when element is correct order or they same element.
		if(inputs[mid-1] <= inputs[mid]) {
			return ;
		}
		
		int i = start;
		int j = mid;   
		int tmpIndex=0;
		
		int[] temp = new int[end-start];
		
		while(i<mid && j < end) {
			temp[tmpIndex++] = (inputs[i]<= inputs[j]) ? inputs[i++] : inputs[j++];
		}
		
		//copy element from temp to actual inputs array
		System.arraycopy(inputs, i, inputs, start+tmpIndex, mid-i);
		System.arraycopy(temp, 0, inputs, start, tmpIndex);
		
	}

}

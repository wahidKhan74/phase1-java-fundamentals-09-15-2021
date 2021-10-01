package com.simplilearn.datastructure.arrays;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int items[] = {-15,-4,-2,40,34,78,67,50 };
		
		System.out.println("Before Rotations : "+Arrays.toString(items));
		rotateRight(items,5);
		System.out.println("After Rotations : "+Arrays.toString(items));
	}

	
	private static void rotateRight(int[] items, int rotateCount) {
		
		//create temp array
		int temp[] = new int[rotateCount];
		
		// shift element to temp array
		for (int i = 0; i < rotateCount; i++) {
			temp[i]=items[i];
		}
		
		// rotate actual array
		for (int j = rotateCount; j < items.length; j++) {
			items[j-rotateCount] = items[j];
		}
		
		// copy temp array to actual array.
		for (int i = 0; i < rotateCount; i++) {
			items[i+items.length-rotateCount] = temp[i];
		}
	}
}

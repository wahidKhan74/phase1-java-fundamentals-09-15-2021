package com.simplilearn.datastructure.arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		// array is linear static ordered collection of data elements
		int items[] = {-15,-4,-2,40,34,78,67,50 };
		
		displayForward(items);
		System.out.println("-----------");
		displayReverse(items);

	}

	private static void displayReverse(int[] items) {
		for (int index = items.length-1 ; index>=0; index--) {
			System.out.println("The index : "+index +" & value : "+items[index]);
		}
	}

	private static void displayForward(int[] items) {
		for (int index = 0; index < items.length; index++) {
//			if(index==3) {
//				continue;
//			}
			System.out.println("The index : "+index +" & value : "+items[index]);
		}
	}

}

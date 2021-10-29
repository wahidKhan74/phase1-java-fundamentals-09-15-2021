package com.simplilearn.datastructure.search;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		int[] inputs = { -22, -15, -3, -1, 5, 9, 20, 35, 55 };

		// search value
		int value = 35;
		
		int searchIndex = exponentialSearch(inputs,value);


		if(searchIndex>=0) {
			System.out.println("The search element "+value +" is found at index "+searchIndex);
		} else {
			System.out.println("Search element does not exist !");
		}
	}

	// Best Time Complexity is O(1)  and worst time complexity O(log2 n)
	private static int exponentialSearch(int[] inputs, int value) {
		
		// start with 0 index -> if search value present at index 0
		if(inputs[0]==value) {
			return 0;
		}
		// 2. doubling method
		int range=1;
		while(range<inputs.length && inputs[range]<=value) {
			range = range*2;
		}
		
		//3. binary search
		return Arrays.binarySearch(inputs, range/2 , Math.min(range, inputs.length), value);
	}

}

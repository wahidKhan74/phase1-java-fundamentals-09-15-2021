package com.simplilearn.datastructure.search;

public class BinarySearchWithRecursion {

	public static void main(String[] args) {
		// input data
		int[] items = { -220, -150, -35, -15, 7, 9, 35, 122 };

		int value = 35;

		int start =0;
		int end = items.length -1;
		
		int searchIndex = binarySearch(items, start, end , value);
		
		if(searchIndex>=0) {
			System.out.println("The search element "+value +" is found at index "+searchIndex);
		} else {
			System.out.println("Search element does not exist !");
		}
	}

	// This methods in O(log n) => Logarithmic search
	private static int binarySearch(int[] items,int start, int end, int value) {
		
			// breaking condition -> if value not found
			if(start > end ) {
				return -1;
			}		
			// middpoint 
			int middpoint = (start+end )/ 2;
			
			// middpoint is the search value
			if(items[middpoint] == value) {
				return middpoint;
			}
			// search in right half
			else if(items[middpoint] < value) {
				return binarySearch(items,middpoint+1,end,value);
			} 
			// search in left half
			else {
				return binarySearch(items,start, middpoint-1,value);
			}
	}

}

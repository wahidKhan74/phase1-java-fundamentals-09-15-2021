package com.simplilearn.datastructure.search;

public class LinearSearch {

	public static void main(String[] args) {
		
		int[] items = {20,50, 35,-15,7,1,55,-22};
		
		int searchValue = 7;
		
		int searchIndex = linearSearch(items,searchValue);
		
		if(searchIndex>=0) {
			System.out.println("The search element "+searchValue +" is found at index "+searchIndex);
		} else {
			System.out.println("Search element does not exist !");
		}

	}

	// This method runs in O(n) 
	private static int linearSearch(int[] items, int searchValue) {
		// search through an complete array
		for (int index = 0; index < items.length; index++) {
			if(items[index]==searchValue) {
				return index;
			}
		}
		return -1;  // data not found
	}

}

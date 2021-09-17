package com.simplilearn.arrays;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int numbers[]  = new int[5];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;
		
		// numbers[5] = 50;  // error : ArrayIndexOutOfBoundsException
		
		System.out.println(Arrays.toString(numbers));
		System.out.println(numbers.length);
		
		//access data by index
		System.out.println("The number : "+ numbers[2]);
		System.out.println("The number : "+ numbers[4]);
		
		// access data by iteration
		for(int index=0; index<numbers.length; index++) {
			System.out.println("The index : "+index +" and value : "+numbers[index]);
		}
	}

}

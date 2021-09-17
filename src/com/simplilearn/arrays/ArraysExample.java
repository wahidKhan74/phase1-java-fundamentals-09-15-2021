package com.simplilearn.arrays;

import java.util.Arrays;

public class ArraysExample {

	public static void main(String[] args) {
		
		//create array to store years
		int years[]  = {2021,2020,2019,2018,2017,2016,2015};
		
		System.out.println(Arrays.toString(years));
		System.out.println(years.length);

		// access 2nd position
		System.out.println("The element at second : "+years[1]);
		
		for (int index = 0; index < years.length; index++) {
			System.out.println("The index "+index+" & its year "+years[index]);
		}
	}

}

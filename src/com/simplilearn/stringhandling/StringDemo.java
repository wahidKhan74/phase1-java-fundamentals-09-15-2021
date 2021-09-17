package com.simplilearn.stringhandling;

public class StringDemo {

	public static void main(String[] args) {
		
		// String literal :
		// Each time you create a string literal, the JVM checks the "string constant pool" first.
		// If the string already exists in the pool, a reference to the pooled instance is returned.
		String str1 = "Noah";

		String str2 = "Noah"; // does not create anew string

		if (str1 == str2) {
			System.out.println(" -- Same String --");
		} else {
			System.out.println("-- Diffrent String ---");
		}
		
		System.out.println("------------");
		// String with new keyword
		// Each Time new keyword is going to generate new string reference.
		String name1 = new String("John");
		
		String name2 = new String("John");
		
		if (name1 == name2) {
			System.out.println(" -- Same String --");
		} else {
			System.out.println("-- Diffrent String ---");
		}
		
	}

}

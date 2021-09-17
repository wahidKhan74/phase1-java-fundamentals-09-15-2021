package com.simplilearn.stringhandling;

public class StringBuilderDemo {

	public static void main(String[] args) {
		
		// StringBuilder is mutable string
		StringBuilder text = new StringBuilder("Today is a wonderfull day!");
		
		System.out.println(text);
		
		// append new text in the string
		text.append(" Happy learning !");
		System.out.println(text);
		
		// replace text
		text.replace(0, 5, "Tomorrow");
		System.out.println(text);

		// delete text
		text.delete(0, 2);
		System.out.println(text);
		
		// insert text
		text.insert(0, "Welcome, to");
		System.out.println(text);
	}

}

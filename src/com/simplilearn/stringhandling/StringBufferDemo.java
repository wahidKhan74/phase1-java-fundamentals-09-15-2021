package com.simplilearn.stringhandling;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		// StringBuffer is mutable string
		StringBuffer message = new StringBuffer("Today is a good day!");
		
		System.out.println(message);
		
		// append new text in the string
		message.append(" Happy learning !");
		System.out.println(message);
		
		// replace text
		message.replace(0, 5, "Tomorrow");
		System.out.println(message);

		// delete text
		message.delete(0, 2);
		System.out.println(message);
		
		// insert text
		message.insert(0, "Welcome, to");
		System.out.println(message);
	}

}

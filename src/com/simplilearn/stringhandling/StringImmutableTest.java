package com.simplilearn.stringhandling;

public class StringImmutableTest {

	public static void main(String[] args) {
		// In java, string objects are immutable.
		// Immutable simply means unmodifiable or unchangeable values.
		
		String username = "John";
		
		//cancat() -> update the string
		
		String response = username.concat(" Snow");
		
		System.out.println(username);  // old name => old string
		
		System.out.println(response);  // new name => new string
	}

}

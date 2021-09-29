package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowExceptionDemo {

	public static void main(String[] args) {
		// throw :: throw keyword is used to throw an exception.
		
		ageValidator(20);
		System.out.println("------------");
		try {
			ageValidator(2);
		} catch (RuntimeException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
		System.out.println("------------");
		ageValidator(45);

		System.out.println("------------");
		usernameValidator("mike@123");
		System.out.println("------------");
		usernameValidator("");
		System.out.println("------------");
		usernameValidator(null);
	}

	private static void ageValidator(int age) {
		if(age> 18) {
			System.out.println("Your age is a valid age !");
			System.out.println("You can Vote !");
		} else {
			throw new RuntimeException("Your age is not a valid age !");
		}
	}
	
	public static void usernameValidator(String username) {
		if(username != null && username.length() >0) {
			System.out.println("Valid username !");
		} else {
			try {
				throw new IOException("Not a valid username !");
			} catch (IOException e) {
				System.out.println("Exception Occures : " + e.getClass());
				System.out.println("Exception Message : " + e.getMessage());
			}
		}
	}
}

package com.simplilearn.exceptionhandling;

import java.io.IOException;

public class ThrowsExceptionDemo {

	public static void main(String[] args) {
		
		// throws : throws keyword is used to declare exception.
		try {
			ageValidator(22);
			ageValidator(2);
		} catch (IOException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	public static void ageValidator(int age) throws IOException {
		if(age>20) {
			System.out.println("Vote is casted !");
		} else {
			throw new IOException("Not a valid age!");
		}
	}
}

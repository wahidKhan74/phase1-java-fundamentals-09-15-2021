package com.simplilearn.methods;

public class MethodDemo {

	public static void main(String[] args) {
		
		MethodDemo method = new MethodDemo();
		
		// methods calling
		method.showMessage();
		
		method.displayAuthor("John Smith");
		method.displayAuthor("Tony Stark");
		method.displayAuthor("David Miller");
		
		method.ageCalculator(1990);
		method.ageCalculator(1994);
		
		method.displayDetails("Tony Stark","He is iron man");
		method.displayDetails("John Snow","He is doctor");
		
		MethodDemo.getUserInfo("Mike Mathew", 28, true);
	}
	
	// methods types
	// 1. predefined methods
	// 2. user defined methods
		 // 1. non parameterized method
		 // 2. parameterized method

	// methods deceleration / methods definition
	// 1. non parameterized method
	public void showMessage() {
		System.out.println("Welcome to java method.");
	}
	
	// one parameterized methods
	public void displayAuthor(String author) {
		System.out.println("The Author : "+author);
	}
	
	public void ageCalculator(int yearOfBirth) {
		int age = 2021 - yearOfBirth;
		System.out.println("The user age : "+age);
	}
	
	// multi parameterized methods
	public void displayDetails(String username, String description) {
		System.out.println("The user :"+username+" and its description :"+description);
	}
	
	public static void getUserInfo(String name, int age, boolean isMarried) {
		System.out.println("The user '"+name+"' and has age '"
				+age+"' and he/she is married "+isMarried);
	}
}

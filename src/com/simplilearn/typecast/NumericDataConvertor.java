package com.simplilearn.typecast;

import java.util.Scanner;

public class NumericDataConvertor {
	
	public static void main(String[] args) {
		
		// step 1. collect input from user console.
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to numeric convertor :: ");
		System.out.println(" :: Enter a integer number vaule :: ");
		System.out.println("-----------------------------------");
		int userInput = input.nextInt();
		
		System.out.println("User Input : "+userInput);
		// step 2. convert user input into different numeric type
		
		// implict type cast
		long bigValue = userInput;
		float floatValue = userInput;
		double doubleValue = userInput;
		
		// explict type cast
		byte byteValue = (byte) userInput;
		short shortValue = (short) userInput;
		
		System.out.println("Converted value : ");
		System.out.println("Byte Value : "+byteValue);
		System.out.println("Short Value : "+shortValue);
		System.out.println("Long Value : "+bigValue);
		System.out.println("Float Value : "+floatValue);
		System.out.println("Double Value : "+doubleValue);
		
	}
}

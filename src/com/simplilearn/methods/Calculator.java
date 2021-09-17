package com.simplilearn.methods;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		// create object
		ArithmaticCalculator calculator = new ArithmaticCalculator();

		// step 1. collect input from user console.
		Scanner input = new Scanner(System.in);
		System.out.println("-----------------------------------");
		System.out.println(" :: Welcome to Arithmatic Calculator :: ");
		System.out.println("-----------------------------------");
		
		System.out.println(" :: Enter a number 1 vaule :: ");
		int x = input.nextInt();
		
		System.out.println(" :: Enter a number 2 vaule :: ");
		int y = input.nextInt();
		
		float result = calculator.add(x, y);
		System.out.println("The addition is : " + result);
		
		float result2 = calculator.sub(x, y);
		System.out.println("The substraction is : " + result2);
		
		float result3 = ArithmaticCalculator.div(x, y);
		System.out.println("The division is : " + result3);
		
		float result4 = ArithmaticCalculator.mul(x, y);
		System.out.println("The multiplication is : " + result4);
		
		float result5 = calculator.avg(x, y);
		System.out.println("The Avg is : " + result5);

	}

}

class ArithmaticCalculator {

	// add
	public float add(int num1, int num2) {
		float result = num1 + num2;
		return result;
	}

	// sub
	public float sub(int num1, int num2) {
		float result = num1 - num2;
		return result;
	}

	// div
	public static float div(int num1, int num2) {
		float result = num1 / num2;
		return result;
	}

	// mul
	public static float mul(int num1, int num2) {
		float result = num1 * num2;
		return result;
	}

	// avg
	public float avg(int num1, int num2) {
		float result = (num1 + num2) / 2;
		return result;
	}

}

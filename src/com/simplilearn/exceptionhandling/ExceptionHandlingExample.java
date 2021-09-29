package com.simplilearn.exceptionhandling;

public class ExceptionHandlingExample {

	static int balance = 10000;

	public static void main(String[] args) {

		trasaction(10);
		trasaction(0);
		trasaction(33);

		System.out.println("--------");
		strLenghthCalculator("Hi, John Smith");
		strLenghthCalculator(null);
		strLenghthCalculator("Hi");

		System.out.println("--------");
		numberConvertor("33434");
		numberConvertor("33asd");
		numberConvertor("33.33");
		numberConvertor("33");
	}

	public static void trasaction(int amount) {
		try {
			float result = balance / amount;
			System.out.println("Rest Amount : " + result);
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}

	}

	private static void strLenghthCalculator(String str) {
		try {
			int length = str.length();
			System.out.println("Input string length : " + length);
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

	private static void numberConvertor(String input) {
		try {
			int result = Integer.parseInt(input);
			System.out.println("Integer Result : " + result);
		} catch (Exception e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}
	}

}

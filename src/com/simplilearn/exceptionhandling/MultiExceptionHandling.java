package com.simplilearn.exceptionhandling;

public class MultiExceptionHandling {

	public static void main(String[] args) {
		
		multiTask(0,"333");
		System.out.println("-----------------");
		multiTask(10,null);
		System.out.println("-----------------");
		
		multiTask(10,"121abc");
		System.out.println("-----------------");
	}
	
	public static void multiTask(int amount , String str) {
		
		int balance = 3455454;
		try {
			float result = balance / amount;
			System.out.println("Rest Amount : " + result);
			
			int length = str.length();
			System.out.println("Input string length : " + length);
			
			int result2 = Integer.parseInt(str);
			System.out.println("Integer Result : " + result2);
			
		} catch (ArithmeticException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (NullPointerException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("Exception Occures : " + e.getClass());
			System.out.println("Exception Message : " + e.getMessage());
		}		
	}

}

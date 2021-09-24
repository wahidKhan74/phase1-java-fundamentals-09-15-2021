package com.simplilearn.collections.regx;

import java.util.regex.Pattern;

public class RegExPatternRealExample {

	public static void main(String[] args) {
		
		// WA pattern for that accepts alphanumeric characters only for username.
		String username ="yeeSang123";
		String regexOne = "[a-zA-Z0-9]+";
		System.out.println(Pattern.matches(regexOne, username));

		// WA pattern  for that accepts alphanumeric characters  but only of length 10.
		
		String username2 ="yeeSang123";
		String regexTwo = "[a-zA-Z0-9]{10}";
		System.out.println(Pattern.matches(regexTwo, username2));
		
		// WA pattern for firstName where only small alphabets allowed up to 6 char
		String firstName ="YeeSan";
		String regexThree = "[a-zA-Z0-9]{0,6}";
		System.out.println(Pattern.matches(regexThree, firstName));
		
		// WA pattern for email where only small alphabets with number allowed up to 15 char
		String email ="yeesnaggmail.com";
		String regexFour = "[a-z0-9]+{0,15}";
		System.out.println(Pattern.matches(regexFour, email));
		
		// WA pattern for email where only small alphabets with number and @ special allowed up to 15 char
		String emailTwo ="yee.snag@gmail.com";
		String regexFive = "[a-z0-9]+(.+)@(.+){0,15}";
		System.out.println(Pattern.matches(regexFive, emailTwo));
	}

}

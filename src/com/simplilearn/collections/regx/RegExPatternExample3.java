package com.simplilearn.collections.regx;

import java.util.regex.Pattern;

public class RegExPatternExample3 {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("[a-z]*", "pqr")); // true ->  it matches zero or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]*", "monika")); // true ->  it matches zero or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]*", "")); // true ->  it matches zero or more value out of a to z.
		
		
		System.out.println(Pattern.matches("[a-z]+", "")); // false ->  it matches one or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]+", "x")); // true ->  it matches one or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]+", "A")); // false ->  it matches one or more value out of a to z.
		System.out.println(Pattern.matches("[a-z]+", "shree")); // true ->  it matches one or more value out of a to z.
		
		System.out.println(Pattern.matches("[A-Z]+", "")); // false ->  it matches one or more value out of A to Z.
		System.out.println(Pattern.matches("[A-Z]+", "x")); // false ->  it matches one or more value out of A to Z.
		System.out.println(Pattern.matches("[A-Z]+", "XXYYZZ")); // true ->  it matches one or more value out of A to Z.
		System.out.println(Pattern.matches("[A-Z]+", "Bhargav")); // false ->  it matches one or more value out of A to Z.
		System.out.println("-------");
		System.out.println(Pattern.matches("[a-zA-Z]+", "")); // false ->  it matches one or more value out of A to Z or a-z.
		System.out.println(Pattern.matches("[a-zA-Z]+", "Bhargav")); // true ->  it matches one or more value out of A to Z or a-z.
		System.out.println(Pattern.matches("[a-zA-Z]+", "12235")); // false ->  it matches one or more value out of A to Z or a-z.
		
		System.out.println("-------");
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "Bhargav")); // true ->  it matches one or more value out of A to Z or a-z or 0-9.
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "Bhargav12")); // true ->  it matches one or more value out of A to Z or a-z or 0-9.
		System.out.println(Pattern.matches("[a-zA-Z0-9]+", "123BEm")); // true ->  it matches one or more value out of A to Z or a-z.

		System.out.println("-------");
		System.out.println(Pattern.matches("\\d", "mkd"));  // false-> only digits 0-9.
		System.out.println(Pattern.matches("\\d", "1"));  // true->  one match only digits 0-9.
		System.out.println(Pattern.matches("\\d+", "1234"));  // true->  one or more match only digits 0-9.
		
		System.out.println(Pattern.matches("\\D", "1"));  // false->  one match only non digits.
		System.out.println(Pattern.matches("\\D", "p"));  // true->  one match only non digits.
		System.out.println(Pattern.matches("\\D+", "mkdir"));  // true->  one match only non digits.
		
	}

}

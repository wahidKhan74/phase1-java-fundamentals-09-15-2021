package com.simplilearn.collections.regx;

import java.util.regex.Pattern;

public class RegExPatternExample {

	public static void main(String[] args) {

		// shortest syntax
		System.out.println(Pattern.matches(".n", "Yn")); // true -> 1st char can be any value but 2nd char should be 'n'
		System.out.println(Pattern.matches(".m", "Hm")); // true -> 1st char can be any value but 2nd char should be 'm'
		System.out.println(Pattern.matches(".m", "Hmm")); // false -> only two char allowed
		System.out.println(Pattern.matches(".m", "Hx")); // false -> 2nd char should be 'm'
		
		System.out.println(Pattern.matches("..m", "Hxm")); // true -> 1st & 2nd char can be any value but 3rd char should be 'm'
		System.out.println(Pattern.matches("..m", "Hxx")); // false -> 1st & 2nd char can be any value but 3rd char should be 'm'
	
		System.out.println(Pattern.matches("x.", "xN")); // true -> 2nd char can be any value but 1st char should be 'x'
		System.out.println(Pattern.matches("x..", "xNy")); // true -> 2nd & 3rd char can be any value but 1st char should be 'x'
		System.out.println(Pattern.matches(".x.", "MxM"));  // true -> 2nd char should be x.
	}

}

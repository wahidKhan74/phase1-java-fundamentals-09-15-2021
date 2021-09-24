package com.simplilearn.collections.regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo {

	public static void main(String[] args) {
		
		// step1: define a data string
		String data = "Pn";
		// step2: define a pattern
		Pattern pattern = Pattern.compile(".n");
		// step3: define a matcher
		Matcher matcher = pattern.matcher(data);
		// step4: match the pattern
		boolean result = matcher.matches();
		
		System.out.println("Result 1 : "+result);
		
		//shorter syntax
		boolean result2 =  Pattern.compile(".x").matcher(data).matches();
		System.out.println("Result 2 : "+result2);
		
		// shortest syntax
		boolean result3 = Pattern.matches(".n", data);
		System.out.println("Result 3 : "+result3);
		
	}

}

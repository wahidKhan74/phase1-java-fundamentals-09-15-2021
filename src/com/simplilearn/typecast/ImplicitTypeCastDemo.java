package com.simplilearn.typecast;

public class ImplicitTypeCastDemo {

	public static void main(String[] args) {
		
		// Implicit TypeCast : Widening or Automatically type cast
		
		/*
		 * Widening Typecast : Converts data from lower range value to higher range type.
		 * byte  -> short  -> int  -> long -> float  -> double.
		 */
		
		byte smallCount = 100;  // -128 to 127 => 1 byte = 8 bit
		
		int intCount = smallCount; // widening => byte -> int
		
		long bigCount = intCount;  // widening => int -> long
		
		float floatCount = intCount; // widening => int -> float
		
		double decimalCount = bigCount; // widening => long -> double
		
		float  fCount = bigCount;  // widening => long -> float
		
		System.out.println("Byte Count : "+smallCount);
		System.out.println("Integer Count : "+intCount);
		System.out.println("Long Count : "+bigCount);
		System.out.println("Float Count : "+floatCount);
		System.out.println("Double Count : "+decimalCount);
		System.out.println("fCount Count : "+fCount);

	}

}

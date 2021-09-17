package com.simplilearn.innerclass;

public class OuterTest2 {

	private static double amount = 389485.34;
	private static String username="mikesmith";
	
	// nested / inner class
	static class InnerTest {
		
		private String message = "Hello & welcome everyone !";
		
		public void show() {
			System.out.println("Outer class data : "+amount);
			System.out.println("Outer class username : "+username);
			System.out.println("Inner class data : "+message);
		}
	} // inner class
	
	
	public static void main(String[] args) {
	
		// create a inner class object with outer class refrence.
		InnerTest inner = new OuterTest2.InnerTest();
		
		inner.show();

	}

}

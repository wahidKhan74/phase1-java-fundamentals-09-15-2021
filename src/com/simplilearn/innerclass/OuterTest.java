package com.simplilearn.innerclass;

public class OuterTest {

	private double amount = 389485.34;
	private String username="mikesmith";
	
	// nested / inner class // non static
	class InnerTest {
		
		private String message = "Hello & welcome everyone !";
		
		public void show() {
			System.out.println("Outer class data : "+amount);
			System.out.println("Outer class username : "+username);
			System.out.println("Inner class data : "+message);
		}
	} // inner class
	
	
	public static void main(String[] args) {
		// create a outer class object
		OuterTest outer = new OuterTest();
		
		// create a inner class object
		InnerTest inner = outer.new InnerTest();
		
		inner.show();

	}

}

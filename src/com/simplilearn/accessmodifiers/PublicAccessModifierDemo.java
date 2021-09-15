package com.simplilearn.accessmodifiers;

public class PublicAccessModifierDemo {

	public static void main(String[] args) {
		// create object
		Father father = new Father();
		
		System.out.println("The Amount : "+ father.socialMoney);
		System.out.println("The Park : "+ father.park);
		System.out.println("---------------------");
		System.out.println("Amount : "+father.showMoney());
		System.out.println("The Park name : "+father.displayPark());

	}

}

class Father {
	
	// properties
	public String park ="Public Park";
	public double socialMoney = 74634.3445;
	
	// methods
	public double showMoney() {
		return socialMoney;
	}
	public String displayPark() {
		return park;
	}
	
	//constructor
	public Father() {}
}
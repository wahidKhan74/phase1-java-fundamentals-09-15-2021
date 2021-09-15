package com.simplilearn.accessmodifiers;

public class ProtectedAccessModifierDemo {

	public static void main(String[] args) {
		
		// create object
		Hero hero = new Hero();
		System.out.println(hero.power);
		System.out.println(hero.identity);
		
		System.out.println("-----------");
		hero.usePower();
		hero.useIdentity();
		
		hero.showPower();
	}

}

class Hero {
	
	// protected properties
	protected String power = "Healing Power";
	protected String identity = "Yes";
	
	//protected methods
	protected void usePower() {
		System.out.println("The Best power of all : "+power);
	}
	protected void useIdentity() {
		System.out.println("It is secret"+power);
	}
	
	public void showPower() {
		System.out.println("The power is "+power);
	}
	
	// protected constructor
	protected Hero() {}
	
}

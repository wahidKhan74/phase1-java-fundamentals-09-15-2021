package com.simplilearn.accessmodifiers;

public class DefaultAccessModiferDemo {

	public static void main(String[] args) {
		// create a object
		House house = new House();
		//access variables
		System.out.println("The House : "+house.name);
		System.out.println("The TV : "+house.tv);
		System.out.println("The Member count : "+house.houseMates);
		
		System.out.println("-----------------------");
		// acces methods
		System.out.println(house.showTv());
		house.showBed();
		System.out.println(house.showHouseMatesCount());
	}

}

class House {
	
	// no- access modifier or default
	String name ="King House";
	String tv = "LG TV";
	int houseMates = 5;
	
	// default methods
	String showTv() {
		return tv;
	}	
	void showBed() {
		System.out.println("The House is "+name);
	}	
	int showHouseMatesCount(){
		return houseMates;
	}
	
	// default constructor
	House() { };
	
}

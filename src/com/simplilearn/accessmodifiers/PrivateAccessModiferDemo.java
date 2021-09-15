package com.simplilearn.accessmodifiers;

public class PrivateAccessModiferDemo {
	
	public static void main(String[] args) {
		
		// create a object
		Account account = new Account();
		
		// private property access 
		// System.out.println(account.id);  // The field Account.id is not visible
		// System.out.println(account.username);  // The field Account.username is not visible
		// System.out.println(account.balance);  // The field Account.balance is not visible
		// System.out.println(account.password);  // The field Account.password is not visible
		
		 System.out.println(account.bankName); 
		 
		 // account.showBalance(); //compile time error
		// account.showId(); // compile time error
		 
		 account.showAccount();
	}
}


class Account {
	
	// private properties
	private long id =1010100101;
	private double balance= 98765456.56;
	private String username ="John Snow";
	private String password = "john@123";
	//public properties
	public String bankName ="Iron Bank";
	
	
	// private methods
	private double showBalance() {
		return balance;
	}
	private long showId() {
		return id;
	}
	
	//public method
	public void showAccount() {
		System.out.println(" The Acount id :" +id);
		System.out.println(" The Acount name :" +username);
	}
	//private constructor 
	// private Account() {}
	// Note : Private Constructor based class can not be instantiated.
}
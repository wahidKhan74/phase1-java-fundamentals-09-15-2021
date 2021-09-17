package com.simplilearn.methods.bank;

public class Bank {
	
	public static String bankName ="Iron Bank";
	
	// show balance
	public double showBalance(Account account) {
		return account.balance;
	}
	
	// withdraw
	public double withdrawAmount(Account account, double withdrawAmt) {
		if(withdrawAmt<account.balance && withdrawAmt >0)
			account.balance -= withdrawAmt;  // account.balance =  account.balance - withdrawAmt;
		else 
			System.out.println("Invalid Amount");
		return account.balance;
	}
	
	// deposit
	public double depositAmount(Account account, double depositAmt) {
		if(depositAmt >0)
			account.balance += depositAmt;  // account.balance =  account.balance - withdrawAmt;
		else 
			System.out.println("Invalid Amount");
		return account.balance;
	}
	
	// rateOfIntrest
	public static double rateOfIntrest() {
		return 7.5;
	}
}

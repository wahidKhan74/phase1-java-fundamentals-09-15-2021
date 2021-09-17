package com.simplilearn.methods.bank;

public class Account {
	
	public long accNo;
	public double balance;
	public String username;
	public String email;
	
	public Account() {};
	
	// one parameter constructor
	public Account(long accNo){
		this.accNo = accNo;
	}
	// two parameter constructor
	public Account(long accNo, String username){
		this.accNo = accNo;
		this.username = username;
	}

	public Account(long accNo, double balance, String username, String email) {
		this.accNo = accNo;
		this.balance = balance;
		this.username = username;
		this.email = email;
	}
	
}

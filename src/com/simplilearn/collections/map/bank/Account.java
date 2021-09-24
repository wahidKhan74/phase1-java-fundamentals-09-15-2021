package com.simplilearn.collections.map.bank;

// Account : POJO or Encapsulated Bean
public class Account {
	
	// properties
	private String name;
	private String email;	
	private double balance;
	
	//get and set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	//constructor
	public Account(String name, String email, double balance) {
		super();
		this.name = name;
		this.email = email;
		this.balance = balance;
	}
	public Account() {
		super();
	}
	// Override a tostring
	@Override
	public String toString() {
		return "Account [name=" + name + ", email=" + email + ", balance=" + balance + "]";
	}
	
}

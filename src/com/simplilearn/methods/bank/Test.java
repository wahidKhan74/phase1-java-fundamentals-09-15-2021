package com.simplilearn.methods.bank;

public class Test {

	public static void main(String[] args) {

		// create a account object
		Account account = new Account(17866343, 547675.454, "Iron man", "iron.man@gmail.com");

		System.out.println(":: Welcome to the bank of :: '" + Bank.bankName + "'");
		System.out.println(":: We provides rate of intrest  :: '" + Bank.rateOfIntrest() + "'%");
		System.out.println("-----------------------------");
		// create a bank
		Bank bank = new Bank();

		System.out.println("The user balance : " + bank.showBalance(account));
		
		System.out.println("The user balance after withdraw: " + bank.withdrawAmount(account, 10000));
		System.out.println("The user balance after withdraw: " + bank.withdrawAmount(account, 0));
		
		System.out.println("The user balance after deposit: " + bank.depositAmount(account, 10000));

	}

}

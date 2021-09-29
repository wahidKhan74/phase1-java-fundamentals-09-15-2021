package com.simplilearn.exceptionhandling.bank;

public class BankOperations {
	
	static int accNo =192835;
	static double balance =234344;

	public static void main(String[] args) {
		
		showBalance(192835);
		try {
			showBalance(192833);
		} catch (Exception e) {
			System.out.println(e);
		}
		showBalance(192835);
		System.out.println("-------------");
		
		try {
			withdraw(192835,1000);
			withdraw(192835,-1000);
		} catch (InvalidTxException e) {
			System.out.println(e);
		}
	}
	
	public static void showBalance(int accNumber) {
		if(accNo==accNumber) {
			System.out.println("The user account "+accNumber+" has balance is : "+balance);
		} else {
			throw new AccountNotFound("Acount does not exist !");
		}
	}

	public static void withdraw(int accNumber, double amount) throws InvalidTxException {
		if(accNo==accNumber) {
			System.out.println("Before withdraw :: The user account "+accNumber+" has balance is : "+balance);
			if(amount >0) {
				balance-= amount;
				System.out.println("After withdraw :: The user account "+accNumber+" has balance is : "+balance);
			} else {
				throw new InvalidTxException("The amount cannot be zero or negative !");
			}
		} else {
			throw new AccountNotFound("Acount does not exist !");
		}
	}
}

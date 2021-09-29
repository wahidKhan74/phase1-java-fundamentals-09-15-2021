package com.simplilearn.multithreading;

class Customer {

	double balance = 1000.00;

	synchronized void deposit(double amount) {
		System.out.println("---Going to deposit ---");
		balance += amount;
		System.out.println("Deposit completed ! & new balance is : " + balance);
		
		notify();
	}

	synchronized void withdraw(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient funds !");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
			balance -= amount;
			System.out.println("Withdraw completed ! & new balance is : " + balance);
	}

	synchronized void showBalance() {
		System.out.println("The account balance : " + balance);
	}
}

public class ThreadWithWait {

	public static void main(String[] args) {

		// create customer object
		Customer customer = new Customer();

		// create thread for bank operations
		Thread t1 = new Thread(() -> {
			customer.withdraw(5000);
		});

		Thread t2 = new Thread(() -> {
			customer.showBalance();
		});

		Thread t3 = new Thread(() -> {
			customer.deposit(10000);
		});

		
		t1.start();
		t2.start();
		t3.start();
	}

}

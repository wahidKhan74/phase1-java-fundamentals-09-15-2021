package com.simplilearn.multithreading;

public class AnonymousThread2 {

	public static void main(String[] args) {

		// create a thread for will
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Wills says : Hello");
				}
			}
		});
		// create a thread for bob
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Bob says : Hi");
				}
			}

		});
		
		t1.start();
		t2.start();

	}

}
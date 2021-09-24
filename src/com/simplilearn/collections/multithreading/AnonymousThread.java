package com.simplilearn.collections.multithreading;

public class AnonymousThread {

	public static void main(String[] args) {

		// create a thread for bob
		Runnable obj1 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Wills says : Hello");
				}
			}

		};
		
		Thread t1 = new Thread(obj1);
		t1.start();

		// create a thread for bob
		Runnable obj2 = new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Bob says : Hi");
				}
			}

		};
		Thread t2 = new Thread(obj2);
		t2.start();

	}

}
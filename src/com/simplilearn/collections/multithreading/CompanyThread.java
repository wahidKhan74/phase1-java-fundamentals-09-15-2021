package com.simplilearn.collections.multithreading;

public class CompanyThread {

	public static void main(String[] args) {

		// create a thread for bob
		Bob bob = new Bob();
		bob.work();
		Thread t1 = new Thread(bob);
		t1.start();

		// create a thread for bob
		Will will = new Will();
		Thread t2 = new Thread(will);
		t2.start();

	}

}


class Work {
	public void work() {
		System.out.println("Working ------");
	}
}

class Bob extends Work implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Bob says : Hi");
		}
	}

}

class Will implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Wills says : Hello");
		}
	}

}
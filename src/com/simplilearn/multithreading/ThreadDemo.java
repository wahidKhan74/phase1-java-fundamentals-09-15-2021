package com.simplilearn.multithreading;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		
		ThreadDemo mainThread = new ThreadDemo();
		mainThread.start();

	}
	
	public void run() {
		// thread processing logic.
		System.out.println("Main Thread is running !..");
	}

}

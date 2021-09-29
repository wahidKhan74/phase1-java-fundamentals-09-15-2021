package com.simplilearn.multithreading;

class Counter  {
	
	int count = 0;
	//increase counter : thread safe operation
	public synchronized void inceaseCount() {
		count++;
	}
	// decrease counter
	public void decreaseCount() {
		count--;
	}
	
}

public class ThreadSafeDemo {

	public static void main(String[] args) throws InterruptedException {
		
		// create a counter object
		Counter counter = new Counter();
		
		// create threads
		Thread t1 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				counter.inceaseCount();
			}
		});
		
		Thread t2 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				counter.inceaseCount();
			}
		});
		
		Thread t3 = new Thread(()->{
			for (int i = 0; i < 1000; i++) {
				counter.inceaseCount();
			}
		});
		
		//start thread
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("The Count : "+counter.count);

	}

}

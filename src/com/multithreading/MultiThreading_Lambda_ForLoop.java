package com.multithreading;

public class MultiThreading_Lambda_ForLoop {

	public static void main(String[] args) {
		Runnable r = ()-> {
			for(int i=0; i<3; i++) {
				System.out.println("r: " +Thread.activeCount());
			}
		};
		
		Runnable r1 = ()-> {
			for(int i=0; i<3; i++) {
				System.out.println("r1: "+Thread.activeCount());
			}
		};
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		
		t.start();
	
		System.out.println(t.getState());
	//	Thread.sleep(5000);
	//	t.join();
		
		t1.start();

		System.out.println(t1.getState());
	//	System.out.println(Thread.activeCount());
	}

}

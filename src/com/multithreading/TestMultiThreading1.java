package com.multithreading;

public class TestMultiThreading1 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("in R: "+Thread.currentThread().getName());
			}
		};
		
		Runnable r1 = new Runnable() {
			public void run() {
				System.out.println("in R1: "+Thread.currentThread().getName());
			}
		};
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		
		t.start();
		t1.start();
	}

}

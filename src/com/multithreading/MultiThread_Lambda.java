package com.multithreading;

public class MultiThread_Lambda {

	public static void main(String[] args) throws InterruptedException{
		Runnable r = ()-> System.out.println("in r: "+ Thread.currentThread().getName());
		Runnable r1 = ()-> System.out.println("in r1: "+Thread.currentThread().getName());
		
		Thread t = new Thread(r);
		Thread t1 = new Thread(r1);
		
		t.start();
		
		Thread.sleep(3000);
		
		t1.start();
		
		System.out.println(Thread.activeCount());
	}

}

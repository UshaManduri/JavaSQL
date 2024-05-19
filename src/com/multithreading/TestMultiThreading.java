package com.multithreading;

public class TestMultiThreading {

	public static void main(String[] args) {
		Test t = new Test();
		Thread th = new Thread(t, "T");
		th.start();
		
		Test1 t1 = new Test1();
		Thread th1 = new Thread(t1, "T1");
		th1.start();
		
		System.out.println(Thread.activeCount());

	}

}

class Test implements Runnable{
	@Override
	public void run() {
		System.out.println("hello "+Thread.currentThread().getId());
	}
}

class Test1 implements Runnable{
	@Override
	public void run() {
		System.out.println("hiee" + Thread.currentThread().getId());
	}
}

package com.multithreading;

public class TestMultiThread1 {

	public static void main(String[] args) {
		System.out.println("no.of active thread count at start: "+Thread.activeCount());
		
		Thread t = new Thread();
		t.start();
		Thread t1 = new Thread();
		t1.start();
		Thread t2 = new Thread();
		t2.start();
		Thread t3 = new Thread();
		t3.start();
		Thread t4 = new Thread();
		t4.start();
		
		Employee e = new Employee();
		e.start();
		
		Employee1 e1 = new Employee1();
		e1.start();
		
		Employee2 e2 = new Employee2();
		e2.start();
		
		System.out.println("active count of threads: "+Thread.activeCount());
		System.out.println("Name of current thread: "+Thread.currentThread().getName());
	}

}

class Employee extends Thread{
	@Override
	public void run() {
		System.out.println("hello Employee");
	}
}

class Employee1 extends Thread{
	@Override
	public void run() {
		System.out.println("hieee Employee1");
	}
}

class Employee2 extends Thread{
	@Override
	public void run() {
		System.out.println("yollooo Employee2");
	}
}

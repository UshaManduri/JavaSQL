package com.multithreading;

public class TestMultiThread {

	public static void main(String[] args) {
		System.out.println("hello java");
		System.out.println(Thread.activeCount());
		System.out.println(Thread.currentThread());
	//	System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
	}

}

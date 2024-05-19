package com.innerclasses;

public class OuterClass {

	static int data = 20;
	static void display() {
		System.out.println("hii");
	}
	
	static class Outer{
		void msg() {
			System.out.println("data: "+data);
			display();
		}
	}
	public static void main(String[] args) {
		OuterClass.Outer object = new OuterClass.Outer();
		object.msg();

	}

}

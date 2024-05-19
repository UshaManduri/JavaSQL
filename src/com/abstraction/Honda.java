package com.abstraction;

public class Honda extends Bike{

	void run() {
		System.out.println("running safely");
	}
	
	void display() {
		System.out.println("displaying");
	}
	
	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
		b.changeGear();
		b.display();
		
		
	}

}

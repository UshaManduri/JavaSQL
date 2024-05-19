package com.abstraction;

abstract class Bike {
	abstract void run();
	abstract void display();
	
	void changeGear() {
		System.out.println("gear changed");
	}
}

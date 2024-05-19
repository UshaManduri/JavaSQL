package com.interfaces;

public interface Laptop {
	public void write();
	public void cut();
	public void paste();
	public void copy();
	public void delete();

	default public void tab() {
		System.out.println("Laptop - tab");
	}
	
	public static void shift() {
		System.out.println("Laptop - shift");
	}
}

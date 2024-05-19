package com.interfaces;

public class Hp implements Laptop{

	@Override
	public void write() {
		System.out.println("hp-write");
		
	}

	@Override
	public void cut() {
		System.out.println("hp-cut");
		
	}

	@Override
	public void paste() {
		System.out.println("hp-paste");
		
	}

	@Override
	public void copy() {
		System.out.println("hp-copy");
		
	}

	@Override
	public void delete() {
		System.out.println("hp-delete");
		
	}

}

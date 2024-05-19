package com.interfaces;

public class Dell implements Laptop{

	@Override
	public void write() {
		System.out.println("dell-write");
		
	}

	@Override
	public void cut() {
		System.out.println("dell-cut");
		
	}

	@Override
	public void paste() {
		System.out.println("dell-paste");
		
	}

	@Override
	public void copy() {
		System.out.println("dell-copy");
		
	}

	@Override
	public void delete() {
		System.out.println("dell-delete");	
		
	}
	
	public void cam() {
		System.out.println("dell-cam");
	}

	public static void main(String[] args) {
 		Hp hp = new Hp();
		Dell dell = new Dell();
		
		hp.cut();
		hp.copy();
		hp.paste();
		dell.cam();
		hp.tab();
		dell.tab();
		Laptop.shift();
	}
}

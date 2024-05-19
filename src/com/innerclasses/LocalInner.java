package com.innerclasses;

public class LocalInner {

	private int data = 10;
	
	void display() {
		class Local{
			void msg() {
				System.out.println(data);
			}
		}
		Local local = new Local();
		local.msg();
	}
	
	public static void main(String[] args) {
		LocalInner localInner = new LocalInner();
		localInner.display();

	}

}

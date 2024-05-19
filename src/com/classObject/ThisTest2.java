package com.classObject;
class A{
	A(){
		//this("K");
		System.out.println("hello");
	}
	A(String a){
		this();
		System.out.println(a);
	}
}
public class ThisTest2 {
	public static void main(String[] args) {
		A a = new A("K");
	}
}

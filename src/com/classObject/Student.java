package com.classObject;

public class Student {
	int roll;
	String name;
	static String col = "NCPA";
	
	Student(int i, String s){
		roll=i;
		name=s;
	}
	
	void display(){
		System.out.print(roll+" "+name+" "+col);
		System.out.println("\n");
	}
}

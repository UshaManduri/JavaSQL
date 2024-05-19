package com.innerclasses;

abstract class Person{
	abstract void eat();
	}

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Person person = new Person() {
			void eat() {
				System.out.println("nice");
			}
		};
		
		person.eat();
	}

}

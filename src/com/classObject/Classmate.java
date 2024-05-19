package com.classObject;

public class Classmate {
		
		int id;
		String name;
		float age;
		Classmate(int id, String name, float age){
			this.id=id;
			this.name=name;
			this.age=age;
		}
		void display() {
			System.out.println(id+" "+name+" "+age);
		}

	}
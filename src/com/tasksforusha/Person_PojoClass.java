package com.tasksforusha;

public class Person_PojoClass {

	private String name;
	private int age;

	public Person_PojoClass(String name, int age) {
		this.name = name;
		this.age = age;
		
	}

	@Override
	public String toString() {
		return "Person_PojoClass [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

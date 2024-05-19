package com.inheritance;

public class Programmer extends Employee {

	int bonus =30000;
	
	public static void main(String[] args) {
		
		//this.bonus = 30000;
		Programmer p = new Programmer();
		
		System.out.println("sal of prog: "+p.salary +" + " +"bonus: "+p.bonus);
		int sum = p.salary + p.bonus;
		System.out.println("total sal: "+ sum);

	}
}

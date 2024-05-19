package com.conditionalStatements;

public class SwitchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char grade = 'A';
		switch (grade) {
		case 'A':
			System.out.println("Excellent !!");
			break;
		case 'B':
			System.out.println("Good..!");
			break;
		case 'C':
			System.out.println("Work harder..");
			break;
		case 'D':
			System.out.println("Just Passed..");
			break;
		case 'F':
			System.out.println("Fail");
			break;
		case 'H':
			System.out.println("Invalid Grade");
			break;
		}
		System.out.println("Your grade is: " + grade);
	}

}

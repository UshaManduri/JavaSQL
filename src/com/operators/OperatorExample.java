package com.operators;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 22;
		int c = 8;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a==b);
		System.out.println(a!=b);
		
		//
		System.out.println(a<b && a>c);
		System.out.println(a<b || a>c);
		
		//Terinary operators = ? :
		int TerinaryEx = a>b? a:b;
		System.out.println("Terinary ex: " + TerinaryEx);
		
		//assignment / short-hand assignment operators +=,-=,*=,/=,%=
		System.out.println(a+=10);//a=a+10
	}

}

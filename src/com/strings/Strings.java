package com.strings;

public class Strings {

	public static void main(java.lang.String[] args) {
		
		String s1 = "Usha";
		String s2 = "Usha";
		System.out.println(s1==s2);
		
		s1 = s1 + "Manduri";
		System.out.println(s1==s2);
		
		String s3 = "Usha Manduri";
		System.out.println(s1 == s3);
		
		//------
		
		StringBuffer sb1 = new StringBuffer("Usha");
		StringBuffer sb2 = new StringBuffer("Usha");
		System.out.println(sb1==sb2);
		
		sb1 = sb1.append(" Manduri");
		System.out.println(sb1);
		
		StringBuffer sb3 = new StringBuffer("Usha Manduri");
		System.out.println(sb1==sb3);
		
		StringBuilder sb4 = new StringBuilder("Usha");
		StringBuilder sb5 = new StringBuilder("Usha");
		System.out.println(sb4.compareTo(sb5));
		
		sb4.insert(4, " Manduri");
		System.out.println(sb4);
		
		sb4.delete(4, 5);
		System.out.println(sb4);
		
		sb4.reverse();
		System.out.println(sb4);
		
		sb4.reverse();
		System.out.println(sb4);
		
		System.out.println(sb4.capacity());
		
		sb4.ensureCapacity(25);
		System.out.println(sb4.capacity());
		
	}

}

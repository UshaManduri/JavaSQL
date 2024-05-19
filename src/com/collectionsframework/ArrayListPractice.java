package com.collectionsframework;

import java.util.ArrayList;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Integer> arraylist = new ArrayList<>();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add(13);
		arraylist.add(14);
		arraylist.add(15);
		arraylist.add(16);
		
		System.out.println(arraylist);
		System.out.println(arraylist.size());
		System.out.println(arraylist.contains(3));
		System.out.println(arraylist.get(4));
	//	System.out.println(arraylist.getFirst()); ...........JDK-21

		for(Integer a: arraylist) {
			System.out.println(a);
		}
	}

}

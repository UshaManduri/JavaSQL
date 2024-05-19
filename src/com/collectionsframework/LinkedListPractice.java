package com.collectionsframework;

import java.util.*;

public class LinkedListPractice{
	public static void main(String[] args) {
		
	LinkedList<String> linkedlist = new LinkedList<>();
	linkedlist.add("A");
	linkedlist.add("B");
	linkedlist.add("C");
	
	System.out.println(linkedlist);
	System.out.println(linkedlist.getFirst());
	System.out.println(linkedlist.removeFirstOccurrence(linkedlist));
	
//	ArrayList<Integer> arraylist = new ArrayList<>();
	ArrayList<String> arraylist = new ArrayList<>();
	arraylist.add("1");
	arraylist.add("2");
	
	System.out.println(arraylist);
	
	linkedlist.addAll(arraylist);
	System.out.println(linkedlist);
	
	System.out.println(linkedlist.size());
	}
}	
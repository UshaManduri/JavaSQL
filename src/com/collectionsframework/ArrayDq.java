package com.collectionsframework;

import java.util.*;

public class ArrayDq {

	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<>();
		adq.add("A");
		adq.addFirst("B");
		adq.addLast("C");
		adq.add("D");
		System.out.println(adq);
		
		System.out.println(adq.peek());
		System.out.println(adq.peekFirst());
		System.out.println(adq.peekLast());
		
		System.out.println(adq.poll());
		System.out.println(adq);
	}

}

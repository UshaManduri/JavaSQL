package com.collectionsframework;

import java.util.*;

public class VectorsPractice {

	public static void main(String[] args) {
		
		Vector v = new Vector();
	//	Vector v = new Vector(90);
		System.out.println(v);
		v.add(1);
		v.add(2);
		v.add(3);
		v.add(4);
//		v.add(1,"A");
//		v.add(5);
//		v.add(6);
//		v.add(7);
//		v.add(8);
//		v.add(9);
//		v.add("Z");
		
		Vector v1 = new Vector();
		v1.add(101);
		v1.add(102);
		
		System.out.println(v1);
//		for(int i=0;i<v1.size();i++) {
//			v.add(v1.get(i));
//		}
		System.out.println(v);
		v.addAll(v1);
		v.addAll(0,v1);
		System.out.println(v.get(2));
		System.out.println(v.remove(0));
		System.out.println(v);

//		v.removeAll(v1);
//		v.clear();

		System.out.println(v.contains(1));
		System.out.println(v.contains(v1));
		System.out.println(v.containsAll(v1));
		
		v.set(0, "K");
		System.out.println(v.indexOf("K"));
		System.out.println(v.lastIndexOf(v1)); // here it's checking each value of v with all values of v1
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		System.out.println("size: " + v.size());
		System.out.println("capacity: "+v.capacity());
		System.out.println(v);
//		System.out.println("size: " + v.size());
//		System.out.println("capacity: " +v.capacity());

	}

}

package com.collectionsframework;

import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer,String> map = new Hashtable<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "D");
//		map.put(1, "K"); ------- 2nd input replaces the 1st value
		
		System.out.println(map);
		
		Set<Integer> keys = map.keySet();
		for(Integer k:keys) {
		//	System.out.println(k);
		//OR
			System.out.println(k +": "+map.get(k));
		}
		
		Collection<String> val = map.values();
		for(String vall : val);
		System.out.println(val);
		
		 System.out.println(map.get(4));
		 System.out.println(map.get(9));
		 
	}

}

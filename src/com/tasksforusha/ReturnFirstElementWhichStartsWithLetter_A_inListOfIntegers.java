package com.tasksforusha;

import java.util.*;

public class ReturnFirstElementWhichStartsWithLetter_A_inListOfIntegers {
	
//	public static void main(String[] args) {
//		
//		List<Integer> integers = Arrays.asList(111,222,333,44,55,6,7);
//		
//		String result = findReturnFirstElementWhichStartsWithLetter_A_inListOfIntegers(integers);
//		
//		if (result != null) {
//			System.out.println("first element starting with 'A' = " +result);
//		} else {
//			System.out.println("no element starting with 'A'.");
//		}
//	}
//	
//	public static String findReturnFirstElementWhichStartsWithLetter_A_inListOfIntegers(List<Integer> integers) {
//		for (Integer number : integers) {
//			String str = number.toString();
//			if(str.startsWith("A")) {
//				return str;
//			}
//		}
//		return null;
//	}
	
	
	// using Java 8 - Streams
	public static void main(String[] args) {
		List<String> s = Arrays.asList("Apple", "Banana", "Srinath" ,"Usha", "PottyBaby");
		Optional<String> first = s.stream()
				.filter(a -> a.startsWith("A"))
				.findFirst();
					
		if(first.isPresent()) {
			System.out.println("object: "+first.get());
		} else {
			System.out.println("no object.");
		}
	}
}

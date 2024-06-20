package com.tasksforusha;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountEachStringInAListOfStrings {
//	
//	public static void main(String[] args) {
//		List<String> list = Arrays.asList("A","B","C","D","E","F","G","H");
//		
//		//get count of each string
//		Map<String, Integer> stringCountMap = getStringCount(list);
//		
//		for(Map.Entry<String, Integer> entry : stringCountMap.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
//		}
//	}
//	
//	public static Map<String, Integer> getStringCount(List<String> strings){
//		Map<String, Integer> stringCountMap = new HashMap<>();
//		
//		for(String str : strings) {
//			if(stringCountMap.containsKey(stringCountMap)) {
//				stringCountMap.put(str, stringCountMap.get(str) + 1);
//			} else {
//				stringCountMap.put(str,1);
//			}
//		}
//		return stringCountMap;
//	}


	//String count using Java 8.
	public static void main(String[] args) {
		List<String> list = Arrays.asList("A", "B", "C","B","C","D", "A", "E", "B");
		Map<String,Long> stringCountMap = getStringCount(list);
		stringCountMap.forEach((key,value) -> System.out.println(key + " : "+value));
	}
	public static Map<String, Long> getStringCount (List<String> list){
		/*
		 * return list.stream() .collect(Collectors.groupingBy(s -> s,
		 * Collectors.counting()));
		 */
		return list.stream().collect(
				Collectors.groupingBy(Function.identity(), Collectors.counting())
				);
		
	}
}

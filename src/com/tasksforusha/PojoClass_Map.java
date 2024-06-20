package com.tasksforusha;

import java.util.*;

public class PojoClass_Map {

	public static void main(String[] args) {
		
		Person_PojoClass person = new Person_PojoClass("A", 10);
		
		Map<String, Person_PojoClass> map = mappingIt("k1" , person);
		System.out.println(map);

	}
	
	public static Map<String , Person_PojoClass> mappingIt(String key, Person_PojoClass person){
		Map<String, Person_PojoClass> i = new HashMap<>();
		i.put(key, person);
		return (i);
	}
}

package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		// Deceleration of map
		Map<String, Long> map1 = new HashMap<String, Long>();
		Map<String, Long> map2 = new LinkedHashMap<String, Long>();
		Map<String, Long> map3 = new TreeMap<String, Long>();
		
		// HashMap
		Map<String, Long> phoneBook = new HashMap<String, Long>();
		
		// add data
		phoneBook.put("John", 8989898989L);
		phoneBook.put("Mike", 1212121212L);
		phoneBook.put("Ava",  4545454545L);
		phoneBook.put("Marray",9909090909L);
		phoneBook.put("Emma", 8789787878L);
		phoneBook.put("Tony", 2323232323L);
		
		System.out.println(phoneBook);
		
		System.out.println("Find Ava's Number : "+phoneBook.get("Ava"));
		System.out.println("Find Tony's Number : "+phoneBook.get("Tony"));
		
		// remove data
		phoneBook.remove("Marray");
		
		// iterate map
		for(Map.Entry<String, Long> entry : phoneBook.entrySet()) {
			System.out.println("================");
			System.out.println(" Key : "+entry.getKey());
			System.out.println(" Value : "+entry.getValue());
		}

	}

}

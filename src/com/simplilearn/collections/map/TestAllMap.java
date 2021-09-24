package com.simplilearn.collections.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestAllMap {

	public static void main(String[] args) {
		
		Map<String, Double> mapOfItems = new HashMap<String, Double>();
		//add data
		mapOfItems.put("Oil", 9876.34);
		mapOfItems.put("Rice", 1876.34);
		mapOfItems.put("Mango", 976.34);
		mapOfItems.put("Apple", 276.34);
		mapOfItems.put("Orange", 3876.34);
		mapOfItems.put("Banana", 1876.34);
		
		System.out.println(mapOfItems);
		System.out.println("Rice Price :" + mapOfItems.get("Rice"));
		System.out.println("Orange Price :" + mapOfItems.get("Orange"));
		System.out.println("----------------");
		
		Map<String, Integer> mapOfCities = new LinkedHashMap<String, Integer>();
		//add data
		mapOfCities.put("Alaska", 393833);
		mapOfCities.put("New Maxico", 444656);
		mapOfCities.put("Virginia", 232433);
		mapOfCities.put("Kansas", 455983);
		
		System.out.println(mapOfCities);
		System.out.println("Alaska Zipcode :" + mapOfCities.get("Alaska"));
		System.out.println("Virginia Zipcode :" + mapOfCities.get("Virginia"));
		System.out.println("----------------");
		
		TreeMap<Integer, String> mapOfEmployee = new TreeMap<Integer, String>();
		//add map data
		mapOfEmployee.put(105, "Marry Smith");
		mapOfEmployee.put(101, "John Smith");
		mapOfEmployee.put(103, "Mike Smith");
		mapOfEmployee.put(102, "David Smith");
		mapOfEmployee.put(104, "Ava Smith");
		mapOfEmployee.put(106, "Mark Smith");
		
		System.out.println(mapOfEmployee);
		System.out.println(mapOfEmployee.descendingMap());
	}

}

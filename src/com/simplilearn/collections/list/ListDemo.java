package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {

		// List -> Order collection of data with duplicates elements.
		// List (interface) -> imp classes -> ArrayList, LinkedList , Vector , Stack
		
		//Deceleration
		List<String>  list1 = new ArrayList<String>(); // backed by dynamic array, not thread safe, read operations
		List<String>  list2 = new LinkedList<String>(); //backed by doubly linked list ,not thread safe, -> user for insert, delete,replace
		List<String>  list3 = new Vector<String>(); // legacy collection , thread safe
		List<String>  list4 = new Stack<String>();  // legacy collection , thread safe
		
		
		// List 
		List<String> namesList = new ArrayList<String>();
		
		namesList.add("Bob");
		namesList.add("Mike");
		namesList.add("John");
		namesList.add("William");
		namesList.add("Marry");
		namesList.add("Bob");
		
		System.out.println(namesList);
		
		//access data element from index
		System.out.println("The element at index 2 "+namesList.get(2));
		System.out.println("The element at index 3 "+namesList.get(3));
		
		System.out.println("--------------------");
		// add data at index
		namesList.add(2,"Ava");
		System.out.println("The element at index 2 "+namesList.get(2));
		System.out.println(namesList);
		
		System.out.println("--------------------");
		// remove data at index
		namesList.remove(2);
		System.out.println("The element at index 2 "+namesList.get(2));
		
		System.out.println("--------------------");
		// iterate list by counter for
		for (int index = 0; index < namesList.size(); index++) {
			System.out.println("The index : "+index + " & name "+namesList.get(index));
		}
		
		System.out.println("--------------------");
		// iterate list with enhanced loop
		for(String name : namesList) {
			System.out.println("The name : "+name);
		}
		
		System.out.println("--------------------");
		//iterate list with iterator
		Iterator<String> itr = namesList.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}

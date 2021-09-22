package com.simplilearn.collections.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class AllTypeOfListDemo {

	public static void main(String[] args) {

		// ArrayList
		List<String> listOfCompines = new ArrayList<String>();
		listOfCompines.add("DELL");
		listOfCompines.add("SIMPLILEARN");
		listOfCompines.add("WIPRO");
		listOfCompines.add("TCS");
		listOfCompines.add("DELL");

		System.out.println(listOfCompines);

		// LinkedList
		List<String> listOfCities = new LinkedList<String>();
		listOfCities.add("New York");
		listOfCities.add("LA");
		listOfCities.add("Hawai");
		listOfCities.add("New York");
		listOfCities.add("California");
		System.out.println(listOfCities);

		// Vector
		List<String> listOfFruits = new Vector<String>();
		listOfFruits.add("Apple");
		listOfFruits.add("Apple");
		listOfFruits.add("Banana");
		listOfFruits.add("Apple");
		listOfFruits.add("Mango");
		System.out.println(listOfFruits);

		// Stack
		List<String> listOfCoin = new Stack<String>();
		listOfCoin.add("1$");
		listOfCoin.add("3$");
		listOfCoin.add("5$");
		listOfCoin.add("1$");
		listOfCoin.add("4$");
		System.out.println(listOfCoin);
		
		
		List<Double> listOfPrice = new Stack<Double>();
		listOfPrice.add(5466.56);
		listOfPrice.add(458956.56);
		listOfPrice.add(4354.54);
		listOfPrice.add(934.34);
		listOfPrice.add(98945.56);
		System.out.println(listOfPrice);

	}

}

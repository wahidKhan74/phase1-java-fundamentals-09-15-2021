package com.simplilearn.collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		// Set is child interface in Collection
		// Set do not store duplicate values
		// Implementation class : HashSet , LinkendHashSet, TreeSet.

		// Delecration
		Set<String> set1 = new HashSet<String>(); // It allows unique elements, does not preserve insertion order
		Set<String> set2 = new LinkedHashSet<String>(); // It allows unique elements, allows preserve insertion order.
		Set<String> set3 = new TreeSet<String>(); // It allows unique elements , allows rearrangement as ascending or
													// descending order

		// HashSet
		Set<String> setOfUniqueCompanies = new HashSet<String>();
		// add data in set
		setOfUniqueCompanies.add("DELL");
		setOfUniqueCompanies.add("CISCO");
		setOfUniqueCompanies.add("SIMPLILEARN");
		setOfUniqueCompanies.add("WIPRO");
		setOfUniqueCompanies.add("CISCO"); // insertion response ->false
		setOfUniqueCompanies.add("DELL"); // insertion response -> false

		// print set
		System.out.println(setOfUniqueCompanies);

		// iterate over set
		for (String comp : setOfUniqueCompanies) {
			System.out.println(comp);
		}
		System.out.println("-------------");

		// LinkedHashSet
		Set<String> setOfUniqueBrands = new LinkedHashSet<String>();
		// add data inot set
		setOfUniqueBrands.add("NIKE");
		setOfUniqueBrands.add("ADIDAS");
		setOfUniqueBrands.add("PUMA");
		setOfUniqueBrands.add("ASICS");
		setOfUniqueBrands.add("NIKE");

		// print set
		System.out.println(setOfUniqueBrands);
		// iterate over set
		for (String brand : setOfUniqueBrands) {
			System.out.println(brand);
		}
		System.out.println("-------------");

		// TreeSet
		TreeSet<String> setOfNames = new TreeSet<String>();
		setOfNames.add("John");
		setOfNames.add("Mike");
		setOfNames.add("Lisa");
		setOfNames.add("William");
		setOfNames.add("John");
		setOfNames.add("Bob");
		setOfNames.add("John");

		// print set
		System.out.println(setOfNames);
		System.out.println(setOfNames.descendingSet());
	}

}

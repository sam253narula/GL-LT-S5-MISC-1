package com.f.streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author Samarth Narula
 *
 *         Stream Intermediate Operations: Distinct Map Filter Sorted Limit
 * 
 *         Stream Terminal Operations: Count Collect forEach
 */
public class A_StreamOpDistinctAndForEachDemo {

	public static void main(String[] args) {
		// Distinct operations
		List<String> names = new ArrayList<String>();
		names.add("Samarth");
		names.add("Harshit");
		names.add("Samarth");
		names.add("Ankit");
		System.out.println(names);
		Stream<String> namesStream = names.stream();
	//	System.out.println(namesStream);
	//	namesStream.forEach(name -> System.out.println(name + " "));
		System.out.println("Removing duplicates");
		Stream<String> distinctNames = namesStream.distinct();
		distinctNames.forEach(name -> System.out.println(name + " "));
	}
}

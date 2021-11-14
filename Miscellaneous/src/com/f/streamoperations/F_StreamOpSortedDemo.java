package com.f.streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class F_StreamOpSortedDemo {

	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		names.add("Samarth");
		names.add("Harshit");
		names.add("Samarth");
		names.add("Ankit");
		Stream<String> namesStream = names.stream();
		Stream<String> sortedNamesStream = namesStream.distinct().sorted();
		sortedNamesStream.forEach(num -> System.out.println(num));
	}
}

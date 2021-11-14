package com.combinedStreamOps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class D_SortedInReverseOrderAndPrintNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sahil", "Saif", "Kshitij");
		names.stream().sorted(Comparator.reverseOrder()).forEach(sortedName -> System.out.println(sortedName));
		System.out.println("Way of Sorting used before java 8 Below: ");
		names.sort(Comparator.reverseOrder());
		System.out.println(names);

	}

}

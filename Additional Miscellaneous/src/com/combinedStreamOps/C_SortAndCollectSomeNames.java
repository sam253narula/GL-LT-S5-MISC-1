package com.combinedStreamOps;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C_SortAndCollectSomeNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sahil", "Saif", "Kshitij");
		List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
		sortedNames.forEach(sortedName -> System.out.println(sortedName));
	}

}

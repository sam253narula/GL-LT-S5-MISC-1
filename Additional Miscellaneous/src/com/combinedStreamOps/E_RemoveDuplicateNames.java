package com.combinedStreamOps;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class E_RemoveDuplicateNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Samarth","Saif","Harshit","Sagar","Saif");
		Set<String> uniqueNames = names.stream().collect(Collectors.toSet());
		uniqueNames.forEach(uniqueName -> System.out.println(uniqueName));
	}

}

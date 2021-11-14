package com.combinedStreamOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class B_FilterAndCollectSomeNames {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sahil", "Saif", "Kshitij");
		List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
		result.forEach(nameWithFirstCharAsS -> System.out.println(nameWithFirstCharAsS));
	}

}

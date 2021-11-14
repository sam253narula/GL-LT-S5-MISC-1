package com.combinedStreamOps;

import java.util.Arrays;
import java.util.List;

public class F_FindSquareRootAndPrint {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 3, 4, 5);
		number.stream().map(x -> x * x).forEach(y -> System.out.println(y));
	}

}

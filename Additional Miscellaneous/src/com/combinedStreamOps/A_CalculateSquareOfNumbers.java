package com.combinedStreamOps;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A_CalculateSquareOfNumbers {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> squareOfNumbers = number.stream().map(x->x*x).collect(Collectors.toList());
		// Below forEach() method is not part of stream java.util.stream
		squareOfNumbers.forEach(printMe -> System.out.println(printMe));
//		number.stream().map(x -> x * x).collect(Collectors.toList()).stream().filter(even -> even % 2 == 0)
//		.forEach(evenNumbers -> System.out.println(evenNumbers));
	}

}

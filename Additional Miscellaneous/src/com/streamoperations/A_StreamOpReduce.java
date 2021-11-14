package com.streamoperations;

import java.util.Arrays;
import java.util.List;

// Get all even numbers and add it and return the resultant number
public class A_StreamOpReduce {

	public static void main(String[] args) {
		// reduce: The reduce method is used to reduce the elements of a stream to a
		// single value.
		// The reduce method takes a BinaryOperator as a parameter.
		// Here ans variable is assigned 0 as the initial value and i is added to it .
		List<Integer> numbers = Arrays.asList(2, 3, 4, 5);
		int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans, x) -> {
			return ans + x;
		});
		System.out.println(even);
	}

}

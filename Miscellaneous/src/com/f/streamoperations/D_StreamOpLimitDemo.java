package com.f.streamoperations;

import java.util.stream.Stream;

public class D_StreamOpLimitDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 10, 11, 8, 9);
		Stream<Integer> truncatedNumbers = numbers.limit(6);
		truncatedNumbers.forEach(first5Numbers -> System.out.println(first5Numbers));
	}

}

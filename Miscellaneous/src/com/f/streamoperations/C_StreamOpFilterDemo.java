package com.f.streamoperations;

import java.util.stream.Stream;

// Filter Operation Demo
public class C_StreamOpFilterDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 8, 9);
		Stream<Integer> evenNumbers = numbers.filter(num -> num % 2 == 0);
		evenNumbers.forEach(num -> System.out.println(num));
	}
}

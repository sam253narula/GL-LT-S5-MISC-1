package com.f.streamoperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class G_StreamOpCollectDemo {

	public static void main(String[] args) {

		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 8, 9);

		// Convert the above stream of numbers into the list of number
		List<Integer> numberList = numbers.collect(Collectors.toList());
		System.out.println(numberList);

	}

}

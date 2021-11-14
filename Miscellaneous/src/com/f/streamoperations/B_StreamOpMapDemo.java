package com.f.streamoperations;

import java.util.function.Function;
import java.util.stream.Stream;

// MAP Operation demo
public class B_StreamOpMapDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5);
		// Stream<Integer> squaredNumbers =
//		Function<Integer, Integer>  fun = (number) -> {
//			return number*number;
//		};
		
		numbers.map(num -> num * num).forEach(num -> System.out.println(num));

	}

}

package com.f.streamoperations;

import java.util.stream.Stream;

public class E_StreamOpCountDemo {

	public static void main(String[] args) {
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 8, 9);
		System.out.println(numbers.count());
		/* Below line will not work, becz on the above line we have already called the terminal operation which is count,
		so the stream is already terminated 
		*/
		//numbers.forEach(num -> System.out.println(num));
	}

}

package com.f.streamoperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class E_StreamOpCountDemo {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<Integer>();
		nums.add(1);
		nums.add(2);
//		Stream<Integer> stream = nums.stream();
//		stream.forEach(num -> System.out.println(num));
//		Stream<Integer> countStream = nums.stream();
//		long count = countStream.count();
//		long count = nums.stream().count();
//		System.out.println("count"+count);
//		nums.stream().forEach(n -> System.out.println(n));
		
		
		Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 8, 9);
		System.out.println(numbers.count());
		/* Below line will not work, becz on the above line we have already called the terminal operation which is count,
		so the stream is already terminated 
		*/
		//numbers.forEach(num -> System.out.println(num));
		
	}

}

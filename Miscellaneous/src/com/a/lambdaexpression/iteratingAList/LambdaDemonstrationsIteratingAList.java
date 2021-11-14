package com.a.lambdaexpression.iteratingAList;

import java.util.ArrayList;
import java.util.List;

public class LambdaDemonstrationsIteratingAList {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);

		System.out.println("Before Java 1.8 Lambda expression: Iterating a list");
		for (Integer integer : numbers) {
			System.out.print(integer + " ");
		}
		System.out.println();
		System.out.println("Now Iterating the list with lambda Expression");
		numbers.forEach(n -> System.out.print(n + " "));

	}
}

package com.b.lambdaexpression.executingMethodWithNoArgs;

import java.util.Random;

// There is no args : () -> {// Business logic}
public class LambdaMethodWithNoArgsDemo {

	public static void main(String[] args) {
		System.out.println("Before Java 8");
		MathematicalNumber mathematicalNumber = new MathematicalNumber() {
			Random random = new Random();
			@Override
			public void randomNumber() {
				System.out.println(random.nextInt());
			}
		};
		mathematicalNumber.randomNumber();
		System.out.println();
		System.out.println("Now with Java 8");
		
		MathematicalNumber mathematicalNumber2 = () -> {
			Random random = new Random();
			System.out.println(random.nextInt());
		};
		
		mathematicalNumber2.randomNumber();
	}
}

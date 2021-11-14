package com.c.lambdaexpression.executingMethodWithArgs;

public class LambdaMethodWithArgsDemo {

	public static void main(String[] args) {
		System.out.println("Before Java 8");
		CalculateSquare calculateSquare = new CalculateSquare() {

			@Override
			public int squareOf(int num) {
				return num * num;
			}
		};
		System.out.println("Square of 5 is " + calculateSquare.squareOf(5));
		System.out.println();
		System.out.println("Now With Lambda Expression");
		
		CalculateSquare calculateSquare2 = (num) -> num * num;
		
		System.out.println("Square of 5 is " + calculateSquare2.squareOf(5));

	}
}

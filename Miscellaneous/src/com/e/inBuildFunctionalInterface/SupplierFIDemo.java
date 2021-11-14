package com.e.inBuildFunctionalInterface;

import java.util.function.Supplier;

public class SupplierFIDemo {

	public static void main(String[] args) {
		Supplier<String> supplier = () -> "I dont need input but I provide output";
		System.out.println(supplier.get());
	}

}

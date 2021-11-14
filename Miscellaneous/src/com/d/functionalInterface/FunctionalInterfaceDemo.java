package com.d.functionalInterface;
// Functional Interface has only one abstarct method and can have any number of default methods
public class FunctionalInterfaceDemo {
	
	public static void main(String[] args) {
		CovidImmunable covidImmunable = () -> System.out.println("I am Vaccinated now");
		covidImmunable.getVaccine();
	}
}

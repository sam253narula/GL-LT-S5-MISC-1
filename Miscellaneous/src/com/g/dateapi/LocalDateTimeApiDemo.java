package com.g.dateapi;

import java.time.LocalDateTime;

public class LocalDateTimeApiDemo {

	public static void main(String[] args) {
		// Get Current date and time
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println(currentDateTime);
		System.out.println(currentDateTime.getMonth());

		// Add few days in current date
		LocalDateTime futureTime = currentDateTime.plusDays(300);
		System.out.println("futureTime " + futureTime);
		System.out.println("futureTime Month " + futureTime.getMonth());

		// Find the local date time for some past date/ random date
		LocalDateTime localDateTime = LocalDateTime.of(1995, 8, 11, 3, 15);
		System.out.println("localDateTime " + localDateTime);
	}

}

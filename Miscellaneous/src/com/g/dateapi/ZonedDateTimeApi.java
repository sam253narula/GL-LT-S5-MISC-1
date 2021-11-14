package com.g.dateapi;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

// For all zoneID refer : https://docs.oracle.com/javase/8/docs/api/java/time/ZoneId.html
public class ZonedDateTimeApi {

	public static void main(String[] args) {

		ZonedDateTime currentTime = ZonedDateTime.now();
		System.out.println(currentTime);
		LocalDateTime randomTime = LocalDateTime.of(1990, 8, 12, 2, 15);
		ZoneId zoneId = ZoneId.of("Europe/Paris");
		ZonedDateTime zonedDateTime = ZonedDateTime.of(randomTime, zoneId);
		System.out.println(zonedDateTime);
	}

}

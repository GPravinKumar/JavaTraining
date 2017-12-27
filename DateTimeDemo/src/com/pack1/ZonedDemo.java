package com.pack1;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.chrono.HijrahDate;

public class ZonedDemo {

	public static void main(String[] args) {

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("default zone " + ldt);

		ZonedDateTime Tokyo = ldt.atZone(ZoneId.of("Asia/Tokyo"));
		System.out.println("Tokyo Zone : " + Tokyo);

		HijrahDate ramadan = HijrahDate.now();
		System.out.println(ramadan);

	}

}

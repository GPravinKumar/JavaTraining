package com.pack1;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ConversionDemo {
	public static void main(String[] args) {

		// convert instant into local date
		Instant ins = Instant.now();
		ZonedDateTime zt = ins.atZone(ZoneId.systemDefault());
		LocalDate dt = zt.toLocalDate();
		System.out.println("int to local : " + dt);

		// convert local date into java.sql.Date
		LocalDate ldt = LocalDate.now();
		java.sql.Date sqldt = Date.valueOf(ldt);
		System.out.println("SQL dt : " + sqldt);

		// convert java.ssl.Date into local date
		LocalDate ldt2 = sqldt.toLocalDate();
		System.out.println("Local date : " + ldt2);
	}

}

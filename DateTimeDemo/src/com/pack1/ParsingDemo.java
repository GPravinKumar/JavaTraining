package com.pack1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ParsingDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
		
		//convert string into date
		String str = "12-Feb-2014";
		LocalDate dt = LocalDate.parse(str,df);
		System.out.println(dt);
		
		//convert local date into string
		LocalDate dt2 = LocalDate.of(2016, 03, 23);
		System.out.println(dt2.format(df));

	}

}

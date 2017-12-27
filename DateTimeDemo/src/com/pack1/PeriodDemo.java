package com.pack1;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodDemo {
	
	public static void main(String[] args){
		LocalDate d1 = LocalDate.of(2016, 3, 5);
		LocalDate d2 = LocalDate.of(2017, 12, 10);
		Period p= Period.between(d1, d2);
		System.out.println(p.getDays() + " days");
		System.out.println(p.getMonths() + " months");
		System.out.println(p.getYears()+ " Years");
		
		LocalTime t1 = LocalTime.of(11, 15);
		LocalTime t2 = LocalTime.now();
		Duration d = Duration.between(t1, t2);
		System.out.println(d.getSeconds());
		
	}

}

package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class Aggdemo {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(11);
		lst.add(92);
		lst.add(83);
		lst.add(47);
		lst.add(59);
		lst.add(66);
		
		long size=lst.stream().count();
		System.out.println(size);
		
		long size1=lst.stream().filter(i->i>=50).count();
		System.out.println("number of elements greater than 50 "+size1);
		
		OptionalInt opt1= lst.stream().mapToInt(i->i).min();
		System.out.println("minimum value "+opt1.getAsInt());
		
		OptionalInt opt2= lst.stream().mapToInt(i->i).max();
		System.out.println("maximum value "+opt2.getAsInt());
		
		int sum= lst.stream().mapToInt(i->i).sum();
		System.out.println("summing "+sum);
		
		OptionalDouble opt3= lst.stream().mapToInt(i->i).average();
		System.out.println("average "+opt3.getAsDouble());

	}

}

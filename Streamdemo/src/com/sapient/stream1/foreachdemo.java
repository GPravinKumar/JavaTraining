package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class foreachdemo {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		System.out.println("using method refernce");
		lst.stream().forEach(System.out::println);
		
		System.out.println("using lambda expression");
		lst.stream().forEach(s->System.out.println(s));
	}

}

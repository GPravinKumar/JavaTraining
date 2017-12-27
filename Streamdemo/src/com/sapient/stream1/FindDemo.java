package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindDemo {

	public static void main(String[] args) {
		
		List<String> lst1=Arrays.asList("afsal","apravin","sbala","sganesg","sjaydeep");
		Optional<String> opt= lst1.stream().filter(s->s.startsWith("a")).findAny();
		System.out.println(opt);
		if(opt.isPresent())
			System.out.println("element found");
		else
			System.out.println("not found");
		
		
	}

}

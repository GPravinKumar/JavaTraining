package com.sapient.stream1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Flatmapdemo {

	public static void main(String[] args) {
		
		List<String> lst1=Arrays.asList("afsal","pravin","bala");
		List<String> lst2=Arrays.asList("gopal","ganesh","jaydeep");
		Stream<List<String>> s=Stream.of(lst1,lst2);
		Stream<String> s2= s.flatMap(lst->lst.stream());
		s2.forEach(System.out::println);

	}

}

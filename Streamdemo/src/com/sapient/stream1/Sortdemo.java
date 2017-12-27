package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Sortdemo {

	public static void main(String[] args) {
		
		List<String> lst=new ArrayList<String>();
		lst.add("afsal");
		lst.add("praveen");
		lst.add("bala");
		lst.add("babu");
		lst.add("akshay");
		lst.add("shafad");
		
		System.out.println("ascending------------");
		Stream<String> s= lst.stream().sorted();
		s.forEach(System.out::println);
		
		System.out.println("descending--------------");
		lst.stream().sorted((i,j)->j.compareTo(i)).forEach(System.out::println);
		
	}

}

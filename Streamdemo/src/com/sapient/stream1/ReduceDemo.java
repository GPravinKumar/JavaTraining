package com.sapient.stream1;

import java.util.ArrayList;
import java.util.List;

public class ReduceDemo {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<Integer>();
		lst.add(11);
		lst.add(92);
		lst.add(83);
		lst.add(47);
		lst.add(59);
		lst.add(66);
		
		Integer res= lst.stream().map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements "+res);
		
		Integer res1= lst.stream().filter(i->i%2==0). map(i->i).reduce(0,(x,y)->x+y);
		System.out.println("sum of all elements divisible by two "+res1);


	}

}

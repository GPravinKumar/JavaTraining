package com.sapient.pack1;

import java.util.Arrays;
import java.util.List;

public class ListArrayConversion {

	public static void main(String[] args) {
		Integer[] arr = {5,10,20,30,50};
		List<Integer> lst = (List<Integer>)Arrays.asList(arr);
		System.out.println(lst);
		

	}

}

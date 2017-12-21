package com.sapient.pack1;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.LinkedList;
import java.util.List;
//import java.util.Vector;

public class ListOperations {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();   // all three will give same result but only the 
		//List<String> lst = new LinkedList<String>();//background process varies
		//List<String> lst = new Vector<String>();
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		lst.add("peter");
		System.out.println(lst);
		
		lst.add(2, "vikas");      //add value in between
		System.out.println(lst);
		
		System.out.println(lst.remove(3));// removes value at index 3
		System.out.println(lst);
		
		System.out.println(lst.remove("peter"));// removes the first instance of peter
		System.out.println(lst);
		
		System.out.println("size " + lst.size());//gives the size of list
		
		System.out.println("get at idx 2 " + lst.get(2));//gets value at that index 2
		
		List<String> lst2 = new ArrayList<>();
		lst2.add("varun");
		lst2.add("tarun");
		lst2.addAll(lst);                 //copies all elements from lst to lst2
		System.out.println(lst2);
		
		System.out.println("Descending Order");
		Collections.sort(lst, Collections.reverseOrder());
		System.out.println(lst);

	}

}

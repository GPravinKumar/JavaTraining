package com.sapient.pack1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListUsingGeneric {

	public static void main(String[] args) {
		List<String> lst = new ArrayList<String>();//generic <String>
		lst.add("ram");
		lst.add("peter");
		lst.add("amar");
		lst.add("birbal");
		lst.add("sam");
		
		Collections.sort(lst);
		
		System.out.println("using advanced for loop");
		for(String str: lst){  //iterate using advanced for loop
			System.out.print(str+ " ");
		}
		
		System.out.println("\nusing iterator");
		Iterator<String> it = lst.iterator(); // iterate list using iterator
		while (it.hasNext()){
			System.out.print(it.next()+ " ");
		}
		System.out.println("\nusing list iterator iterate in forward");
		ListIterator<String> it2 = lst.listIterator();
		while (it2.hasNext()){
			System.out.print(it2.next());
		}
		System.out.println("\nusing list iterator iterate in reverse");
		while (it2.hasPrevious()){
			System.out.print(it2.previous());
		}

	}

}

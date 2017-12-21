package com.pack1;

import java.util.HashSet;
//import java.util.LinkedHashSet;
import java.util.Set;
//import java.util.TreeSet;

public class SetDemo1 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>(); //Hash set doesnot maintain order
		//Set<String> set = new LinkedHashSet<String>();//LinkedHash set maintains the order of insertion
		//Set<String> set = new TreeSet<String>();// TreeSet sorts the inserted value
		set.add("ram");
		set.add("tom");
		set.add("peter");
		set.add("surya");
		set.add("boon");
		set.add("boon"); //same values can't be added in the set 
		
		for(String str: set){
			System.out.println(str);
		}

	}

}

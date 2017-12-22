package com.map;

import java.util.Collection;
//import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
//import java.util.TreeMap;


public class IterateElementsInMap {

	public static void main(String[] args) {

		Map<Integer, String> map = new Hashtable<Integer, String>();
		//Map<Integer, String> map = new HashMap<Integer, String>();
		//Map<Integer, String> map = new HashTree<Integer, String>();
		map.put(1005, "ram");
		map.put(1003, "tom");
		map.put(1007, "peter");
		map.put(1001, "raj");
		map.put(1002, "joy");
		map.put(1003, "varun");//replace the duplicate
		//map.put(null, "raja");//hashmap can have null treemap & Hashtable can't have null
		map.put(2005, "ram");
		map.put(2001, "ram");
		map.put(200000003, "ram");

		System.out.println("iterating using keyset()");
		Set<Integer> set = map.keySet();
		for (Integer key : set) {
			System.out.println(key + " " + map.get(key));
		}
		
		System.out.println("iterating using values()");
		Collection<String> col = map.values();
		for(String str: col){
			System.out.println(str);
		}
		System.out.println("iterating using entrySet()");
		Set<Entry<Integer, String>> entries = map.entrySet();
		for(Entry e: entries){
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}

package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.pack1.Emp;

public class MapDemo1 {

	public static void main(String[] args) {
		
		Emp e1 = new Emp(1005, "ram",65000);
		Emp e2 = new Emp(1002, "sam",50000);
		Emp e3 = new Emp(1003, "tom",60000);
		Map<Integer, Emp> map= new HashMap<Integer,Emp>();
		map.put(1005, e1);
		map.put(1002, e2);
		map.put(1003, e3);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Employee Id : ");
		int eid=scan.nextInt();
		if(map.containsKey(eid))
			System.out.println(map.get(eid));
		else
			System.out.println("Not found");
		scan.close();
		

	}

}

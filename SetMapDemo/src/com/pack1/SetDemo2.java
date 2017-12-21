package com.pack1;

import java.util.HashSet;
import java.util.Set;


public class SetDemo2 {

	public static void main(String[] args) {
		Emp e1 = new Emp(1005, "ram",65000);
		Emp e2 = new Emp(1002, "sam",50000);
		Emp e3 = new Emp(1003, "tom",60000);
		Emp e4 = new Emp(1004, "ravi",35000);
		Emp e5 = new Emp(1001, "raja",45000);
		Emp e6 = new Emp(1001, "raja",45000);
		Emp e7=e2;
		
		Set<Emp> set = new HashSet<Emp>();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);//ignored based on the content after overriding hashcode() and equals()
		set.add(e7);//ignored based on the reference
		
		for(Emp emp: set){
			System.out.println(emp);
		}

	}

}

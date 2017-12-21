package com.sapient.pack2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {

	public static void main(String[] args) {
		
		List<Emp> lst1 = new ArrayList<Emp>();
		Emp e1 = new Emp(1005, "ram",65000);
		Emp e2 = new Emp(1002, "sam",50000);
		Emp e3 = new Emp(1003, "tom",60000);
		Emp e4 = new Emp(1004, "ravi",35000);
		Emp e5 = new Emp(1001, "raja",45000);
		
		lst1.add(e1);
		lst1.add(e2);
		lst1.add(e3);
		lst1.add(e4);
		lst1.add(e5);
		
		Collections.sort(lst1);                    //Sort based on comparable
		System.out.println("Sort based on empId---------------------");
		for(Emp emp: lst1){
			System.out.println(emp);
		}
		
		Collections.sort(lst1, new NameComparator());//sort based on name comparator
		System.out.println("Sort based on empName-------------------");
		for(Emp emp: lst1){
			System.out.println(emp);
		}
		
		Collections.sort(lst1, new NameComparator());//sort based on salary comparator
		System.out.println("Sort based on Salary---------------------");
		for(Emp emp: lst1){
			System.out.println(emp);
		}

	}

}

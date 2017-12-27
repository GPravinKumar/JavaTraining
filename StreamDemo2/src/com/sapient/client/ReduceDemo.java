package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class ReduceDemo {

	public static void main(String[] args) {
		
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(new Emp(1002,"afsal",650000));
		lst.add(new Emp(1003,"babu",360000));
		lst.add(new Emp(1004,"pravin",480000));
		lst.add(new Emp(1001,"jaydeep",530000));
		lst.add(new Emp(1005,"ganesh",610000));
		
		double sal=lst.stream().map(e->e.getEsal()).reduce(0.0,(x,y)->x+y);
		System.out.println("total salary = "+sal);
		
		//sum
		double sal1=lst.stream().mapToDouble(e->e.getEsal()).sum();
		System.out.println("total salary = "+sal1);
		

	}

}

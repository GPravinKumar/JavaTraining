package com.sapient.client;

import java.util.ArrayList;
import java.util.List;

import com.sapient.vo.Emp;

public class CountDemo {

	public static void main(String[] args) {
		
		List<Emp> lst=new ArrayList<Emp>();
		lst.add(new Emp(1002,"afsal",650000));
		lst.add(new Emp(1003,"babu",360000));
		lst.add(new Emp(1004,"pravin",480000));
		lst.add(new Emp(1001,"jaydeep",530000));
		lst.add(new Emp(1005,"ganesh",610000));
		
		long size=lst.stream().filter(e->e.getEsal()>=25000).count();
		System.out.println("employees have salary greater than 25000 is "+size);
		
		long size1=lst.stream().count();
		System.out.println("employees have salary greater than 25000 is "+size1);

	}

}

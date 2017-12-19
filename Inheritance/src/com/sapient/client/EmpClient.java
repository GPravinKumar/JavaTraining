package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {
	
	public static void main(String[] args){
		Emp e1 = new Emp(1001,"rama");
		Emp e2 = new Emp(1002,"amar");
		Emp e3 = new Emp(1001,"rama");
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e1.equals(e2));
		System.out.println(e1.equals(e3));
		
		e1 = null;
		e2 = null;
		System.gc();
	}
	

}

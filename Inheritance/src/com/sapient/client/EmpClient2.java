package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient2 {

	public static void main(String[] args) throws CloneNotSupportedException {
		Emp e1 = new Emp(1001, "rama");
		Emp e2 = e1.clone();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1 == e2);

	}

}

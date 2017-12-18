package com.sapient.client;

import com.sapient.service.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Emp emp = new Emp();
		try {
			emp.setName("Pravin");
			emp.setAge(22);
			System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getBunit() );
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}

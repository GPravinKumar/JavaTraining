package com.sapient.create;

public class EmpClient {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cls = Class.forName("com.sapient.create.Emp");
		Emp emp = (Emp)cls.newInstance();
		emp.display();

	}

}

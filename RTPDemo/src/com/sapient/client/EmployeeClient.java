package com.sapient.client;

import com.sapient.service.Employee;
import com.sapient.service.EmployeeContract;
import com.sapient.service.EmployeeOnroll;

public class EmployeeClient {
	public static void main(String[] args) {
		Employee[] arr = new Employee[4];
		arr[0] = new EmployeeContract(1001, "ram", 3500, 100);
		arr[1] = new EmployeeContract(1002, "tom", 2500, 50);
		arr[2] = new EmployeeOnroll(1003, "ravi", 50000, 20000, 10000);
		arr[3] = new EmployeeOnroll(1004, "raja", 60000, 17000, 10000);
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		System.out.printf("%10s|%20s|%10s|%10s|%10s|%10s|%10s|%20s|\n", "EID", "ENAME", "SALARY", "DA", "PF", "DAYS",
				"TOTAL SAL", "EMP TYPE");
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
		for (Employee emp : arr) {
			emp.display();
		}
		System.out.println(
				"-----------------------------------------------------------------------------------------------------------");
	}

}

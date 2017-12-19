package com.sapient.service;

public class EmployeeContract extends Employee {

	private int days;

	public EmployeeContract(int empId, String ename, int sal, int days) {
		super(empId, ename, sal);
		this.days = days;
	}

	@Override
	public int calcSal() {
		int sal = getSal();
		int totSal = sal * days;
		return totSal;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%32d|%10d|%20s|\n", days, calcSal(), getClass().getSimpleName());
	}

}

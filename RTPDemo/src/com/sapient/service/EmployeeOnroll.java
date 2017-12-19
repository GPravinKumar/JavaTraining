package com.sapient.service;

public class EmployeeOnroll extends Employee {
	private int da, pf;

	public EmployeeOnroll(int empId, String ename, int sal, int da, int pf) {
		super(empId, ename, sal);
		this.da = da;
		this.pf = pf;
	}

	@Override
	public int calcSal() {
		int sal = getSal();
		int totSal = sal + da - pf;
		return totSal;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%11d|%10d|%20d|%20s|\n", da, pf, calcSal(), getClass().getSimpleName());
	}
}

package com.sapient.service;

public abstract class Employee {
	private int empId;
	private String ename;
	private int sal;

	// constructor
	public Employee(int empId, String ename, int sal) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.sal = sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void display() {
		System.out.printf("%10d|%20s|%10d|", empId, ename, sal);
	}

	public abstract int calcSal();

}

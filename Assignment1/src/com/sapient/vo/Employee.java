package com.sapient.vo;

import java.time.LocalDate;

public class Employee implements Comparable<Employee> {

	private int empId;
	private String empName;
	private double sal;
	private int dept_id;
	private LocalDate doj;

	public Employee(int empId, String empName, double sal, int dept_id, LocalDate doj) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.sal = sal;
		this.dept_id = dept_id;
		this.doj = doj;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public int getEmpId() {
		return empId;
	}

	public String getEmpName() {
		return empName;
	}

	public double getSal() {
		return sal;
	}

	public int getDept_id() {
		return dept_id;
	}

	public LocalDate getDoj() {
		return doj;
	}

	@Override
	public String toString() {

		return empId + " " + empName + " " + sal + " " + dept_id + " " + doj;
	}

	@Override
	public int compareTo(Employee emp) {
		Integer e1 = this.empId;
		Integer e2 = emp.empId;
		return e1.compareTo(e2);
	}

}

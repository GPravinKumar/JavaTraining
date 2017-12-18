package com.sapient.service;

public class MulTable {

	private int num;

	public MulTable(int num) throws Exception {
		if (num <= 0)
			throw new Exception("Number must be greater than 0");
		this.num = num;
	}

	public void display() {
		showTable(1, 10);
	}

	public void display(int rows) throws Exception {
		if (rows > 0)
			showTable(1, rows);
		else throw new Exception("Entered Number should be positive");
	}

	public void display(int start, int end) throws Exception {
		if (end > 0 && start > 0 && end > start)
			showTable(start, end);
		else throw new Exception("Entered Number should be positive and end must be greater than start");
	}

	private void showTable(int start, int end) {
		for (int i = start; i <= end; i++)
			System.out.println(i + " * " + num + " = " + (num * i));
	}

}

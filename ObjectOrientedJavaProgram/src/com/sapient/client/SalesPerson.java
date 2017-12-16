package com.sapient.client;

public class SalesPerson {

	public int id;
	public String name;
	public double samt;
	public static int noOfPersons;
	public static double tsales;

	public SalesPerson(int id, String name, double samt) {
		super();
		this.id = id;
		this.name = name;
		this.samt = samt;
		++noOfPersons;
		tsales = tsales + this.samt;
	}

	public double calcSalesComm() {
		double sc = 0;
		if (samt >= 50000)
			sc = samt * 0.1;
		else if (samt >= 20000 && samt < 50000)
			sc = samt * 0.05;
		else
			sc = samt * 0.03;
		return sc;
	}

	public void display() {
		System.out.println(id + " " + name + " " + samt + " " + calcSalesComm());
		System.out.println("--------------------------------");
	}

}

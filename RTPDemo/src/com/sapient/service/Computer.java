package com.sapient.service;

public class Computer extends Product{
	
	private String hdd;

	public Computer(int prodId, String prodName, double price, String hdd) {
		super(prodId, prodName, price);
		this.hdd = hdd;
	}

	@Override
	public String isExpensive() {
		double price = getPrice();
		String res = null;
		if(price >= 50000)
			res = "expensive";
		else if (price>=30000)
			res = "average";
		else
			res = "cheap";
		return res;
	}

	@Override
	public void display() {
		super.display();
		System.out.printf("%10s|%31s|%20s|\n",hdd,isExpensive(),getClass().getSimpleName());
	}
	

}

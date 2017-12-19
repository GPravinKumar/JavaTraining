package com.sapient.service;

public abstract class Product {
	
	private int prodId;
	private String prodName;
	private double price;
	//constructor
	public Product(int prodId, String prodName, double price) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
	public void display(){
		System.out.printf("%10d|%20s|%10.2f|",prodId,prodName,price);
	}
	
	public abstract String isExpensive();

}

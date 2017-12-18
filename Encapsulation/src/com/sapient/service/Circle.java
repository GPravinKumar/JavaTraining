package com.sapient.service;

public class Circle {
	
	private double rad;
	
	public Circle(double rad) throws Exception {
		super();
		if(rad <= 0)
			throw new Exception("radius must be greater than zero");
		this.rad = rad;
	}

	public double area(){
		double area = Math.PI * rad * rad;
		return area;
	}
	
	public double peri(){
		double peri = Math.PI * 2 * rad;
		return peri;
	}

}
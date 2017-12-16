package com.sapient.service;

public class Circle {
	
	public double rad;
	
	public double area(){
		double area = Math.PI * rad * rad;
		return area;
	}
	
	public double peri(){
		double peri = Math.PI * 2 * rad;
		return peri;
	}

}

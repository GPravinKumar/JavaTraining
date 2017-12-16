package com.sapient.service;

public class Interest {

	public double amt;
	public int yrs;
	public float rate;
	
	public double calcSimple(){
		double si = amt * yrs * rate /100;
		return si;
	}
	
	public double calcComp(){
		double ci = amt * Math.pow((1 + rate/100), yrs);
		return ci;
	}

}

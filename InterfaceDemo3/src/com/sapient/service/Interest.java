package com.sapient.service;

public interface Interest extends Basic{
	
	double calcSimple(double amt, int yrs, float rate);
	double calcComp(double amt, int yrs, float rate);
	
}

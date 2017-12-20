package com.sapient.service;

import java.math.BigInteger;

public class Calculator implements Interest,Factorial {
	
	private static Calculator calc = new Calculator();
	
	private Calculator(){
		
	}
	public static Basic getBasic(){
		Basic obj = calc;
		return obj;
	}
	
	public static Interest getInterest(){
		Interest obj = calc;
		return obj;
	}
	
	public static Factorial getFactorial(){
		Factorial obj = calc;
		return obj;
	}

	@Override
	public String convert2Binary(int num) {
		
		return Integer.toBinaryString(num);
	}

	@Override
	public BigInteger findFact(int num) {
		BigInteger fact = BigInteger.ONE;
		for(int i=1;i<=num;i++)
			fact=fact.multiply(BigInteger.valueOf(i));
		return fact;
	}

	@Override
	public double calcSimple(double amt, int yrs, float rate) {
		
		return amt*yrs*rate/100;
	}

	@Override
	public double calcComp(double amt, int yrs, float rate) {
	
		return amt*Math.pow((1 + rate/100), yrs)-amt;
	}
	@Override
	public int doSum(int... a) {
		return Interest.super.doSum(a);
	}
	
	

}

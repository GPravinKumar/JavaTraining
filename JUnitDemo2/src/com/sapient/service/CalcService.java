package com.sapient.service;

public class CalcService {
	
	CalcService() {
		
	}
	
	public double calcSeries(int a,int b,int c){
		return (double)(a+b+c)/2;
	}
	
	public double round2N(double val,int n){
		
		return Math.round(val*Math.pow(10, n))/Math.pow(10, n);
	}

}

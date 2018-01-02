package com.sapient.service;

public class Factory {

	public static CalcService getCalcService(){
		CalcService ser = new CalcService();
		return ser;
	}
	
	public static Palindrome getPalindromeService(){
		Palindrome ser = new Palindrome();
		return ser;
	}
	
	public static String[] getExpected(){
		return new String[]{"surendar","vikas","ram",
							"vp","afsal","kumz",
							"bilal","sridhar","giri",
							"bala","akshay","prince",
							"aravind","asadeep","babu"};
	}
	
	public static EmpService getEmpService(){
		EmpService ser = new EmpService();
		return ser;
	}
}

package com.sapient.exception;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("line1");
		System.out.println("line2");
		try{
			int a=5/2;
			System.out.println(a);
			int b=7/0;
			System.out.println(b);
		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
			System.out.println("catch block");
			ex.printStackTrace();
		}
		System.out.println("line3");
		System.out.println("line4");
		System.out.println("line5");
		System.out.println("line6");

	}

}

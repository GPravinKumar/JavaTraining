package com.sapient.lambda;

public class Calcclient {

	public static void main(String[] args) {
		
		//multiple in line implementation
		
		Icalculator add=(a,b)->{return a+b;};
		Icalculator sub=(int a,int b)->{return a+b;};
		Icalculator mul=(a,b)-> a*b;
		System.out.println(add.docalc(10, 20));
		System.out.println(sub.docalc(20, 10));
		System.out.println(mul.docalc(5, 2));

	}

}

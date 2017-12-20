package com.sapient.client;

import com.sapient.service.Calculator;
import com.sapient.service.Factorial;

public class FactorialClient {

	public static void main(String[] args) {
		Factorial obj = Calculator.getFactorial();
		System.out.println(obj.findFact(5));
		System.out.println(obj.doSum(7,4,5,2));

	}

}

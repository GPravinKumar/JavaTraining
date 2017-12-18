package com.sapient.demo;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No. : ");
		int num = sc.nextInt();
		int i;
		BigInteger f = BigInteger.ONE;
		for(i=1;i<=num;i++)
			f=f.multiply(BigInteger.valueOf(i));
		System.out.println("The Factorial of " + num + " is " + f);
		sc.close();
	}

}

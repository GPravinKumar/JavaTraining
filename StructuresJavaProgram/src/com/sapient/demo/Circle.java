package com.sapient.demo;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of Circle : ");
		double r = sc.nextDouble();
		
		double a = area(r);
		double p = perimeter(r);
		
		System.out.println("Enter the Area of Circle : "+ a);
		System.out.println("Enter the Perimeter of Circle : "+ p);
		
		sc.close();

	}
	public static double area(double r)
	{
		double a = Math.PI * r * r;
		
		return a;
	}
	public static double perimeter(double r)
	{
		double p = 2 * Math.PI * r;
		
		return p;
	}

}

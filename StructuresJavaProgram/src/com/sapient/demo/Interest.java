package com.sapient.demo;

import java.util.Scanner;

public class Interest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Amount : ");
		double p = sc.nextDouble();
		
		System.out.println("Enter The Years : ");
		int y = sc.nextInt();
		
		System.out.println("Enter The Rate : ");
		float r = sc.nextFloat();
		
		double si = calcSimple(p,y,r);
		double ci = calcComp(p,y,r);
		
		System.out.println("The Simple Interest ..: "+ si);
		System.out.println("The Compound Interest : "+ ci);
		
		sc.close();

	}
	public static double calcSimple(double amt,int yrs,float rate){
		
		double si = amt * yrs * rate/100;
		return si;
		
	}
	public static double calcComp(double amt,int yrs,float rate){
		
		double ci = amt * Math.pow((1 + rate/100),yrs);
		return ci;
		
	}
	
}

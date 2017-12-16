package com.sapient.service;

import java.util.Scanner;

import com.sapient.service.Interest;
import com.sapient.util.SapUtil;;

public class InterestClient {
	
	public static void main(String[] args) {
		Interest obj = new Interest();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter The Amount : ");
		double p = sc.nextDouble();
		
		System.out.println("Enter The Years : ");
		int y = sc.nextInt();
		
		System.out.println("Enter The Rate : ");
		float r = sc.nextFloat();
		
		obj.amt=p;
		obj.rate=r;
		obj.yrs=y;
		double si=obj.calcSimple();
		double ci=obj.calcComp();
		System.out.println("The Simple Interest ..: "+ SapUtil.roundUp2Dec(si));
		System.out.println("The Compound Interest : "+ SapUtil.roundUp2Dec(ci));
		
	    sc.close();
	}

}

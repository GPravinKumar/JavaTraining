package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.Interest;

public class ClientInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Interest obj = new Interest();

		try {
			System.out.println("Enter The Amount : ");
			double p = sc.nextDouble();
			obj.setAmt(p);
			
			System.out.println("Enter The Years : ");
			int y = sc.nextInt();
			obj.setYrs(y);
			
			System.out.println("Enter The Rate : ");
			float r = sc.nextFloat();
			obj.setRate(r);
					
			double si = obj.calcSimple();
			double ci = obj.calcComp();
			System.out.println("The Simple Interest ..: " + si);
			System.out.println("The Compound Interest : " + ci);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}

package com.sapient.demo;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int yr;
		System.out.println("Enter the year : ");
		yr = sc.nextInt();
		if(yr%4==0){
			if(yr%100 == 0){
				if(yr%400 == 0)
					System.out.println("The entered year " + yr + "is a LEAP YEAR ");
				else
					System.out.println("The entered year " + yr + "is NOT a LEAP YEAR ");
		    }
			else
				System.out.println("The entered year " + yr + "is a LEAP YEAR ");
		}
		else
			System.out.println("The entered year " + yr + "is NOT aLEAP YEAR ");
		sc.close();

	}

}

package com.sapient.client;

import java.util.Scanner;

import com.sapient.service.MulTable;

public class MulTableClient {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int num = sc.nextInt();
		
		try {
			MulTable obj = new MulTable(num);
			obj.display();
			obj.display(6);
			obj.display(9,18);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
	

}

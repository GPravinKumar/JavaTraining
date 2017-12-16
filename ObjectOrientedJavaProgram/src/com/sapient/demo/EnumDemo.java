package com.sapient.demo;

import java.util.Scanner;

public class EnumDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No. : ");
		int v1 = sc.nextInt();
		System.out.println("Enter 2nd No. : ");
		int v2 = sc.nextInt();
		System.out.println("CHOOSE \n 1-- ADD\n 2-- SUB\n 3-- MUL\n");
		String str = sc.next();

		try {
			Menu menu = Menu.valueOf(str.toUpperCase());
			switch (menu) {
			case ADD:
				System.out.println("ADD " + (v1 + v2));
				break;
			case SUB:
				System.out.println("SUB " + (v1 - v2));
				break;
			case MUL:
				System.out.println("MUL " + v1 * v2);
				break;
			}
		} catch (Exception e) {
			System.out.println("Invalid Option");
		}
		sc.close();
	}

}

enum Menu {
	ADD, SUB, MUL;
}

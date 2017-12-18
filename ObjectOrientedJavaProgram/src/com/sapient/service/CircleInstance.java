package com.sapient.service;

import com.sapient.service.Circle;
import java.util.Scanner;

public class CircleInstance {

	public static void main(String[] args) {

		Circle obj = new Circle();

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Radius of Circle : ");
		double r = sc.nextDouble();

		obj.rad = r;
		double a = obj.area();
		double p = obj.peri();
		System.out.println("The Area of Circle : " + a);
		System.out.println("The Perimeter of Circle : " + p);

		sc.close();

	}

}

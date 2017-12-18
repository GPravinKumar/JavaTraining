package com.sapient.client;

import com.sapient.service.Circle;
import java.util.Scanner;

public class CircleClient {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius of Circle : ");
		double r = sc.nextDouble();

		try {
			Circle obj = new Circle(r);
			double a = obj.area();
			double p = obj.peri();
			System.out.println("The Area of Circle : " + a);
			System.out.println("The Perimeter of Circle : " + p);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		sc.close();

	}

}

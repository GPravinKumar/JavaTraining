package com.sapient.client;

import com.sapient.service.Car;

public class ConstructorDemo {

	public static void main(String[] args) {
		try {
			Car car = new Car(1001, "ford", 1000000);
			car.display();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

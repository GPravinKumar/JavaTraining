package com.sapient.service;

public class Car {
	
	private int carId;
	private String carName;
	private double price;

	public Car(int carId) throws Exception {
		super();
		System.out.println("One Argument Constructor");
		if(carId<1000)
			throw new Exception("carId must be more than or = 1000");
		this.carId = carId;
	}

	public Car(int carId, String carName) throws Exception {
		this(carId);
		System.out.println("Two Argument Constructor");
		if(!carName.matches("[a-z]{3,10}"))//Min 3 charecter and max 10 characters
			throw new Exception("Car name must contain 3-10 alphabets");
		this.carName = carName;
	}

	public Car(int carId, String carName, double price) throws Exception {
		this(carId,carName);
		System.out.println("Three Argument Constructor");
		if(price<100000)
			throw new Exception("Price must be greater than 1 Lakh");
		this.price = price;
	}
	
	public void display(){
		System.out.println(carId+" " + carName + " " + price);
	}
	

}

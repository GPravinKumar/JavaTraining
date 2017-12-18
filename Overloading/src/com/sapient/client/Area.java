package com.sapient.client;

public class Area {
	
	public static int area(int side){
		System.out.println("int arg");
		return side*side;
	}
	public static double area(double side){
		System.out.println("int arg");
		return side*side;
	}
	public static void main(String[] args){
		System.out.println(area(5));
		System.out.println(area(5.2));
	}

}

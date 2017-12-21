package com.sapient.create;

public class Emp {
	
	static{
		System.out.println("I am in Static block");
	}
	public Emp(){
		System.out.println("Emp Constructor");
	}
	public void display(){
		System.out.println("Instance Method dislay");
	}

}

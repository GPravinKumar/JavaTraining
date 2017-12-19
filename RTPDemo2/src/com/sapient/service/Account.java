package com.sapient.service;

public abstract class Account {
	
	private int accId;
	private String accName;
	private double bal;
	

	public Account(int accId, String accName, double bal) {
		super();
		this.accId = accId;
		this.accName = accName;
		this.bal = bal;
	}


	public double getBal() {
		return bal;
	}


	public void setBal(double bal) {
		this.bal = bal;
	}


	public void display(){
		System.out.println("-------------------------------");
		System.out.println("Acc Id " +accId);
		System.out.println("Cust Name " + accName);
		System.out.println("Balance " + bal);
		System.out.println("-------------------------------");
	}
	public abstract String deposit(double amt);

}

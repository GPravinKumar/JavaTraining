package com.sapient.service;

public class Loan extends Account{

	public Loan(int accId, String accName, double bal) {
		super(accId, accName, bal);
	}

	@Override
	public String deposit(double amt) {
		String res = "Loan already cleared";
		double bal=0;
		if(amt < getBal() && getBal()>0){
			bal=getBal() - amt;
			setBal(bal);
			res = "deposited";
		}
		return res;
	}
	

}

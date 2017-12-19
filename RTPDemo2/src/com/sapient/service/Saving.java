package com.sapient.service;

public class Saving extends Account{

	public Saving(int accId, String accName, double bal) {
		super(accId, accName, bal);
		
	}

	@Override
	public String deposit(double amt) {
		double bal = getBal() + amt;
		String res = "not deposited";
		if(amt < 50000){
			setBal(bal);
			res="deposited";
		}
		return res;
	}

}

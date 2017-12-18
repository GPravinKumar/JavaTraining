package com.sapient.service;

public class Interest {
	private double amt;
	private int yrs;
	private float rate;

	public void setAmt(double amt) throws Exception {
		this.amt = amt;
		if (amt < 5000)
			throw new Exception("Amount must be greater than 5000");
	}

	public void setYrs(int yrs) throws Exception {
		this.yrs = yrs;
		if (yrs <= 0 || yrs > 30)
			throw new Exception("Years must be between 0 and ");
	}

	public void setRate(float rate) throws Exception {
		this.rate = rate;
		if (rate <= 0 || rate > 1)
			throw new Exception("Rate of Interest must be between 0 and 1");
	}

	public double calcSimple() {
		double si = amt * yrs * rate;
		return si;
	}

	public double calcComp() {
		double ci = amt * Math.pow((1 + rate), yrs);
		return ci;
	}

}

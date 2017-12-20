package com.sapient.service;

public interface Basic {

	String convert2Binary(int num);
	public default int doSum(int... a) {
		int sum = 0;
		for (int val : a) {
			sum = sum + val;
		}
		return sum;
	}

	public default double doAvg(int... a) {
		int sum = doSum(a);
		double avg = sum / a.length;
		return avg;
	}

}

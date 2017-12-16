package com.sapient.util;

public class SapUtil {

	public static double roundUp2Dec(double val) {
		 val = Math.round((val * 100)/100.0);
		return val;
	}

}

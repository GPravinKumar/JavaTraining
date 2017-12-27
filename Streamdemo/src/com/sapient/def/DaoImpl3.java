package com.sapient.def;

public class DaoImpl3 implements Idao {

	@Override
	public void m1() {
		System.out.println("impl3----m1");
		
	}

	@Override
	public void m2() {
		System.out.println("impl3------m2");
		
	}

	@Override
	public void m3() {
		
		Idao.super.m3();
	}

	
	
}

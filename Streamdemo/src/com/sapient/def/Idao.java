package com.sapient.def;

public interface Idao {

	void m1();
	void m2();
	default void m3()
	{
		System.out.println("defaul m3");
	}
}

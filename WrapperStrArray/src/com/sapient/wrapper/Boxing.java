package com.sapient.wrapper;

public class Boxing {

	public static void main(String[] args) {
		//auto boxing is available only from jdk 1.5
		/*boxing in jdk 1.4
		 *Integer a = new Integer(10);//boxing
		  Integer b = new Integer(20);//boxing
		  int res = a.intValue() + b.intValue();//unboxing
		  Integer c = Integer.valueOf(res);// another type of boxing 
		  System.out.println(c.toString())//toString() is overriden in jdk1.4*/
		Integer a = 10;
		Integer b = 20;
		Integer c = a + b;
		System.out.println(c);

	}

}

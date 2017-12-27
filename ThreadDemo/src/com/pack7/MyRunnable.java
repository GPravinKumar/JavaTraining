package com.pack7;

public class MyRunnable implements Runnable{

	private String name;
	public MyRunnable(String name){
		this.name=name;
	}

	@Override
	public void run() {
		for(int i=1;i<500;i++){
			System.out.println(name+" is executing");
		}
		System.out.println(name+" completed-------------------------------");
	}

}

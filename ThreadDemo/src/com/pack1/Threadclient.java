package com.pack1;

public class Threadclient {

	public static void main(String[] args) {
		
		MyThread t1=new MyThread();
		t1.setName("ram");
		
		MyThread t2=new MyThread();
		t2.setName("tom");
		
		t1.start();
		t2.start();
		t1.start();
		t2.start();
		
		for(int i=1;i<=1000;++i){
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		}

	}

}

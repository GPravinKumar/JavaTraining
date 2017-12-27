package com.pack2;

public class MyRunnable implements Runnable {

	public static void main(String[] args) {
		
		
		
		

	}

	@Override
	public void run() {
		for(int i=1;i<=1000;++i){
			System.out.println(Thread.currentThread().getName()+" "+(i*5));
		}
		
	}

}

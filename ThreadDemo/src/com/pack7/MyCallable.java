package com.pack7;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer>{

	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1;i<=500;++i){
			System.out.println("callable Thread "+i);
			sum=sum+i;
		}
		return sum;
	}
	

}

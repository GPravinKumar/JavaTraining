package com.sapient.demo;

public class VarArgsDemo {
	public static void main(String[] args){
		sum();
	}
	public static int sum(int ...arr){
		System.out.println("Var args called");
		int sum=0;
		for(int i=0; i < arr.length ; ++i)
			sum=sum+arr[i];
		return sum;
	}

}

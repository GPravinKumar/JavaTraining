package com.sapient.demo;

public class VarArgsDemo {
	public static void main(String[] args){
		int res =sum(4,5,6,7);
		System.out.println(res);
	}
	public static int sum(int ...arr){
		System.out.println("Var args called");
		int sum=0;
		for(int i=0; i < arr.length ; ++i)
			sum=sum+arr[i];
		return sum;
	}

}

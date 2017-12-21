package com.sapient.arr;

import java.util.Arrays;
import java.util.Scanner;

public class SearchArray {

	public static void main(String[] args) {
		String[] arr = {"ram","amith","tom","peter","birbal"};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));//displays the array
		
		System.out.println("Length "+ arr.length);//shows no of elements in an array
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the string to search : ");
		String str = scan.next();
		
		int res = Arrays.binarySearch(arr, str);//implements binary search
		if(res >= 0){
			System.out.println("found at "+res+1);
		}
		else
			System.out.println("Not found");
		scan.close();		
	}

}

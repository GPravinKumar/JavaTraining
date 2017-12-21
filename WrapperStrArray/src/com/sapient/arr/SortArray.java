package com.sapient.arr;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {
		String[] arr = new String[4];
		arr[0]="ram";
		arr[1]="sam";
		arr[2]="peter";
		arr[3]="vikas";
		
		System.out.println("Ascending order");
		Arrays.sort(arr);
		for(String str: arr){//Advanced for loop is used only for array and list
			System.out.println(str);
		}
		
		System.out.println("Descending order");
		Arrays.sort(arr, Collections.reverseOrder());
		for(String str: arr){//Advanced for loop is used only for array
			System.out.println(str);
		}
	}

}

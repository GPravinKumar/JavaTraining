package com.sapient.arr;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		String[] arr = {"ram","amith","tom","peter","birbal"};
		String[] arr2 = new String[arr.length];
		String[] arr3 = new String[arr.length];
		System.arraycopy(arr, 0, arr2, 0, 5);
		System.out.println(Arrays.toString(arr2));
		System.arraycopy(arr, 1, arr3, 0, 3);//select the elements to be copied
		System.out.println(Arrays.toString(arr3));
	}

}

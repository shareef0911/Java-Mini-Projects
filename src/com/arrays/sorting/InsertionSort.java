package com.arrays.sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr = {5,3,4,1,2};
		
		for(int i=1 ;i<arr.length;i++) {
			int temp=arr[i];
			int j = i;
			while(j>0 && temp<arr[j-1]) {
				arr[j] =arr[j-1];
				j -= 1;
			}
			arr[j] = temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}

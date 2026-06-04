package com.arrays.sorting;

import java.util.Arrays;

public class PrevNextArray {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50,60};
		
		int[] arr1 = new int[arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			if(i==0) {
				arr1[i]=arr[i]+arr[i+1];
			}else if(i==arr.length-1) {
				arr1[i]=arr[i]+arr[i-1];
			}else {
				arr1[i]=arr[i-1]+arr[i+1];
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}

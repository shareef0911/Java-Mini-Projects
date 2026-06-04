package com.arrays.sorting;

import java.util.Arrays;

public class ProductArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,5};
		int [] product = new int[arr.length];
		for(int i =0;i<arr.length;i++) {
			product[i] = 1;
		}
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				if(i==j) {
					continue;
				}
				product[i] =arr[j] * product[i];
			}
		}
		System.out.println(Arrays.toString(product));
 	}

}

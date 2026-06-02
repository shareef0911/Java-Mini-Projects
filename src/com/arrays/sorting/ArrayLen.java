package com.arrays.sorting;

public class ArrayLen {

	public static void main(String[] args) {
	
		int[] arr1 = {1,2,3,4,5};
		int []arr2 = {1,2,3};
		int[]arr3;
		int size1 = arr1.length;
		int size2 = arr2.length;
		int size =0;
		if(size1>size2) {
			size = size1;
			arr3 = new int[size1];
		}else {
			size = size2;
			arr3 = new int[size2];
		}
		
		for(int i = 0;i<size;i++) {
			if(i<arr2.length) {
				arr3[i] = arr1[i]+arr2[i];
			}else {
			arr3[i]=arr1[i];
			}
		}
		for(int n : arr3) {
			System.out.print(n+" ");
		}
	}

}

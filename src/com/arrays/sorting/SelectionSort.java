package com.arrays.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = { 4, 2, 1, 3 };

		int temp = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i+1 ; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}
			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
		System.out.println("After Sorting !!");
		for(int a :arr) {
			System.out.print(a+" ");
		}
	}

}

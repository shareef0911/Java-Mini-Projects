package com.arrays.sorting;

public class MaxDiffer {

	public static void main(String[] args) {
		int[] arr = { 4, 7, 2, 9, 5, 1, 8 };

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > max) {
					max = arr[i];
					System.out.println("Max"+max);
				}
				if (arr[i] < min) {
					min = arr[i];
					System.out.println("min"+min);
				}
		}
		System.out.println("The Max Difference is : " + (max - min));

	}

}

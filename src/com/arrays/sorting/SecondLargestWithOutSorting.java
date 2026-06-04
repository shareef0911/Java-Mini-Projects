package com.arrays.sorting;

public class SecondLargestWithOutSorting {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 50, 40, 50, 30 };
		int max = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		boolean status = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] != max && arr[i] > secondMax) {
				secondMax = arr[i];
				status = true;
			}
		}
		System.out.println("The Largest Number : " + max);
		if (!status) {
			System.out.println("No Second Largest Number !");
		} else {
			System.out.println("The Second Largest : " + secondMax);
		}

	}

}

package com.arrays.sorting;


public class LargestConsecutiveNumber {

	public static void main(String[] args) {
		int[] arr = { 100, 4, 200, 1, 3, 2, 101, 102 };
		int temp = 0;
		boolean swapped = false;
		int count = 1;
		int maxCount = 1;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
				if (!swapped) {
					break;
				}
			}
		}
		for (int i = 0; i < arr.length - 1; i++) {
			boolean status = false;
			if (arr[i] + 1 == arr[i + 1]) {

				count++;

				status = true;
			}
			if (!status) {
				count = 1;
			}
			if (maxCount < count) {
				maxCount = count;
			}
		}
		System.out.println("The Maximum Consecutive length is : "+maxCount);

	}

}

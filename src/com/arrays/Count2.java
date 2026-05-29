package com.arrays;

public class Count2 {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 22, 222 };
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];
			while (num != 0) {
				if (num % 10 == 2) {
					count++;
				}
				num = num / 10;
			}
		}
		System.out.println("The count is :"+count);
	}

}

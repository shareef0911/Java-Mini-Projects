package com.arrays.sorting;

public class MoveZeros {

	public static void main(String[] args) {
		int[] nums = { 5, 0, 7, 0, 3, 0, 2 };
		int temp = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length - 1 - i; j++) {
				if (nums[j] == 0) {
					temp = nums[j];
					nums[j] = nums[j + 1];
					nums[j + 1] = temp;
				}
			}
		}

		for (int n : nums) {
			System.out.print(n + " ");
		}
	}

}

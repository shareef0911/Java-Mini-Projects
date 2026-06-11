package com.arrays.sorting;

import java.util.Arrays;

public class MoveZeros {

	public static void main(String[] args) {

		int[] nums = { 5, 0, 7, 0, 3, 0, 2 };

		int index = 0;

		// Move all non-zero elements to the front
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				nums[index++] = nums[i];
			}
		}

		// Fill remaining positions with zeros
		while (index < nums.length) {
			nums[index++] = 0;
		}

		System.out.println(Arrays.toString(nums));
	}
}
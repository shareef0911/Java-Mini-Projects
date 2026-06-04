package com.arrays.sorting;

public class MaximumSubArray {

	public static void main(String[] args) {
		int[]arr={3, -2, 5, -1};
		int maxSub =0;
		for(int i =0;i<arr.length;i++) {
			int subValue = arr[i];
			for(int j =i+1;j<arr.length;j++) {
					subValue +=arr[j];
					if(maxSub<subValue) {
						maxSub = subValue;
					}
			}
		}
		System.out.println("The Max Subarray : "+maxSub);
	}

}

package com.arrays.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr = {3,2,6,43,7,8,1};
		
		for(int i = 0;i<arr.length-1;i++) {
			boolean swapped = false;
			for(int j = 0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					arr[j] = arr[j]^arr[j+1];
					arr[j+1] = arr[j]^arr[j+1];
					arr[j] = arr[j]^arr[j+1];
					swapped = true;
				}
			}
			System.out.print("pass "+(i+1)+" : ");
			for(int n : arr) {
				System.out.print(" "+n);
			}
			System.out.println();
			if(!swapped) {
				break;
			}
		}
	}

}

package com.arrays;

public class DuplicateValues {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,2,1,2};
		for(int i = 0;i<arr.length;i++) {
			boolean isPrinted = false;
			int count = 1;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			for(int k = 0;k<arr.length;k++) {
				if(arr[i]==arr[k]) {
					isPrinted = true;
					break;
				}
			}
			if(count > 1 && !isPrinted) {
				System.out.println(arr[i]);
			}
		}

	}

}

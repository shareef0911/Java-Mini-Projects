package com.arrays.sorting;

public class EvenOddArray {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j =0; j<arr[i].length/2 ; j++) {
					int temp=arr[i][j];
					arr[i][j]=arr[i][arr.length-j-1];
					arr[i][arr.length-j-1]=temp;
				}
			}else {
				for(int k = 0;k<arr[i].length;k++) {
					if(i==k) {
						continue;
					}
					arr[i][k] = arr[i][k]*2;
				}
			}
			for(int j = 0;j<arr[i].length;j++) {
				if(i == j) {
					arr[i][j] = arr[i][j]*arr[i][j];
				}
			}
			
			
		}

		        System.out.println("\u0C37\u0C47\u0C15\u0C4D \u0C2C\u0C3E\u0C1C\u0C40 \u0C37\u0C30\u0C40\u0C2B\u0C4D");
		
		for (int[] arr1 : arr) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}

}

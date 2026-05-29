package com.arrays;


public class MulArray {

	public static void main(String[] args) {
		int[][] arr = {{1,2},{3,4}};
		int[][] arr1 = {{5,6},{7,8}};
		
		int[][] arr2 = new int[arr.length][arr.length];
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr.length;j++) {
				arr2[i][j]=arr[i][j]*arr1[i][j];
			}
		}
		for(int[] n : arr2) {
			for(int n1: n) {
				System.out.println(n1);
			}
		}

	}

}

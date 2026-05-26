package com.arrays;

public class Array2D1 {

	public static void main(String[] args) {
		int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
		
		for(int[] arr1 : arr) {
			for(int a : arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

	}

}

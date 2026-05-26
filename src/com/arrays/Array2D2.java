package com.arrays;

public class Array2D2 {

	public static void main(String[] args) {
		int[][] arr = {{10,20,30},{40,50},{60,70,80,90}};
		
		for(int[] arr1 : arr) {
			for(int a:arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}

	}

}

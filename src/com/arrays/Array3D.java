package com.arrays;

public class Array3D {

	public static void main(String[] args) {
		int[][][] arr = new int[3][3][3];
		
		arr[0][0][0]=10;
		arr[0][0][1]=20;
		arr[0][0][2]=30;
		
		arr[0][1][0]=40;
		arr[0][1][1]=50;
		arr[0][1][2]=60;
		
		arr[0][2][0]=70;
		arr[0][2][1]=80;
		arr[0][2][2]=90;
		
		arr[1][0][0]=10;
		arr[1][0][1]=20;
		arr[1][0][2]=30;
		
		arr[1][1][0]=40;
		arr[1][1][1]=50;
		arr[1][1][2]=60;
		
		arr[1][2][0]=70;
		arr[1][2][1]=80;
		arr[1][2][2]=90;
		
		arr[2][0][0]=10;
		arr[2][0][1]=20;
		arr[2][0][2]=30;
		
		arr[2][1][0]=40;
		arr[2][1][1]=50;
		arr[2][1][2]=60;
		
		arr[2][2][0]=70;
		arr[2][2][1]=80;
		arr[2][2][2]=90;
		
		for(int arr1[][]:arr) {
			for(int arr2[]:arr1) {
				for(int n:arr2) {
					System.out.print(n+" ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}

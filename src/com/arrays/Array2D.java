package com.arrays;

import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int [3][3];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0;i< arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				System.out.println(i+","+j+" Enter Value");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int[] arr1: arr) {
			for(int a:arr1) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}

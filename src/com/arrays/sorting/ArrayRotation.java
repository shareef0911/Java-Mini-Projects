package com.arrays.sorting;

import java.util.Scanner;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		Scanner sc = new Scanner(System.in);
		System.out.println("How Many Rotations : ");
		int r = sc.nextInt();
		arrayNotation(arr,r);
		
		sc.close();
		
	}
	
	static void arrayNotation(int[] arr,int r) {
		
		int start = 0;
		int end = arr.length-1;
		
		arrayReverse(arr,start,end);
		arrayReverse(arr,start,r-1);
		arrayReverse(arr,r,end);
		
		for(int n : arr) {
			System.out.print(n+ " ");
		}
		
	}
	static void arrayReverse(int[] arr,int start,int end) {
		int temp =0;
		
		while(end>start) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
	}

}

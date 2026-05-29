package com.arrays;

public class CopyElements {

	public static void main(String[] args) {
		int[] arr = {3,4,5,2,6};
		
		int size = arr.length;
		
		int[] arr1 = new int[size];
		
		for(int i = 0;i<arr.length;i++) {
			
					arr1[i] = arr[i];
		}
		System.out.println("Original Array :");
		for(int a : arr) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("Copy Array : ");
		for(int a : arr1) {
			System.out.print(a+" ");
		}

	}

}

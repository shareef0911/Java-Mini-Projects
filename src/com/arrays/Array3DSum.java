package com.arrays;

public class Array3DSum {
	public static void main(String[] args) {
		int[][][] arr= {{{1,2,3},{4,5,6},{7,8,9}},
				{{1,2,3},{4,5,6},{7,8,9}},
		{{1,2,3},{4,5,6},{7,8,9}}};
		int sum = 0;
		for(int arr1[][]:arr) {
			for(int arr2[]:arr1) {
				for(int n:arr2) {
					System.out.print(n+" ");
					sum += n;
				}
				System.out.println();
				
			}
			System.out.println();
		}
		System.out.println(sum);
	}
}

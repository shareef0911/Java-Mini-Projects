package com.arrays.sorting;

import java.util.Scanner;

public class RotateString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Array Length : ");
		int size = sc.nextInt();
		int[] arr = new int[size]; 
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter element of index "+i+" : " );
			arr[i] = sc.nextInt();
		}
		int frequency = arr.length/3;
		for(int i = 0;i<arr.length;i++) {
			int count = -1;
			boolean isPrinted = false;
			for(int j =0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			if(count >= frequency && !isPrinted) {
				System.out.print(arr[i]);
				isPrinted = true;
			}

		}
		sc.close();
	}

}

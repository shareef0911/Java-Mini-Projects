package com.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Size Of Array : ");
			int size = sc.nextInt();
			
			
			int [] arr = new int[size];
			
			for(int i =0;i<arr.length;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println("Enter Number to Search in Array :");
			int search = sc.nextInt();
			
			for (int i =0;i<arr.length;i++) {
				if(arr[i] == search) {
					System.out.println("Array index is : "+ i);
					return;
				}
			}
			
			sc.close();
		}

	}

}

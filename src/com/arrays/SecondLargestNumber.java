package com.arrays;

import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter a value : ");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 0; i < arr.length; i++) {

		    if(arr[i] > max) {
		        secondLargest = max;
		        max = arr[i];
		    }
		    else if(arr[i] > secondLargest && arr[i] != max) {
		        secondLargest = arr[i];
		    }
		}

		System.out.println("Largest: " + max);
		System.out.println("Second Largest: " + secondLargest);
		sc.close();
	}

}

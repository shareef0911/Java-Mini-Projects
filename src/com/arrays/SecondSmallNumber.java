package com.arrays;

import java.util.Scanner;

public class SecondSmallNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Value :");
			arr[i] = sc.nextInt();
		}
		int min = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for(int i = 0;i<arr.length;i++) {
			if(min > arr[i]) {
				secondMin = min;
				min = arr[i];
			}else if(secondMin > arr[i] && min != arr[i]) {
				secondMin = arr[i];
			}
		}
		System.out.println("The min value : "+min);
		System.out.println("The second min value : "+secondMin);
		sc.close();

	}

}

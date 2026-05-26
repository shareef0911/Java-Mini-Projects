package com.arrays;

import java.util.Scanner;

public class CountPositiveNegative {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Value :");
			arr[i] = sc.nextInt();
		}
		int positiveCount = 0;
		int negitiveCount = 0;
		
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]>0) {
				positiveCount++;
			}
			else if(arr[i]<0) {
				negitiveCount++;
			}
		}
		System.out.println("The Positive Elements : "+positiveCount);
		System.out.println("The Negitive Elements : "+negitiveCount);
		sc.close();

	}

}

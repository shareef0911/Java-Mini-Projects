package com.arrays;

import java.util.Scanner;

public class FindAVG {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();
		int sum =0;
		
		int [] arr = new int[size];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i =0 ;i<arr.length;i++) {
			sum = sum + arr[i];
		}
		int avg = sum/arr.length;
		
		System.out.println("The Average of Elements : "+avg);
		sc.close();
	}

}

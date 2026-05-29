package com.arrays;

import java.util.Scanner;

public class StringArray1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size : ");
		int size = sc.nextInt();
		
		String[] arr = new String[size];
		
		for(int i = 0 ;i<arr.length;i++) {
			System.out.println("Enter a String :");
			arr[i] = sc.next();
		}
		
		for(String a:arr) {
			System.out.print(a+" ");
		}
		sc.close();
	}

}

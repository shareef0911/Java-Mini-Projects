package com.arrays;

import java.util.Scanner;

public class FindFrequency {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Value :");
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Search Number :");
		int num = sc.nextInt();
		int count = 0;
		
		for(int n :arr) {
			if(n == num) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("The Element not Found !!");
		}else {
			System.out.println("The Number "+num+" Repeats : "+count);	
		}
		sc.close();

	}

}

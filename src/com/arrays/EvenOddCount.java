package com.arrays;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();
		int evenCount = 0;
		int oddCount =0;
		
		int [] arr = new int[size];
		
		for(int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int n : arr) {
			if(n%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
		}
		System.out.println("Even Count : "+evenCount);
		System.out.println("Odd Count : "+oddCount);
		sc.close();

	}

}

package com.arrays;

import java.util.Scanner;

public class Duplicates {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Value :");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0;i<arr.length;i++) {
			int count = 1;
			boolean alreadyPrinted =false;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			for(int k=0; k<i; k++){
			    if(arr[k] == arr[i]){
			        alreadyPrinted = true;
			        break;
			    }
			}
			if(count > 1 && !alreadyPrinted) {
				System.out.println("The Duplicate Value : "+arr[i]);
			}
		}
		sc.close();

	}

}

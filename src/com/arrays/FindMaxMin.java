package com.arrays;
import java.util.Scanner;

public class FindMaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Array Size : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for(int i =0;i<arr.length;i++) {
			System.out.print("Enter Value :");
			arr[i] = sc.nextInt();
		}
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int maxCount = 1;
		int minCount = 1;
		for (int i = 0;i<arr.length;i++) {
			if(max == arr[i]) {
				maxCount++;
			}
			if(max < arr[i]) {
				maxCount = 1;
				max = arr[i];
			}
			if(min == arr[i]) {
				minCount++;
			}
			if(min > arr[i]) {
				minCount = 1;
				min = arr[i];
			}
		}
		System.out.println("The Maximun value in Array : "+max);
		System.out.println("The Max value Number of Times Repeated : "+maxCount);
		System.out.println("The MiniMum Value in Array : "+min);
		System.out.println("The Minimum value Number of Times Repeated : "+minCount);
		sc.close();
	}

}

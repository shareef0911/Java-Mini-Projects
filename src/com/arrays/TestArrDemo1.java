package com.arrays;

import java.util.Scanner;

public class TestArrDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Size Of Array : ");
		int size = sc.nextInt();
		
		int[] ages = new int[size];
		for(int i =0;i<ages.length;i++) {
			System.out.println("Enter Person"+i+" : ");
			ages[i]=sc.nextInt();
		}
		
		for(int i =0;i<ages.length;i++) {
			System.out.print(" " +ages[i]);
		}
		sc.close();

	}

}

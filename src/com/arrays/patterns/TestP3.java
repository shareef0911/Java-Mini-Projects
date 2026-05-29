package com.arrays.patterns;

import java.util.Scanner;

public class TestP3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		for(int i = 1;i<=num;i++) {
			for(int j = num;j>i;j--) {
				System.out.print(" ");
			}
			for(int k = 1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();

	}

}

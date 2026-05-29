package com.arrays.patterns;

import java.util.Scanner;

public class TestP5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = num; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 2; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = num; k >= i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}

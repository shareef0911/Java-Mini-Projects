package com.logicalStatementts.loops;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Where to Start : ");
		int start = sc.nextInt();
		System.out.println("Enter where to end :");
		int end = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 2 ;i<=end ; i++) {
			int n3 = n1 + n2;
			if(n3 > end) {
				break;
			}
			if(n3 >= start) {
				System.out.print(" "+n3);
			}
			
			n1 = n2;
			n2 = n3;
			
		}

		sc.close();
	}

}

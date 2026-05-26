package com.logicalStatementts.loops;

import java.util.Scanner;

public class FibonacciNth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Which  Position you want leave with (0,1) position: ");
		int start = sc.nextInt();
		int n1 = 0;
		int n2 = 1;
		
		for (int i = 2 ;i<=start ; i++) {
			int n3 = n1 + n2;
			if((start-1) == i) {
				System.out.println(start + " Position is : "+ n3);
				break;
			}
			n1 = n2;
			n2 = n3;
			
		}
		sc.close();
	}

}

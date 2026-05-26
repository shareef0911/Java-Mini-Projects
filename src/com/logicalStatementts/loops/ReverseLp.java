package com.logicalStatementts.loops;

import java.util.Scanner;

public class ReverseLp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number where you want start");
		int num = sc.nextInt();
		
		System.out.println("Enter Number where you want End");
		int num1 = sc.nextInt();
		
		for (int i = num ;i >=num1;i-- ) {
			System.out.print(i+" ");
		}
		sc.close();
	}

}

package com.logicalStatementts.loops;

import java.util.Scanner;

public class BinaryToDecimal {
	
	static void binaryToDecimal(int num) {
		int r = 0;
		int sum = 0;
		int count = 0;
		while(num > 0) {
			r = num%10;
			num = num/10;
		
			if(r == 1) {
			sum = sum + (int)(Math.pow(2, count++));
			}
		}
		System.out.println("The give Number Decimal is : "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Binary Number :");
		int num = sc.nextInt();
		
		binaryToDecimal(num);
		sc.close();

	}

}

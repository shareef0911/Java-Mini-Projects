package com.logicalStatementts.loops;

import java.util.Scanner;

public class DigitSum {
	static int digitSum(int n) {
		int r = 0;
		int sum = 0;
		
		while(n>0){
			r = n%10;
			n = n/10;
			
			sum = sum + r;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int sum = digitSum(num);
		System.out.println("Sum of Digits in Given Number is : "+sum);
		sc.close();
		
	}

}

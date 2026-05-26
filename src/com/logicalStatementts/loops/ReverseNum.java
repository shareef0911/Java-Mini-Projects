package com.logicalStatementts.loops;

import java.util.Scanner;

public class ReverseNum {
	
	static int reverseNum(int num) {
		int r = 0;
		int  sum = 0;
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum*10 + r;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		
		int rev = reverseNum(num);
		
		System.out.println("The Reverse Number is Given Number is : "+rev);
		sc.close();

	}

}

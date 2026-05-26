package com.logicalStatementts.loops;

import java.util.Scanner;

public class DecimalToBinary {
	static void decimalToBinary(int num) {
		int r =0;
		String bn = "";
		while(num>0) {
			r = num%2;
			num=num/2;
			bn = r +bn;
		}
		System.out.println("Given number Binary is : "+bn);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number to conver into Binary :");
		int num = sc.nextInt();
		
		decimalToBinary(num);
		sc.close();

	}

}

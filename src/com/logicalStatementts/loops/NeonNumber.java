package com.logicalStatementts.loops;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check Neon Number or Not :");
		int num = sc.nextInt();
		System.out.println("Your Enter Number is : "+num);
		
		int squareNum = num * num;
		
		System.out.println("Your Enter number Square is : "+squareNum);
		int sum =0;
		
		while(squareNum>0) {
			int r =0;
			r = squareNum%10;
			squareNum = squareNum/10;
			sum = sum + r;
		}
		if(sum==num) {
			System.out.println("It is Neon Number :"+num);
		}else {
			System.out.println("It is Not a Neon Number :"+num);
		}
		sc.close();

	}

}

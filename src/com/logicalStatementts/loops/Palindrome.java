package com.logicalStatementts.loops;

import java.util.Scanner;

public class Palindrome {
	
	static boolean isPalindrome(int num) {
		boolean status = false;
		int r = 0;
		int sum = 0;
		int temp = num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum*10 + r;
		}
		if(sum == temp) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number to check is Palindrome or  Not : ");
		int num = sc.nextInt();
		
		boolean status = isPalindrome(num);
		
		if(status) {
			System.out.println("The Given Number is Palindrome !!");
		}else {
			System.out.println("The Given Number is Not Palindrome !!");
		}
		sc.close();
	}

}

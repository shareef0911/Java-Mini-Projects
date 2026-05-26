package com.logicalStatementts.loops;

import java.util.Scanner;

public class PerfectNumber {
	
	static boolean isPerfect(int num) {
		boolean status = false;
		int sum = 0;
		for (int i =1 ;i<=num/2;i++) {
			if(num%i==0) {
				sum = sum + i;
			}
		}
		if(sum == num) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		boolean status = isPerfect(num);
		
		if (status) {
			System.out.println("Enter Number is Perfect : "+num);
		}else {
			System.out.println("Enter Number is not Perfect : "+num);
		}
		sc.close();
	}

}

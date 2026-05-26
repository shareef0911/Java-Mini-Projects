package com.logicalStatementts.loops;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static boolean isArmstrong(int num) {
		boolean status = false;
		int r = 0;
		int sum = 0;
		int temp = num;
		int count = 0;
		int temp1 = temp;
		
		while(num>0) {
			num = num/10;
			count++;
		}
		while(temp>0) {
		    r = temp%10;
		    temp = temp/10;
		    sum =sum + (int) Math.pow(r,count);
		}
		if(sum==temp1) {
			return true;
		}
		return status;

	}
//	static void m1() {
//		System.out.println("Hello");
//		return;
//	}

	public static void main(String[] args) {
//		m1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to Check is Armstrong or not : ");
		int num = sc.nextInt();
		
		boolean status = isArmstrong(num);
		
		if(status) {
			System.out.println("The Given Number is Armstrong Number !!");
		}else {
			System.out.println("The Given Number is not a Armstrong Number !!");

		}
		sc.close();
	}

}

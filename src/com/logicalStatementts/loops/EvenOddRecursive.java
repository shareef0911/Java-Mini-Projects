package com.logicalStatementts.loops;

import java.util.Scanner;

public class EvenOddRecursive {
	
	static int isEven(int num) {
		
		if(num==1) {
			System.out.println("odd");
			return 1;
		}
		if(num==0) {
			System.out.println("even");
			return 0;
		}
		return isEven(num-2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		 isEven(num);
		
//		if(status == 0) {
//			System.out.println("The Given Number is Even !!");
//		}
//		else {
//			System.out.println("The Given Number is Odd !!");
//		}
		sc.close();

	}

}

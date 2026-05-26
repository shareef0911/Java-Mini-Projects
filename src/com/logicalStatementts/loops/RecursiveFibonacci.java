package com.logicalStatementts.loops;

import java.util.Scanner;

public class RecursiveFibonacci {
	static void findFibonacci(int num,int n1,int n2) {
		
		if(num<=0) {
			return;

		}
		int n3 =n1 + n2;
		n1 = n2;
		n2 = n3;
		System.out.print(" "+n3);
		findFibonacci(num-1,n1,n2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num = sc.nextInt();
		//default values is 0,1
		int n1 = 0;
		int n2 = 1;
		System.out.print(n1 + " "+n2);
		findFibonacci(num,n1,n2);
		
//		for(int i = 0;i<=num;i++) {
//			int n3 = n1 + n2;
//			System.out.print(" "+n3);
//			n1 = n2;
//			n2 = n3;
//		}
		sc.close();
		

	}

}

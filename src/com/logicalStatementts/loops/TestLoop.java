package com.logicalStatementts.loops;

import java.util.Scanner;

public class TestLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Where you want start : ");
		float start = sc.nextFloat();
		System.out.println("Enter Where you want End : ");
		int end = sc.nextInt();
		int sum =0;
		float i = 0;
		
		for (i=start;i<end;i++) {
			if (i%2==0) {
				sum += i;
				
			}
		}
		System.out.println("Sum of Even : "+sum);
		sc.close();
	}

}

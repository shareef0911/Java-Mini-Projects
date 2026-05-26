package com.logicalStatementts.loops;

import java.util.Scanner;

public class FactorialWithFor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Wanted Factorial :");
		int fact1 = sc.nextInt();
		int fact = 1;
		
		for(int i =1 ; i<=fact1 ; i++) {
			fact = fact * i;
		}
		
		System.out.println("Factorial is : "+fact);
		sc.close();
	}

}

package com.logicalStatementts.loops;

import java.util.Scanner;

public class FactorialRecursion {
	
	static int findFact(int num) {
		if(num == 1) {
			return 1;
		}
		return num*findFact(num-1);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int num = sc.nextInt();
		
		int fact = findFact(num);
		
		System.out.println("Factorial is : "+fact);
		sc.close();

	}

}

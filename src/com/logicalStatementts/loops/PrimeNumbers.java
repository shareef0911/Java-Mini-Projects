package com.logicalStatementts.loops;

import java.util.Scanner;

public class PrimeNumbers {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0 || n == 1) {
			return false;
		}
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Where to Start :");
		int start = sc.nextInt();
		System.out.println("Enter Where to End :");
		int end = sc.nextInt();
		
		for ( int i = 2;i<end;i++) {
			if(isPrime(i)) {
				if(i>start) {
					System.out.print(" "+i);
				}

			}
			
		}
		sc.close();
	}

}

package com.logicalStatementts.loops;

import java.util.Scanner;

public class AlternativPrime {
	static boolean isPrime(int n) {
		boolean status = true;
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i = 2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
			break;
			
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to End : ");
		int end = sc.nextInt();
		int count = 0;
		for(int i = 0;i<=end;i++) {
			
			if(isPrime(i)) {
				count +=1;
				if(count%2 ==0) {
					continue;
				}
				System.out.print(i+" ");
			}
			
			
		}
		sc.close();

	}

}

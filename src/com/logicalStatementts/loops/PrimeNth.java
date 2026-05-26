package com.logicalStatementts.loops;

import java.util.Scanner;

public class PrimeNth {
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
//		System.out.println("Enter Where to End :");
//		int end = sc.nextInt();
		System.out.println("which position you want :");
		int position = sc.nextInt();
		int count = 0;
		int i = 0;
		
		while( position != count) {
			
			
			if(isPrime(i)) {
//				System.out.print(" "+i);
				count += 1;
			}
			i += 1;
			if(position == count) {
				System.out.println("Your Position prime number is  : "+ (i-1));
				break;
			}
			
		}
		sc.close();
	}

}

package com.logicalStatementts.loops;

import java.util.Scanner;

public class TestLsDemo1 {
	static boolean isPrime(int num) {
		boolean status = true;
		if(num == 0 || num == 1) {
			return false;
		}
		for(int i = 2;i<num;i++) {
			if(num%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many prime Numbers you want : ");
		int range = sc.nextInt();
		
		for (int i = 2;i<=range;i++) {
			if(isPrime(i)) {
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}

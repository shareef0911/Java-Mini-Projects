package com.logicalStatementts.loops;

import java.util.Scanner;

public class PrimeRecursive {
	static boolean isPrime(int num,int i) {
		if(num<2) {
			return false;
		}
		if(i*i >num) {
			return true;
		}
		if(num%i==0) {
			return false;
		}
		return isPrime(num,i+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		if(isPrime(num,2)) {
			System.out.println("The Number is Prime");
		}else {
			System.out.println("The Number is not Prime");

		}
		sc.close();

	}

}

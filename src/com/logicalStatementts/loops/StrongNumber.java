package com.logicalStatementts.loops;

import java.util.Scanner;

public class StrongNumber {
	static int findFact(int num) {
		if(num == 1) {
			return 1;
		}
		return num*findFact(num-1);
	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter a Number to check Strong Number or Not :");
		int num = sc.nextInt();
		int sum =0;
		int r = 0;
		int temp = num;
		
		while(num>0) {
			r = num%10;
			num = num/10;
			sum = sum + findFact(r);
		}
		if(sum==temp) {
			System.out.println("The given Number is Strong : "+temp);
		}else {
			System.out.println("The given Number is not a Strong Number : "+temp);
		}
		sc.close();

	}

}

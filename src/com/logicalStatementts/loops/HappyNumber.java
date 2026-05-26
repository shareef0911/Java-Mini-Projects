package com.logicalStatementts.loops;

import java.util.Scanner;

public class HappyNumber {
	static int  happy(int num) {
		int sum =0;
		int r =0;
		while(num>0) {
			r = num%10;
			num = num/10;
			
			sum = sum + (r*r);
		}
		if(sum == 1) {
			return 1;
		}
		else if(sum>=0 && sum<10) {
			return sum;
		}
		return happy(sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to check is Happy Number or not : ");
		int num = sc.nextInt();
		
		
		
		
		num  = happy(num);
		if(num == 1) {
			System.out.println("The Given Number is Happy Number : "+num);
		}else {
			System.out.println("The Given Number is Not Happy Number : "+num);
		}
		sc.close();

	}

}

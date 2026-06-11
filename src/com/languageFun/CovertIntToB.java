package com.languageFun;

import java.util.Scanner;
public class CovertIntToB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number");
		Scanner sc = new Scanner(System.in);
		long l = sc.nextInt();
		while(l/2 == 0) {
			long l2 = l%2;
			System.out.println("Remainder : "+l2);
		}
		sc.close();
	}

}

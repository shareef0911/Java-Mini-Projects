package com.logicalStatementts.loops;

import java.util.Scanner;

public class EvenOddCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  Where You Want Start : ");
		int start = sc.nextInt();
		System.out.println("Enter  Where You Want End : ");
		int end = sc.nextInt();
		
		int evenCount = 0;
		int oddCount = 0;
		for (int i = start ; i<end;i++) {
			if(i%2==0) {
				evenCount += 1;
			}
			else {
				oddCount += 1;
			}
		}
		System.out.println("Even Count : "+evenCount);
		System.out.println("Odd Count : "+oddCount);
		sc.close();
	}

}

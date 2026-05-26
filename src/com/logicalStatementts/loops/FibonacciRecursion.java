package com.logicalStatementts.loops;


public class FibonacciRecursion {
	static int n1 = 0;
	static int n2 = 1;
	static int end = 50;
	static int fibonacci(int n3) {
		n1 = n2;
		n2 = n3;
		if(n3 > end) {
			return 0;
		}
		System.out.print(" "+n3);
		return fibonacci(n3 = n1 + n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		fibonacci(1);

	}

}

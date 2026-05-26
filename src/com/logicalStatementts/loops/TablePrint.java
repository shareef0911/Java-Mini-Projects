package com.logicalStatementts.loops;

import java.util.Scanner;

public class TablePrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Table Print : ");
		int whichTable = sc.nextInt();
		System.out.println("Where to Want : ");
		int whereTo = sc.nextInt();
		
		for (int i =1;i<=whereTo;i++) {
			System.out.println(whichTable + " X " + i + " = "+(whichTable*i));
		}
		sc.close();

	}

}

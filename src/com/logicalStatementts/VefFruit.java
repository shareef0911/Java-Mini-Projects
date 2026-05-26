package com.logicalStatementts;

import java.util.Scanner;

public class VefFruit {
	static int bill ;
	String selctedItem;
	static void bill() {
		System.out.println("Your bill is : "+bill);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String choice ;
		do {
			System.out.println("Choose  What you Want");
			System.out.println("1.Pizza");
			System.out.println("2.Burger");
			System.out.println("3.Drinks");
			int pick = sc.nextInt();
			switch(pick) {
			case 1 -> {
				System.out.println("Enter What you Want  in Pizza");
				System.out.println("Choose  What you Want");
				System.out.println("1.Chicken");
				System.out.println("2.Veg");
				int pick1 = sc.nextInt();
				switch(pick1) {
				case 1 ->{
					System.out.println("You slected the Chicken Pizza !!");
					bill += 150;
					bill();
				}
				case 2 -> {
					System.out.println("You Selected The veg Pizza");
					bill += 100;
					bill();
				}
				default -> System.out.println("Invalid");
				}
			}
			case 2 ->{
				System.out.println("Enter What you Want  in Burger");
				System.out.println("Choose  What you Want");
				System.out.println("1.veg");
				System.out.println("2.Cheese");
				int pick1 = sc.nextInt();
				switch(pick1) {
				case 1 -> {
					System.out.println("You Selected The veg Burger");
					bill += 70;
					bill();
				}
				case 2 ->{
					System.out.println("You selected cheese Burger");
					bill += 50;
					bill();
				}
				default -> System.out.println("Invalid");
				}
			}
			case 3 ->{
				System.out.println("Enter What you Want  in Burger");
				System.out.println("Choose  What you Want");
				System.out.println("1.Coke");
				System.out.println("2.Juice");
				int pick1 = sc.nextInt();
				switch(pick1) {
				case 1 -> {
					System.out.println("You slected coke !!");
					bill += 50;
					bill();
				}
				case 2 -> {
					System.out.println("You selceted Juice !!");
					bill += 45;
					bill();
				}
				default -> System.out.println("Invalid");
				}
			}
			default -> System.out.println("Invalid");
			}
			System.out.println("Do want continue y/n");
			choice = sc.next();
			
			
		}while(choice.equalsIgnoreCase("y"));
		bill();
		sc.close();

	}

}

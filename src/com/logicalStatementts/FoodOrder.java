package com.logicalStatementts;

import java.util.Scanner;

public class FoodOrder {

	    static int totalBill = 0;
	    static String invoice = "";

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        String choice;

	        do {

	            System.out.println("\nChoose What You Want");
	            System.out.println("1. Pizza");
	            System.out.println("2. Burger");
	            System.out.println("3. Drinks");

	            int pick = sc.nextInt();

	            String selectedItem = "";
	            int itemPrice = 0;
	            int quantity = 0;

	            switch (pick) {

	                case 1 -> {
	                    System.out.println("Choose Pizza");
	                    System.out.println("1. Chicken Pizza");
	                    System.out.println("2. Veg Pizza");

	                    int subPick = sc.nextInt();
	                    System.out.println("No Of Quantity : ");
	                    quantity = sc.nextInt();

	                    itemPrice = switch (subPick) {
	                        case 1 -> {
	                            selectedItem = "Chicken Pizza";
	                            yield 150;
	                        }
	                        case 2 -> {
	                            selectedItem = "Veg Pizza";
	                            yield 100;
	                        }
	                        default -> {
	                            selectedItem = "Invalid Item";
	                            yield 0;
	                        }
	                    };
	                }

	                case 2 -> {
	                    System.out.println("Choose Burger");
	                    System.out.println("1. Veg Burger");
	                    System.out.println("2. Cheese Burger");

	                    int subPick = sc.nextInt();
	                    System.out.println("No Of Quantity : ");
	                    quantity = sc.nextInt();

	                    itemPrice = switch (subPick) {
	                        case 1 -> {
	                            selectedItem = "Veg Burger";
	                            yield 70;
	                        }
	                        case 2 -> {
	                            selectedItem = "Cheese Burger";
	                            yield 50;
	                        }
	                        default -> {
	                            selectedItem = "Invalid Item";
	                            yield 0;
	                        }
	                    };
	                }

	                case 3 -> {
	                    System.out.println("Choose Drinks");
	                    System.out.println("1. Coke");
	                    System.out.println("2. Juice");

	                    int subPick = sc.nextInt();
	                    System.out.println("No Of Quantity : ");
	                    quantity = sc.nextInt();

	                    itemPrice = switch (subPick) {
	                        case 1 -> {
	                            selectedItem = "Coke";
	                            yield 50;
	                        }
	                        case 2 -> {
	                            selectedItem = "Juice";
	                            yield 45;
	                        }
	                        default -> {
	                            selectedItem = "Invalid Item";
	                            yield 0;
	                        }
	                    };
	                }

	                default -> {
	                    System.out.println("Invalid Selection");
	                }
	            }

	            if (itemPrice > 0) {
	            	if(quantity >0) {
	                totalBill += itemPrice * quantity;

	                invoice += selectedItem + " --> ₹" + itemPrice + "    "+quantity+"\n";

	                System.out.println("Added: " + selectedItem);
	                System.out.println("Current Bill: ₹" + totalBill);
	            	}
	            }

	            System.out.println("Do you want to continue? (y/n)");
	            choice = sc.next();

	        } while (choice.equalsIgnoreCase("y"));

	        System.out.println("\n========= INVOICE =========");
	        System.out.println(invoice);
	        System.out.println("---------------------------");
	        System.out.println("Total Bill: ₹" + totalBill);
	        System.out.println("===========================");

	        sc.close();
	    }
	}


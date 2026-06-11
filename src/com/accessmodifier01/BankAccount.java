package com.accessmodifier01;

import java.util.Scanner;

//1.Write a Java program to create a BankAccount class using encapsulation.
//Declare balance as a private variable and access it using getter and setter methods.
//Create deposit and withdraw methods with proper validations.
//Do not allow negative balance or withdrawal beyond available balance.
class Account{
	private static double balance1;
	private String accountHolder;
	public static double getBalance() {
		return balance1;
	}
	public static void setBalance(double balance) {
		balance1 = balance;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
}
public class BankAccount extends Account{
	
	public static void deposit(double amount) {
		if(amount>0) {
			setBalance(getBalance() + amount);
		}else {
			System.out.println("Your Entered Negative Amount");
		}
		System.out.println("Your Account Balance : "+getBalance());
    }
    public static void withdraw(double amount) {
    		if(amount<getBalance()) {
    			setBalance(getBalance() - amount);
    		}else {
    			System.out.println("Insufficient Balance");
    		}
        
    }
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		byte choice;
		do {
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.CheckBalance");
			System.out.println("4.Exit");
			
			System.out.println("Choose Choice : ");
			choice = sc.nextByte();
			
			switch(choice) {
			case 1 -> {
				System.out.println("Enter Deposit Amount :");
				double amount = sc.nextDouble();
				deposit(amount);
			}
			case 2 ->{
				System.out.println("Enter Withdraw Amount :");
				double amount = sc.nextDouble();
				withdraw(amount);
			}
			case 3 ->{
				System.out.println("Your Account Balance : "+getBalance());
			}
			case 4 -> System.exit(0);
			default -> System.out.println("Invalid Choice !!");
			}

		}while(choice != 4);
		sc.close();
		
	}

}

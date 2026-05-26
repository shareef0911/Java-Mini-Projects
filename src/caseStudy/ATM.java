package caseStudy;

import java.util.Scanner;

public class ATM {
	static double accBalance = 5000;
	
	static void deposit(long deposit) {
		accBalance = accBalance+ deposit;
		System.out.println("Balance : "+accBalance);
	}
	
	static void withdraw(long withdraw) {
		if(withdraw> accBalance) {
			System.out.println("Insufficeint Balance !!");
		}else{
			accBalance = accBalance - withdraw;
			System.out.println("Balance : "+accBalance);
		}
	}
	static void balanceCheck() {
		System.out.println("Balance : "+accBalance);
	}
	static void miniStatement(long accNo) {
		System.out.println("Account  Number : "+accNo);
		System.out.println("Balance : "+accBalance);
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Account Number : ");
		long accNo = sc.nextLong();
		int otp = 0;
		int otp1 = 0;
		String yn = "";
		for(int i = 0;i<6;i++) {
			otp1 =(int) (Math.random()*10);
			
			otp = otp *10 + otp1;
		}
		System.out.println(otp);
		
		System.out.println("Enter OTP : ");
		int enterOTP = sc.nextInt();
		
		if(enterOTP == otp) {
			do {
				System.out.println("1.Deposit");
				System.out.println("2.Withdraw");
				System.out.println("3.Check Balance ");
				System.out.println("4.Ministatement");
				System.out.println("Enter Your Option : ");
				int choice = sc.nextInt();
				
				switch(choice) {
				case 1 ->{
					System.out.println("Enter Deposit Amount : ");
					long deposit = sc.nextLong();
					deposit(deposit);
				}
				case 2 ->{
					System.out.println("Enter Withdraw Amount : ");
					long withdraw = sc.nextLong();
					withdraw(withdraw);
				}
				case 3 ->{
					balanceCheck();
				}
				case 4 ->{
					miniStatement(accNo);
				}
				default -> System.out.println("Invalid Transaction !!");
				}
				System.out.println("Do You Want Continue (Y/N) ?");
				yn = sc.next();
				
			}while(yn.equalsIgnoreCase("y"));
		}else {
		    System.out.println("Invalid OTP");
		}
		
		sc.close();
	}

}

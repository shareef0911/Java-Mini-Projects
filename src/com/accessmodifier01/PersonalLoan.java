package com.accessmodifier01;

import java.util.Scanner;

public class PersonalLoan {
	static Scanner sc = new Scanner(System.in);

	double getSalary() {
		System.out.println("Enter your Salary per Month : ");
		double salary = sc.nextDouble();
		return salary;
	}

	int getAge() {
		System.out.println("Enter your Age : ");
		int age = sc.nextInt();
		return age;
	}

	int getCibilScore() {
		System.out.println("Enter your Cibil Score : ");
		int cibil = sc.nextInt();
		return cibil;
	}
	boolean isValidAadhar(String aadhar) {
		return aadhar.matches("\\d{12}");
	}
	boolean isValidPan(String pan) {
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}
	boolean isValidNumber(String number) {
		return number.matches("[6-9][0-9]{9}");
	}
	double roiInfo(int cibil) {
		double roi = 15.0;
		if (cibil >= 300 && cibil <= 599) {
			System.out.println("Poor Credit Score - Loan approval may be difficult. Focus on improving your credit history");
			roi = 15.0;
		} else if (cibil >= 600 && cibil <= 699) {
			System.out.println("Fair Credit Score - You may qualify for loans, but better credit can unlock improved offers");
			roi = 12.0;
		} else if (cibil >= 700 && cibil <= 749) {
			System.out.println("Good Credit Score - Strong credit profile with a good chance of loan approval");
			roi = 10.0;
		} else if (cibil >= 750 && cibil <= 900) {
			System.out.println("Excellent Credit Score - Outstanding creditworthiness. Eligible for the best loan and credit card offers");
			roi = 8.0;
		} else {
			System.err.println("Invalid Cibil Score !!");
		}
		return roi;
	}
	String getAddressInfo() {
		String address = "";
		System.out.println("Enter Your Flat NO : ");
		String flat = sc.next();
		System.out.println("Enter Building Name : ");
		sc.nextLine(); // clear buffer
		String building = sc.nextLine();
		System.out.println("Enter Street Name : ");
		String street = sc.next();
		System.out.println("Enter City Name : ");
		String city = sc.next();
		System.out.println("Enter PinCode : ");
		long pin = sc.nextLong();
		
		address = "Flat No :"+flat+", Building Name :"+building+", Street :"+street+", City :"+city+", PinCode :"+pin;
		return address;
	}
	void getDocInfo(String address) {
		System.out.println("Confirm Your address Details !");
		System.out.println(address);
		System.err.println("your Personal Loan Documents are Verified!");
		System.err.println("Thank you");
	}
	public static void main(String[] args) {
		PersonalLoan pl = new PersonalLoan();
		double salary =  pl.getSalary();
		int cibil = pl.getCibilScore();
		int age = pl.getAge();
		
		System.out.println("Enter Aadhar Number : ");
		String aadhar = sc.next();
		
		System.out.println("Enter PAN Number : ");
		String pan = sc.next();
		
		System.out.println("Enter Phone Number : ");
		String number = sc.next();
		if(salary >= 30000 && (cibil>=300  && cibil <= 900) && (age >= 25 && age <= 60)) {
			System.out.println("================================");
			System.out.println("PERSONAL LOAN APPROVAL SUMMARY");
			System.out.println("================================");
			System.out.println("Salary       : " + salary);
			System.out.println("Age          : " + age);
			System.out.println("CIBIL Score  : " + cibil);
			System.err.println("ROI          : " + pl.roiInfo(cibil) + "%");
			System.out.println("Status       : APPROVED");
			System.out.println("================================");
			if(pl.isValidAadhar(aadhar) && pl.isValidNumber(number) && pl.isValidPan(pan)) {
				System.out.println("Enter Your Address Details !!");
				String address = pl.getAddressInfo();
				pl.getDocInfo(address);
			}else {
				System.err.println("Invalid Doucments");
			}
			
			
		}else {
			System.err.println("Your Apllication is Rejected !");
		}
	}

}

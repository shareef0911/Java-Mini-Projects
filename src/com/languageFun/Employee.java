
package com.languageFun;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		System.out.println("Enter Basic Salary : ");
		Scanner sc = new Scanner(System.in);
		int salary = sc.nextInt();
		
		System.out.println("Enter PF percentage : ");
		int pf_p = sc.nextInt();
		
		System.out.println("Enter Daily Allowance : ");
		int d_a = sc.nextInt();
		
		System.out.println("Enter Working Days : ");
		int d_w = sc.nextInt();
		
		System.out.println("Basic Salary : "+salary);
		
		int pf = (salary/100)*pf_p;
		int allowance = d_a*d_w;
		
		int net_salary = (salary + allowance)-pf;
		
		System.out.println("PF : "+pf);
		System.out.println("Allowance : "+allowance);
		System.out.println("net_salary : "+net_salary);
		sc.close();
		
	}

}

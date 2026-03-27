package com.javainfo;
//20-3-2026 lab Experiment
public class Lab3 {
	 //in class level variable to create with static variable for all instance method 
	 //use one object to all instance methods at class level
	//in static method we can call instance method with object and static method directly we call
	static{
		Lab3 l1 = new Lab3();
		l1.method3();
		//System.out.println("Calling Method-1");
	}
	//in instance method we can call both instance & static methods directly
	//it is a single thread execution
	static void method2() {
		System.out.println("Calling static Method-2");
		
	}
	void method3() {
		System.out.println("Calling instance Method-1");
		method4();
	}
	void method4() {
		System.out.println("Calling instance Method-2");
		method5();
	}
	static void method5() {
		System.out.println("Calling static Method-1");
		method2();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generat
		System.out.println("-------------Main Method Started!!-----------");
		
		System.out.println("-------------Main Method Ended!!-----------");
		

	}

}


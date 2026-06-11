package com.javainfo;

public class Lab {
	 static Lab m = new Lab();//in class level variable to create with static variable for all instance method 
	 //use one object to all instance methods at class level
	//in static method we can call instance method with object and static method directly we call
	static void method1(){
		System.out.println("Calling Method-1");
		method2();
	}
	//in instance method we can call both instance & static methods directly
	//it is a single thread execution
	static void method2() {
		System.out.println("Calling Method-2");
		m.method3();
	}
	void method3() {
		System.out.println("Calling Method-3");
		method4();
	}
	void method4() {
		System.out.println("Calling Method-4");
		method5();
	}
	void method5() {
		System.out.println("Calling Method-5");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generat
		System.out.println("-------------Main Method Started!!-----------");
		method1();
		System.out.println("-------------Main Method Ended!!-----------");
		

	}

}

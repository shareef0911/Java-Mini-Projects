package com.javainfo;

//20-3-26 class Program
//24-3-26 lab Assignment types of Garbage Collection

class A{
	B b;
}
class B{
	A a;
}
class Test{
//	int x = 100;
//	String name = "Shareef";
	
	
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalized method Called!!");
	}
	// object in method 
	void method() {
		Test t6 = new Test();
	}
}

public class Lab2 {


	public static void main(String[] args) {
		System.out.println("----------Main Method Start-------------");
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
		new Test();//anonmous 
//		System.out.println(t1);
//		System.out.println(t2);
		t1 = null;// nullfying
		t2 = null;
		t3 = t2; //re-assigning
		
		//isalated of isolation
		A obj1 = new A();
		B obj2 = new B();
		
		obj1.b = obj2;
		obj2.a = obj1;
		
		obj1 = null;
		obj2 = null;
		
		System.out.println(t1);
		System.out.println(t2);
		
		System.gc();
		System.out.println(t3);
		
		System.out.println("----------Main Method End-------------");
		
		

	}

}

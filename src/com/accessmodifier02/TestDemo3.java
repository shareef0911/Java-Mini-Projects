package com.accessmodifier02;

import com.accessmodifier01.TestDemo1;

// import the class
//extends the parent class
//object with create with sub class for accessing protected 

public class TestDemo3 extends TestDemo1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		acessing default varaibles and methods in within package
		//TestDemo1 t1 = new TestDemo1();//public
//		t1.method2();
		
		TestDemo3 t2 = new TestDemo3();//object with create with sub class
		t2.name2 = "Baji";
		t2.age2 = 22;
		t2.method3();
		
		TestDemo1 t3 = new TestDemo1();
		t3.name3 = "Baji";
		t3.age3 = 22;
		t3.method4();

	}

}

package com.languageFun;

import java.math.BigInteger;
import java.math.BigDecimal;
public class LongNumber {
	
	BigInteger b1 =new BigInteger("8765432123456");
	BigInteger b2 =new BigInteger("1234567987654");
	
	BigDecimal d1 = new BigDecimal("876543218765.2345678234567");
	BigDecimal d2 = new BigDecimal("234567898765432123456.98765432346");
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongNumber l = new LongNumber();
	//	BigInteger b3 = l.b1.add(l.b2);
		System.out.println("BigInteger Function: ");
		System.out.println("Addition : "+l.b1.add(l.b2));
		System.out.println("Subtraction : "+ l.b1.subtract(l.b2));
		System.out.println("Multiplication : "+l.b1.multiply(l.b2));
		System.out.println("Division : "+ l.b1.divide(l.b2));
		System.out.println("Modulas : "+l.b1.mod(l.b2));
		
		System.out.println("BigDecimal Function: ");
		System.out.println("Addition : "+l.d1.add(l.d2));
		System.out.println("Subtraction : "+ l.d1.subtract(l.d2));
		System.out.println("Multiplication : "+l.d1.multiply(l.d2));
//		System.out.println("Division : "+ l.d1.divide(l.d2));
//		System.out.println("Modulas : "+l.d1.m));
		
//		BigInteger and BigDecimal 
//		The method and(BigInteger) in the type BigInteger is not applicable for the arguments (BigDecimal)
//		String s1 = "12345678909876";
//		String s2 = "987654323456789";
//		BigInteger b4 = s1.
	}

}

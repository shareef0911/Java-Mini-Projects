package com.languageFun;

//import java.util.Scanner;

public class Test1 {

	static int count = 0;
	static {
		count++;
	}
	static {
		count = count+2;
	}
	static {
		count = count+3;
	}
	static {
		count = count+4;
	}
	static {
		count = count+5;
	}
	static {
		count = count+6;
	}
	static {
		count = count+7;
	}
	static {
		count = count+8;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count);
	}

}

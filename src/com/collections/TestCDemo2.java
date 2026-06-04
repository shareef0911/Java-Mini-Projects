package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestCDemo2 {

	public static void main(String[] args) {
		List<String> boys = new ArrayList<>();
		
		boys.add("Baji");
		boys.add("Lalith");
		boys.add("Harsha");
		boys.add("Hemanth");
		boys.add("Ravi");
		boys.add("Goutham");
		boys.add("Tharun");
		boys.add("Prasad");
		boys.add("Daniel");
		
		List<String> girls = new ArrayList<>();
		
		girls.add("danels");
		girls.add("mia");
		girls.add("mrunal");
		girls.add("priyanka");
		girls.add("kajal");
		System.out.println(girls);
		
		List<String> student = new ArrayList<>();
		student.addAll(boys);
		
		System.out.println(student);
		student.addAll(4,girls);
		System.out.println(student.set(4,"Bhurj"));
		student.remove(student.indexOf("kajal"));
		List<String> subLi = new ArrayList<>();
		subLi = student.subList(0, 5);
		System.out.println(subLi);
		subLi.set(2,"Hemanth");
		System.out.println(subLi);
		System.out.println(student);
	}

}

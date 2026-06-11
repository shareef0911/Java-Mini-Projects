package com.collections;

import java.util.HashSet;

public class TestDemo7 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		HashSet<Integer> set1 = new HashSet<>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		set1.add(30);
		set1.add(40);
		set1.add(60);
		set1.add(70);
		
		for(Integer i : set) {
			if(set1.contains(i)) {
				System.out.println(i);
			}
		}

	}

}

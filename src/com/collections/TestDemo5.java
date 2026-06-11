package com.collections;

import java.util.HashSet;

public class TestDemo5 {

	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(2);
		set.add(18);
		set.add(34);
		set.add(50);
		set.add(66);
		set.add(82);
		set.add(98);
		set.add(114);
		System.out.println(set);
		System.out.println(set.hashCode());
	}
}

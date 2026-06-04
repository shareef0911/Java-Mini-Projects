package com.collections;

import java.util.HashSet;

import java.util.Collection;
public class TestCDemo1 {

	public static void main(String[] args) {
		Collection<Integer> c1 = new HashSet<>();
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		c1.add(5);
		c1.add(6);
		c1.add(7);
		c1.add(8);
		c1.add(1);
		c1.add(2);
		c1.add(3);
		c1.add(4);
		System.out.println(c1.contains(4));
		System.out.println(c1.hashCode());
		System.out.println(c1.isEmpty());
		for(int n : c1) {
			System.out.print(n);
		}
		System.out.println(c1.remove(6));
		System.out.println(c1.size());
	for(int n : c1) {
		System.out.print(n);
	}
	System.out.println(c1.removeAll(c1));
	for(int n : c1) {
		System.out.print(n);
	}
	}
}

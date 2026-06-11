package com.collections;
import java.util.List;
import java.util.LinkedList;
public class TestDemo3 {
	public static void main(String[] args) {
		
		List<Integer> ll = new LinkedList<>();
		
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(2);
		ll.add(1);
		
		if(ll.equals(ll.reversed())) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}

}

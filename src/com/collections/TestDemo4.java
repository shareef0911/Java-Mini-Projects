package com.collections;

import java.util.LinkedList;
import java.util.List;

public class TestDemo4 {

	public static void main(String[] args) {
		List<Integer> ll = new LinkedList<>();
		
		ll.add(1);
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
		ll.add(5);
		ll.add(7);
		
		for(int i = ll.getFirst();i<=ll.getLast();i++) {
			if(ll.contains(i)){
				continue;
			}else {
				System.out.println(i);
			}
		}

	}

}

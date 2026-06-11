package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestDemo6 {

	public static void main(String[] args) {
		
		List<Integer> li = new ArrayList<>();
		li.add(2);
		li.add(7);
		li.add(11);
		li.add(15);
		li.add(3);
		li.add(6);
		
		int target = 9;
		
		for(int i =0 ;i<li.size()-1;i++) {
			if(li.get(i)+li.get(i+1)==target) {
				System.out.print("("+li.get(i)+","+li.get(i+1)+") ");
			}
		}

	}

}

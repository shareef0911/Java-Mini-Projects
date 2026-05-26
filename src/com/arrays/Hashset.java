package com.arrays;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,1,2,1,2,1,2};
		
		HashSet<Integer> se = new HashSet<>();
		
		
		for(int a : arr) {
			boolean status = false;
			if(!se.add(a)) {
				status = true;
			}else if(!status) {
				System.out.print(a+" ");
			}
		}
	}

}

package com.collections;

//2.Write a Java program to find the first non-repeating element
//in an ArrayList<Integer> using HashSet and Iterator. 
//If a non-repeating element exists, print the first one; otherwise, display an appropriate message.
//input : 20, 20, 30, 20, 40, 30, 50
//output : First Non-Repeating Element: 40

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestDemo9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> li = new ArrayList<>();
		
		li.add(20);
		li.add(20);
		li.add(30);
		li.add(20);
		li.add(40);
		li.add(30);
		
		HashSet<Integer> set1 = new HashSet<>();
		
		HashSet<Integer> set2 = new HashSet<>();
		
		for(int n : li) {
			if(set1.contains(n)) {
				set2.add(n);
			}else {
				set1.add(n);
			}
		}
		List <Integer> cop = new CopyOnWriteArrayList<>();
		for(int n : set1) {
			cop.add(n);
		}
		
		for(Integer n : cop) {
			if(set2.contains(n)) {
				cop.remove(n);
			}
		}
		
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(cop);
	}

}

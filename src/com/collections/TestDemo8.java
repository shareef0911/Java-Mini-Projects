package com.collections;

//1.Write a Java program to replace all elements at even indexes (0, 2, 4, ...) with 0
//in an ArrayList<Integer> using an Iterator for traversal. Print the updated list after modification.
//input : 10, 20, 30, 40, 50, 60
//output : Updated List: [0, 20, 0, 40, 0, 60]

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TestDemo8 {

	public static void main(String[] args) {
		
		List <Integer> li = new CopyOnWriteArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		
		Iterator<Integer> itr = li.iterator();
		int temp = 0;
		while(itr.hasNext()) {
			int num = itr.next();
			if(temp%2==0) {
				num = 0;
				li.set(temp, num);
			}
			temp++;
			
		}
		System.out.println(li);
	}
	
}

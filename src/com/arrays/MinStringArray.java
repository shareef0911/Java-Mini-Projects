package com.arrays;

public class MinStringArray {

	public static void main(String[] args) {
		String[] s = { "Harsha", "lalith","kuchu karthik naidu", "ravi", "bajishareef" };
		int maxLength = s[0].length();
		for (int i = 0; i < s.length-1; i++) {
			if (maxLength > s[i].length()) {
				maxLength = s[i].length();
			}
		}
		
		System.out.println(maxLength);

	}

}

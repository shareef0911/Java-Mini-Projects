package com.arrays;

public class MaxStringArray {

	public static void main(String[] args) {
		String[] s = { "Harsha", "lalith","kuchu karthik naidu", "ravi", "bajishareef" };
		String maxLength = s[0];
		for (int i = 0; i < s.length-1; i++) {
			if (maxLength.length() < s[i].length()) {
				maxLength = s[i];
			}
		}
		
		System.out.println(maxLength);

	}

}

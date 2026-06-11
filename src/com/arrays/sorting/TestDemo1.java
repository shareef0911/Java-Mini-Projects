package com.arrays.sorting;

public class TestDemo1 {

	public static void main(String[] args) {
		int[] arr = {50,40,30,20,10};
		
		int max =Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		boolean noSecondMax = false;
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax = max;
				max = arr[i];
			}
			if(arr[i]>secondMax && arr[i]<max) {
				secondMax = arr[i];
			}
			
			if(secondMax == Integer.MIN_VALUE) {
				noSecondMax = true;
			}else {
				noSecondMax = false;
			}
		}
		if(noSecondMax) {
			System.out.println("Second Largest does not exist");
		}else {
			System.out.println("Largest : "+max);
			System.out.println("Second Largest : "+secondMax);
		}
	}

}

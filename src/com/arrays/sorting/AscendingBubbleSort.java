package com.arrays.sorting;

public class AscendingBubbleSort {

	public static void main(String[] args) {
		int[] arr = {67,4,5,6,7,9,8,45};
		int temp = 0;
		
		System.out.println("Before Bubble Sort ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		for(int i = 0;i<arr.length-1;i++) {
			boolean swapped = false;
			for(int j =0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					swapped=true;
				}
			}
			if(!swapped) {
				break;
			}
		}
		System.out.println();
		System.out.println("After Bubble Sorting ");
		for(int a:arr) {
			System.out.print(a+" ");
		}

	}

}

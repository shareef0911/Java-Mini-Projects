package com.arrays;

public class TargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,8,4,5,3,7,5,6};
		int target = 10;
		for(int i =0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					System.out.println(arr[i]+","+arr[j]);
				}
				if(j == arr.length-1) {
					break;
				}
			}
		}

	}

}

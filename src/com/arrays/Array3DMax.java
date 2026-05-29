package com.arrays;

public class Array3DMax {
	public static void main(String[] args) {
		int[][][] arr= {{{1,2,3},{4,5,6},{7,8,9}},
				{{1,2,3},{4,5,6},{7,8,9}},
		{{1,2,3},{4,5,6},{7,8,9}}};
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++) {
			for(int j = 0;j<arr[i].length;j++) {
				for(int k = 0;k<arr[j].length;k++) {
					if(arr[i][j][k]>max) {
						max = arr[i][j][k];
					}
				}
				
			}
			
		}
		System.out.println(max);
	}

}

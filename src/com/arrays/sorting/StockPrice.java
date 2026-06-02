package com.arrays.sorting;

public class StockPrice {

	public static void main(String[] args) {
		int[] stockPrice = {120,125,118,130,128,135,132};
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		int count = 0;
		
		for(int i = 0;i<stockPrice.length;i++) {
			if(stockPrice[i]>max) {
				max = stockPrice[i];
			}
			if(stockPrice[i]<min) {
				min = stockPrice[i];
			}
			sum += stockPrice[i];
			if(i<stockPrice.length-2 && stockPrice[i]<stockPrice[i+1]) {
				count++;
			}
		}
		System.out.println("Max StockPrice : "+max);
		System.out.println("Min StockPrice : "+min);
		System.out.println("Average Stock Price : "+(sum/stockPrice.length));
		System.out.println("Total Stock Price : "+sum);
		System.out.println("Count : "+count);
		
		

	}

}

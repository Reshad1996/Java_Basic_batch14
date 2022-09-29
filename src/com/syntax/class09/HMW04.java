package com.syntax.class09;

public class HMW04 {

	public static void main(String[] args) {
		
		// From an array of integer elements find the largest number.
    
		int[] num = {100,4000,10,20,-100,30,4000};
		int largestnum = 0;
		
		for (int i=1 ; i<num.length ; i++ ) {
			if (num[i]>largestnum) {
			  largestnum=num[i];
			}
			
		}
		System.out.println(largestnum);
		
		System.out.println("--------------------------------------------");
		
		// Second way
		
		largestnum = num[0];
		
		for (int n:num) {
			if (n>largestnum) {
				largestnum=n;
			}
		}
		System.out.println(largestnum);
	}

}

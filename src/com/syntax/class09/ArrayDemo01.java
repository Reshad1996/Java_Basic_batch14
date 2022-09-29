package com.syntax.class09;

public class ArrayDemo01 {

	public static void main(String[] args) {
	
		int[] arr = new int[4];
		//store elements inside an array
		
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		
		// accessing elements from the array
		
		System.out.println(arr[2]);
		System.out.println(arr[1]+arr[3]);
		
		//Let's create an arary and store you classmate
		
		String[] names = new String[5];
    
		names[0] = "moska";
		names[1] = "reshad";
		names[2] = "haris";
		names[3] = "kawsar";
		names[4] = "sarah";
		
		System.out.println("Hello "+names[4]);
	}

}

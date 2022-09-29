package com.syntax.class13;

import java.util.Arrays;

public class StringDemo04 {

	public static void main(String[] args) {
		
		String str = "Batch 14 is really good";
		String[] arr = str.split(" ");
		System.out.println(Arrays.toString(arr));
		System.out.println(arr[4]);
		
		
		String str2 = "Today is sunday. Sunday is good. Java is also good";
		String[] arr2 = str2.split("[.]");
        System.out.println(Arrays.toString(arr2));
        System.out.println();
	}

}

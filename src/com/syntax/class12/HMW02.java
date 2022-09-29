package com.syntax.class12;

public class HMW02 {

	public static void main(String[] args) {
	
	   // Create a String and print it in reverse order (Sunday → yadnuS).
       //___________________________________________________________________
		
		String week = "Sunday";
		
		for(int i=week.length()-1 ; i>=0; i--) {
			System.out.print(week.charAt(i));
		}
		
		System.out.println("------------------------------------------");
		
		char[] charArr = week.toCharArray();
		
		for (int i=charArr.length-1 ; i>=0 ; i++) {
		System.out.print(charArr[i]);
		}
	}

}

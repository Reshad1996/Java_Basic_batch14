package com.syntax.class09;

public class AllElementsFromArray {

	public static void main(String[] args) {
		
		String[] icecream = {"vanila","choclate","pistashio","Kulfi"};
		
		//System.out.println(icecream[0]);
		//System.out.println(icecream[1]);
		
		// How to get all the values ?

		for (int i=0 ; i<icecream.length ; i++) {
			System.out.println(icecream[i]);
		}
		
		System.out.println("-------------------------------");
		
		char[] letters = {'A','B','C','D'};
		
		for (int i=0 ; i<letters.length ; i++) {
			System.out.print(letters[i]+" ");
			
			
		}
	}

}

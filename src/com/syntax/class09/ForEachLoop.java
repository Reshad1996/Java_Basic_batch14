package com.syntax.class09;

public class ForEachLoop {

	public static void main(String[] args) {
		
		// only when we deal with arrays or collection
		// we can use for each loop, enhanced for loop advance for loop
		
		String[] icecream = {"vanila","choclate","pistashio","Kulfi","mango"};
		
		for (String flavor :icecream) {
			
			System.out.println(flavor);
		}
       System.out.println("-------------------------------------------");
       
       char[] letters = {'A','B','C','D'};
       
       for (char letter:letters) {
    	   
    	   System.out.print(letter+" ");
       }
       System.out.println("-------------------------------------------");
       
       // get all elements using regular for loop
       int[] numbers = {12,56,345,1,0,9};
       
       for (int i=0 ; i<numbers.length ; i++) {
    	   System.out.print(numbers[i]+" ");
       }
       
       System.out.println();
       
       // get all the values using enhanced for loop
       // this loop always loops only 1 way : from start to end 
       
       for (int num:numbers) {
    	   System.out.print(num+" ");
       }
       
	}

}

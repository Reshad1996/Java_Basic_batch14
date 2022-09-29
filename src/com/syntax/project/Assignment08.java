package com.syntax.project;

public class Assignment08 {

	public static void main(String[] args) {
		
		// Write a Java Program to print the first 10 numbers of Fibonacci series.
		// 0 1 1 2 3 5 8 13 21
		//________________________________________________________________________

        int previous = 0;
        int currentNumber = 1;
        int nextNum = 0;
        
        System.out.print(previous+" ");
        System.out.print(currentNumber+" ");
        
        for (int i=0 ; i<8 ; i++) {
        	nextNum = previous+currentNumber;
        	System.out.print(nextNum+" ");
        	previous = currentNumber;
        	currentNumber = nextNum;
        	
        }
	}

}

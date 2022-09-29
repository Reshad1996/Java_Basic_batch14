package com.syntax.review01;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter the number");
	    int i = scan.nextInt();
	    
	    while (i!=10) {
	    	System.out.println(i);
	    	i = scan.nextInt();
	    }
	    
	    // while (i!=10) { System.out.println(i); i = scan.nextInt(); }

	    // all the loops are interchangeable but sometimes using the on type for loop
	    // can make 
	}

}

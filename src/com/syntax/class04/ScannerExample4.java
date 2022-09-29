package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample4 {

	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		  System.out.println("Did you solve Repl Assignment please enter true or fasle");
		
		  boolean solveAnyRepls = scanner.nextBoolean();
		  
		    if(solveAnyRepls) {
		    	System.out.println("How many Repls you solved");
		    	int noOfReplsSolved = scanner.nextInt();
		    	
		    	if (noOfReplsSolved>=17) {
		    		System.out.println("you are doing great");
		    	}
		    	else if(noOfReplsSolved>10) {
		    		System.out.println("you are doing ok Please complete them as soon as possible");
		    	}
		    	else {
		    		System.out.println("you should solve some repls");
		    	}
		    }
		    else {
		    	System.out.println("They are very important to learn java please solve them");
		    }
   }

}

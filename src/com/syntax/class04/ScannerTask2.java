package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		
		//Create a Java program and store values of mortgage rate and mortgage price.
		//First, program should check if rate is higher than 4.5
		//user will not buy a house, otherwise user will consider buying. 
		//Once user decides to buy a house, if price of the house is larger than 200000 
		//than user will take a loan, otherwise user will pay cash.
	    //______________________________________________________________________________
		Scanner house = new Scanner(System.in);
		    System.out.println("What is you mortage rate ? ");
		    
		    double rate = house.nextDouble();
		    
		    if (rate>4.5) {
		    	System.out.println("You can't buy this house");
		    }
		    else if (rate<4.5) {
		    	System.out.println("You can buy this house ");
		    }
		    
	    	System.out.println("What is price of this house ?");
		    int price = house.nextInt();
		    
		    if (price>200000) {
		    	System.out.println("You have to take a loan ");
		    }
		    else {
		    	System.out.println("You can pau all cash");
		    }
		    
	}

}

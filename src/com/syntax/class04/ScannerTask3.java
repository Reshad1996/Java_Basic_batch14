package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		
		//You are a loan specialist and you need to ask user what is the amount of loan 
		//is needed. If loan is less or equal to 200,000 then you would 
		//lend the money otherwise you would reject the client.
        //______________________________________________________________________________
		
		Scanner broker = new Scanner(System.in);
		   System.out.println("What is the amount of loan is needed ?");
		   
		   double loan = broker.nextDouble();
		   
		   if(loan<=200000) {
			   System.out.println("You are approve for the loan ");
		   }
		   else {
			   System.out.println("Sorry we cant approve your loan");
		   }
		   
	}

}

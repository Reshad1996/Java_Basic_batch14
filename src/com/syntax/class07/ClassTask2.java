package com.syntax.class07;

import java.util.Scanner;

public class ClassTask2 {

	public static void main(String[] args) {
		
		// create a secret number and let user guess the secret numbner
		// once user guessed your secret number --> program says you won!
		
		 int secretNumber = 7;
		 
		 Scanner scan = new Scanner(System.in);
		 int input;
		 
		 do {
		 System.out.println("Guess the number");
         input = scan.nextInt();
         
	     }while (input != secretNumber );
		 System.out.println("You won!");
	}

}

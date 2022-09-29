package com.syntax.class04;

import java.util.Scanner;

public class InputFromKeyBoard {
	
	public static void main(String[] args) {
		
		/* Scanner is a class that helps us take the input from the keyboard
		 * it contains many different smaller modules called methods that can help
		 * us take Strings boolean basically all types of data from the keyboard
		 */
		
		Scanner input = new Scanner(System.in);
		// A message will be displayed to the user on the console to enter his/her name
		
        System.out.println("please enter your name");
        // Activates the java program to take the input from the keyboard and store
        // it inside the name variable 
		
		String name = input.next();
		// prints whatever name user enter on the keyboard on the console
		
		System.out.println("hello " + name + "don't be confused");
	}

}

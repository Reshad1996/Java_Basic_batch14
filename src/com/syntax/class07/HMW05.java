package com.syntax.class07;

import java.util.Scanner;

public class HMW05 {

	public static void main(String[] args) {
		
		//Prompt the user to ask the name 3 times and print "Good afternoon +name...

		Scanner scan= new Scanner(System.in);
		System.out.println("What is your name ?");		
		
		for ( int i=1 ; i<=3 ; i++) {
			String name = scan.nextLine();
			
		System.out.println("Good afternoon "+name);
		System.out.println("____________________________________________");
		}
	}

}

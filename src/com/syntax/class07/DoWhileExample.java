package com.syntax.class07;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		String answer;
		
		do {
		System.out.println("Did you get a job");
	    answer = scan.nextLine();
	   }while (!answer.equals("yes"));
		System.out.println("Congrats");
	}

}
